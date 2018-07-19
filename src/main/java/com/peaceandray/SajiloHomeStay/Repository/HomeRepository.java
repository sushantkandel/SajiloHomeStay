package com.peaceandray.SajiloHomeStay.Repository;

import com.peaceandray.SajiloHomeStay.Model.Home;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomeRepository extends JpaRepository<Home,Long> {

    public List<Home> findByAddress(String address);
}
