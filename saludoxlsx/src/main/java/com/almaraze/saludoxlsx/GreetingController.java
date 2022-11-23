package com.almaraze.saludoxlsx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class GreetingController {
    
    @GetMapping(value="/hello/{name}/{color}")
    public String getMethodName(@PathVariable String name, @PathVariable String color) {
        log.info("Entró:" + name);
        return "index";
    }
    
}
