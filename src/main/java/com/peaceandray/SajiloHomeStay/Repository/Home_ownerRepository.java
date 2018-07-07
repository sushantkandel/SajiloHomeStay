package com.peaceandray.SajiloHomeStay.Repository;

import com.peaceandray.SajiloHomeStay.Model.Home_owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Home_ownerRepository extends JpaRepository<Home_owner,Long> {

    public List<Home_owner> findByName(String name);


}

