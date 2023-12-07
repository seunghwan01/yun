var MainSwiper = new Swiper('.main_swiper .swiper-container', {
    effect: "fade",
    autoplay: {
        delay: 2000,
        disableOnInteraction: false,
    },
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },
    pagination: {
        el: '.swiper-pagination',
        type: 'bullets',
        clickable: true,
    },
    loop: true,
});

var SubSwiper = new Swiper('.sub_swiper .swiper-container', {
    effect: "fade",
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },
    pagination: {
        el: '.swiper-pagination',
        type: 'bullets',
        clickable: true,
    },
    loop: true,
});

MainSwiper.controller.control = SubSwiper;
SubSwiper.controller.control = MainSwiper;


document.addEventListener("DOMContentLoaded", function () {

    var mySwiper2 = new Swiper('.swiper-container2', {
        slidesPerView: 4,
        slidesPerGroup: 4,
        loop: true,
        observer: true,
        observeParents: true,
        spaceBetween: 24,
        autoplay: {
            delay: 2000,
            disableOnInteraction: false,
        },
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },
        breakpoints: {
            1280: {
                slidesPerView: 4,
                slidesPerGroup: 2,
            },
            820: {
                slidesPerView: 3,
                slidesPerGroup: 1,
            },
            550: {
                slidesPerView: 2,
                slidesPerGroup: 1,
            },
            100: {
                slidesPerView: 1,
                slidesPerGroup: 1,
            },
        }
    });

});
