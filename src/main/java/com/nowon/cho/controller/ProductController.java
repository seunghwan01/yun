package com.nowon.cho.controller;

import java.io.Console;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3Client;
import com.nowon.cho.domain.dto.MainBannerImgDTO;
import com.nowon.cho.domain.dto.ProductImgSaveDTO;
import com.nowon.cho.domain.dto.ProductSaveDTO;
import com.nowon.cho.domain.entity.MainBannerImgEntity;
import com.nowon.cho.domain.entity.MainBannerImgEntityRepository;
import com.nowon.cho.domain.entity.ProductEntity;
import com.nowon.cho.domain.entity.ProductEntityRepository;
import com.nowon.cho.domain.entity.ProductImgEntity;
import com.nowon.cho.domain.entity.ProductImgEntityRepository;
import com.nowon.cho.utils.FileUploadUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
public class ProductController {
	
	private final AmazonS3Client client;//생성자 DI
	
	@Value("${cloud.aws.s3.bucket}")
	private String bucketName;
	@Value("${cloud.aws.s3.upload-temp}")
	private String tempPath;
	@Value("${cloud.aws.s3.upload-path}")
	private String uploadPath;
	@Value("${cloud.aws.s3.main-banner-temp}")
	private String bannerTempPath;
	@Value("${cloud.aws.s3.main-banner-path}")
	private String bannerUploadPath;
	
	@ResponseBody
	@PostMapping("/temp-upload")
	public Map<String, String> tempUpload(MultipartFile goodsImg) {
		return FileUploadUtil.s3Upload(client, bucketName, tempPath, goodsImg);
	}
	@ResponseBody
	@PostMapping("/banner-temp-upload")
	public Map<String, String> bannerTempUpload(MultipartFile bannerImgs) {
		return FileUploadUtil.s3Upload(client, bucketName, bannerTempPath, bannerImgs);
	}
	
	private final ProductEntityRepository proRepo;
	private final ProductImgEntityRepository imgRepo;
	@PostMapping("/productList")
	public String save(ProductSaveDTO goods, ProductImgSaveDTO goodsImgs) {
		int length=goodsImgs.getOrgName().length;
		//temp->images 파일이동
		ProductEntity proEnt=proRepo.save(goods.toEntity());
		for(int i=0; i<length; i++) {
			String uploadKey=uploadPath+FileUploadUtil.newFileNameByNanotime(goodsImgs.getOrgName()[i]);
			FileUploadUtil.s3CopyAndDelete(client, bucketName, goodsImgs.getTempKey()[i], uploadKey);
			
			imgRepo.save(ProductImgEntity.builder()
					.bucketKey(uploadKey)
					.orgNmae(goodsImgs.getOrgName()[i])
					.product(proEnt)
					.checkImg(goodsImgs.getCheckImg()[i])
					.build());
		}
		return "redirect:/productList";
	}
	private final MainBannerImgEntityRepository bannerRepo;
	@PostMapping("/mainBannerList")
	public String save2(MainBannerImgDTO bannerImgs) {
		//temp->images 파일이동
		log.debug(bannerImgs.getOrgName());
		System.out.println(bannerImgs.getOrgName());
		System.out.println(bannerImgs.getUrlLink());
		System.out.println(bannerImgs.getTitle());
		String uploadKey= bannerUploadPath+FileUploadUtil.newFileNameByNanotime(bannerImgs.getOrgName());
		FileUploadUtil.s3CopyAndDelete(client, bucketName, bannerImgs.getTempKey(), uploadKey);
		bannerRepo.save(MainBannerImgEntity.builder()
				.bucketKey(uploadKey)
				.isEnable(true)
				.orderNumber(bannerImgs.getOrderNumber())
				.title(bannerImgs.getTitle())
				.sub(bannerImgs.getSub())
				.UrlLink(bannerImgs.getUrlLink())
				.orgName(bannerImgs.getOrgName())
				.build());
		
		return "redirect:/mainBannerList";
	}

}
