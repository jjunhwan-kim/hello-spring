package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");

        // viewName을 리턴
        // viewResolver가 아래 경로의 html 파일을 찾아서 출력
        // resources:templates/ + {viewName} + .html
        return "hello";
    }

    @GetMapping("hello-mvc")    // Get method
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }
}