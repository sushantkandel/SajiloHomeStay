package com.peaceandray.SajiloHomeStay.Service;

import com.peaceandray.SajiloHomeStay.Model.Home;
import com.peaceandray.SajiloHomeStay.Model.Home_owner;
import com.peaceandray.SajiloHomeStay.Repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    HomeRepository homeRepository;
public void addHome(Home home){

   homeRepository.save(home);
}

public List<Home> ListHome(){
return homeRepository.findAll();

}

public void deleteHome(Long homeId){

   Home home=homeRepository.getOne(homeId);
   homeRepository.delete(home);
}

    public List<Home> searchHome(String name){

        List<Home>home=homeRepository.findyByAddress(name);
        return (home);


    }

}
