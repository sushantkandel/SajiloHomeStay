package com.peaceandray.SajiloHomeStay.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin_api/v1/")
public class Api {

    @GetMapping("")
    public String status(){
        return "Server is running";
    }
}
