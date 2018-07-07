package com.peaceandray.SajiloHomeStay.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "home_owner", schema = "", catalog = "")
public class Home_owner {

    private  String ownerName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long homeOwnerId;
    private  String name;
    private  String citizenship;
    private  String photos;
    private  String address;
    private  String contact_no;
    private  String mob_no;
    private  String email;
}
