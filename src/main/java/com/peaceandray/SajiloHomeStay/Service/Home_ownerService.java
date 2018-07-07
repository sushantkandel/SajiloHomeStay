package com.peaceandray.SajiloHomeStay.Service;

import com.peaceandray.SajiloHomeStay.Model.Home_owner;
import com.peaceandray.SajiloHomeStay.Repository.Home_ownerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Home_ownerService {
    @Autowired
    Home_ownerRepository home_ownerRepository;

    public void addHome_owner(Home_owner home_owner) {
        home_ownerRepository.save(home_owner);
    }



    public List<Home_owner> listHome_owner(){
       return  home_ownerRepository.findAll();
    }

    public void deleteHomeOwner(Long homeOwnerId){
        Home_owner home_owner=home_ownerRepository.getOne(homeOwnerId);
        home_ownerRepository.delete(home_owner);
    }

    public List<Home_owner> searchHome_Owner(String name){

        List<Home_owner>home_owner=home_ownerRepository.findByName(name);
        return (home_owner);


    }




}


