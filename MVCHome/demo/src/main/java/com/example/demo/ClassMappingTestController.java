package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order/*")
public class ClassMappingTestController {

    @GetMapping("regist")
    public String registOrder(Model model){

        model.addAttribute("message", "GET방식의 주문등록용 핸들러");
        return "page/mappingResult";

    }




}
