//package com.nowon.cho.controller;
//
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.amazonaws.services.s3.AmazonS3Client;
//import com.amazonaws.services.s3.model.CannedAccessControlList;
//import com.amazonaws.services.s3.model.PutObjectRequest;
//import com.nowon.cho.utils.FileUploadUtil;
//
//import lombok.RequiredArgsConstructor;
//
//@Controller
//@RequiredArgsConstructor
//public class ProfileImgController {
//	
//	private final AmazonS3Client client;
//	
//	@Value("${cloud.aws.s3.bucket}")
//	private String bucketName;
//	@Value("${cloud.aws.s3.profile-temp}")
//	private String profileTempPath;
//	@Value("${cloud.aws.s3.profile-path}")
//	private String profileUploadPath;
//	
//	@ResponseBody
//	@PostMapping("/temp-upload")
//	public Map<String, String> tempUpload(MultipartFile goodsImg) {
//		return FileUploadUtil.s3Upload(client, bucketName, profileTempPath, goodsImg);
//	}
//}
