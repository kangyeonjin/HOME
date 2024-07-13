package com.yeonjin.home0713;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodMappingTestController {

    @RequestMapping("/menu/regist")
    public String registMenu(Model model){

        model.addAttribute("message", "신규 메뉴 등록용 핸들러 메소드 호출");
        return "page/mappingResult";
    }

    @RequestMapping(value = "/menu/modify", method = RequestMethod.GET)
    public String modifyMenu(Model model){
        model.addAttribute("message", "get방식의 메뉴 수정용 헨들러 호출");
        return "page/mappingResult";
    }

    @RequestMapping(value = "/menu/modify", method = RequestMethod.POST)
    public String modifyMenuAll(Model model){
        model.addAttribute("message", "post방식의 메뉴 수정용 헨들러 호출");
        return "page/mappingResult";
    }

    @GetMapping("/menu/delete")
    public String getDeleteMenu(Model model){
        model.addAttribute("message", "get방식의 삭제용핸들러 메소드 호출함");
        return "page/mappingResult";
    }

    @PostMapping("/menu/delete")
    public String postDeleteMenu(Model model){
        model.addAttribute("message", "post 방식의 삭제용 핸들러 메소드 호출");
        return "page/mappingResult";
    }

}
