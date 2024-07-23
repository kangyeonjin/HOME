package com.yeonjin.practice_viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class ResolverController {

    @GetMapping("string")
    public String stringReturning(Model model){
        model.addAttribute("forwardMesage","문자열로 뷰이름반환");
        return "result";
    }

    @GetMapping("string-redirect")
    public String stringRedirect(){
        System.out.println("리다이렉트 호출");
        return "redirect:/";
    }

    @GetMapping("string-redirect-attr")
    public String stringRedirectFlashAttribute(RedirectAttributes rttr){
        rttr.addFlashAttribute("flashMessage1", "리다이렉트 attr사용하여 리다이렉트");
        return "redirect:/";
    }


}
