package com.peaceandray.SajiloHomeStay.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Home_owner {

    private  String ownerName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long homeOwnerId;
    private  String citizenship;
    private  String photos;
    private  String address;
    private  String contact_no;
    private  String mob_no;
    private  String email;
}
