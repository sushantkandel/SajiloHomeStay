package com.peaceandray.SajiloHomeStay.Api;

import com.peaceandray.SajiloHomeStay.Model.Home;
import com.peaceandray.SajiloHomeStay.Model.Home_owner;
import com.peaceandray.SajiloHomeStay.Service.HomeService;
import com.peaceandray.SajiloHomeStay.Service.Home_ownerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home_owner/")
public class HomeOwnerApi {
@Autowired

Home_ownerService home_ownerService;
@Autowired
HomeService homeService;

/** Home_owner in Ownservices **/
// Adding home_owner info
    @PostMapping("submit/info")
    public void addHome_owner(@RequestBody Home_owner home_owner){

        home_ownerService.addHome_owner(home_owner);


    }

    /** Home_owner in Home services **/
    // Adding home record
    @PostMapping("add/home")
    public void addHome(@RequestBody Home home){

      homeService.addHome(home);


    }
// Deleting home record
    @PostMapping("delete/home/{homeId}")
    public  void deleteHome(@PathVariable(value="homeId") Long homeId){

        homeService.deleteHome(homeId);
    }
    @GetMapping("")
    public String owner(){
        return "owner";
    }
    //Listing of owner home

    @GetMapping("list/home")
    public List<Home> getAllHome(){

        Home home=new Home();
        home.setHomeId(Long.valueOf(321));
        home.setAddress("chitwan");
        home.setDetails("Hello baba ji");
        home.setHome_owner_citizenship("54321");
        home.setLalpurja("BinaryLal purja");
        home.setPhotos("photos");
        home.setTotal_room("12");
        homeService.addHome(home);


        return homeService.ListHome();
    }


}
