package az.atlacademy.localnews.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String goToHomePage() {
        return "HTML Homepage pending...";
    }

}
