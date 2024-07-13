package com.yeonjin.home0713;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order/*")
public class ClassMappingTestController {

    @GetMapping("regist")
    public String registOrder(Model model){

        model.addAttribute("message", "GET방식의 주문등록용 핸들러메소드 호출함");
        return "page/mappingResult";

    }

    @RequestMapping(value = {"modify","delete"},method = RequestMethod.POST)
    public String modifyAndDelete(Model model){
        model.addAttribute("message", "post방식의 주문정보수정과 주문정보삭제공통처리용");
        return "page/mappingResult";
    }

    @GetMapping("/detail/{orderNo}")
    public String selectOrderDetail(Model model, @PathVariable int orderNo){
        model.addAttribute("message", orderNo + "번 주문상세 내용 조회용 핸들러 메소드");
        return "page/mappingResult";
    }

}
