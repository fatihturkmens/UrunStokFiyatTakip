package com.goodsinformation.goodsinformation.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Urun {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long urunid;

     private String name;
     private String model;
     private double price;
     private double stok;



}
