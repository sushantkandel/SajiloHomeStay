package com.peaceandray.SajiloHomeStay.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Home {

private String lalpurja;
private  String address;
private String total_room;
private  String price;
private  String details;
private  String photos;
private  String home_owner_citizenship;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long homeId;



}
