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
    @Autowired
    HomeService homeService;


    //Listing of owner home

    @GetMapping("list/home")
    public List<Home> getAllHome(){


        Home home =new Home();
        home.setHomeId(Long.valueOf(1231));
        home.setAddress("baneshwor");
        home.setDetails("dsafsad0");
        home.setHome_owner_citizenship("123123123");
        home.setLalpurja("safdsa");
        home.setPhotos("photos");
        home.setPhotos("213123");
        home.setTotal_room("dafsf");
        homeService.addHome(home);

        return homeService.ListHome();
    }


    //Listing of owner

    @GetMapping("list/home_owner")
    public List<Home_owner> getAllHome_owner(){
        return home_ownerService.listHome_owner();
    }

}
