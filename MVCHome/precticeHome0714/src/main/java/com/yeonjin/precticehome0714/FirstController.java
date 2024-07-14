package com.yeonjin.precticehome0714;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpSession;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import javax.print.DocFlavor;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

@Controller
@RequestMapping("/first/*")
@SessionAttributes("id")
public class FirstController {

    @GetMapping("regist")
    public void regist(){}

    @PostMapping("regist")
    public String registMenu(Model model, WebRequest request){

        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));

        System.out.println(name);
        System.out.println(price);

        String message = name+""+price;

        System.out.println(message);

        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    @GetMapping("modify")
    public void modify(){

    }

    @PostMapping("modify")
    public String modifyMenuPrice(Model model, @RequestParam(required = false) String modifyName,@RequestParam(defaultValue = "0") int modifyPrice){

        String message = modifyName + modifyPrice;
        System.out.println("message = " +message);
        model.addAttribute("message", message);
        return "first/messagePrinter";
    }

    @PostMapping("modifyAll")
    public String modifyMenu(Model model, @RequestParam Map<String, String> parameters){

        String modifyName = parameters.get("modifyName2");
        int modifyPrice = Integer.parseInt(parameters.get("modifyPrice2"));

        String message = modifyName + modifyPrice;
        System.out.println(message);

        model.addAttribute("message", message);

        return "first/massagePrinter";
    }

    @GetMapping("search")
    public void search(){}

    @PostMapping("search")
    public String searchMenu(@ModelAttribute("menu") MenuDTO menu){

        System.out.println(menu);
        return "first/searchResult";
    }

    @GetMapping("login")
    public void login(){

    }

    @PostMapping("login1")
    public String sessionTest(HttpSession session, @RequestParam String id){
        System.out.println(session);
        System.out.println(id);
        session.setAttribute("id",id);
        return "first/loginResult";
    }

    @GetMapping("logout1")
    public String logoutTest1(HttpSession session){
        session.invalidate();
        return "first/loginResult";
    }

    @PostMapping("login2")
    public String sessionTest2(Model model, @RequestParam String id){
        model.addAttribute("id", id);
        return "first/loginResult";
    }

    @GetMapping("logout2")
    public String logoutTest2(SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "first/loginResult";
    }

    @GetMapping("body")
    public void body(){}

    @PostMapping("body")
    public void bodyTest(@RequestBody String body,
                         @RequestHeader("content-type")String contexType,
                         @CookieValue(value = "JSESSIONID",required = false)String sessionId) throws UnsupportedEncodingException{

        System.out.println(contexType);
        System.out.println(sessionId);
        System.out.println(body);
        System.out.println(URLDecoder.decode(body,"UTF-8"));
    }

}

