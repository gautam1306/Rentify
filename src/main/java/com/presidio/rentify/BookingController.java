package com.presidio.rentify;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @RequestMapping("/hello")
    public String sayHi(){
        return "hello";
    }
}
