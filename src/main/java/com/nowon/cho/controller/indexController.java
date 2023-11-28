package com.nowon.cho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class indexController {

        @GetMapping("/sub/necklace")
        public String necklace() {
            return "/sub/necklace";
        }
        @GetMapping("sub/ring")
        public String ring() {
            return "sub/ring";
        }
        @GetMapping("sub/best")
        public String best() {
            return "sub/best";
        }
        @GetMapping("sub/earring")
        public String earring() {
            return "sub/earring";
        }
        @GetMapping("sub/bracelet")
        public String bracelet() {
            return "sub/bracelet";
        }
    }
