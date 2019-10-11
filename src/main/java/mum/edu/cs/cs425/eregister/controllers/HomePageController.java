package mum.edu.cs.cs425.eregister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/eregister", "/eregister/home"})
    public String displayHomePage(){
        return "index";

    }

}