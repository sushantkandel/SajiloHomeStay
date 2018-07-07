package com.peaceandray.SajiloHomeStay.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "home", schema = "", catalog = "")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long homeId;
    private String lalpurja;
private  String address;
private String total_room;
private  String price;
private  String details;
private  String photos;
private  String home_owner_citizenship;


}
