package cl.ipp.centralizador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class MainController {

    @GetMapping(path = "/index")
    public String index(){
        return "index";
    }

    @GetMapping(path = "/dashboard")
    public String dashboard(){
        return "pages/dashboard";
    }
}
