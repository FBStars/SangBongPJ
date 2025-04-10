package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {

    @RequestMapping("/main")
    public String main() {
        return "main/index";  // → /WEB-INF/views/main/index.jsp 로 이동
    }
}
