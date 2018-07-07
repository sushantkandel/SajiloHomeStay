package com.peaceandray.SajiloHomeStay.Api;


import com.peaceandray.SajiloHomeStay.Model.Home;
import com.peaceandray.SajiloHomeStay.Model.Home_owner;
import com.peaceandray.SajiloHomeStay.Service.HomeService;
import com.peaceandray.SajiloHomeStay.Service.Home_ownerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/landing/")


public class LandingPageApi {

    @Autowired

    Home_ownerService home_ownerService;
    HomeService homeService;


    //Listing of owner home

    @GetMapping("list/home")
    public List<Home> getAllHome(){
        return homeService.ListHome();
    }


    //Listing of owner

    @GetMapping("list/home_owner")
    public List<Home_owner> getAllHome_owner(){
        return home_ownerService.listHome_owner();
    }

}
