package com.peaceandray.SajiloHomeStay.Api;

import com.peaceandray.SajiloHomeStay.Model.Home;
import com.peaceandray.SajiloHomeStay.Model.Home_owner;
import com.peaceandray.SajiloHomeStay.Service.HomeService;
import com.peaceandray.SajiloHomeStay.Service.Home_ownerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserApi {
    @Autowired
    Home_ownerService home_ownerService;
    @Autowired
    HomeService homeService;


    //Searching of owner by name
    @GetMapping("search/home_owner/{name}")
    public List<Home_owner> searchOwnerByName(@PathVariable(value = "name")String name){
        return home_ownerService.searchHome_Owner(name);
    }

    //Searching house by address
@GetMapping("search/home/{address}")

    public  List<Home> searchHomeByAddress(@PathVariable(value = "address")String address){

        return homeService.searchHome(address);
}

}
