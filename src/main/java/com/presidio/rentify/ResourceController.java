package com.presidio.rentify;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @RequestMapping("/resource")
    public String getResources(){
        return "Hello";
    }
}
