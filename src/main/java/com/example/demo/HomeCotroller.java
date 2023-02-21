package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/home/*") // WEB-INF/view/home/밑에 파일들 찾기 위해 .jsp 되게끔 yml파일에 설정해 놓음
public class HomeCotroller {
    @GetMapping("index")
    public String index() {
        log.info("index 호출");
        return "home/index";
    }
}
