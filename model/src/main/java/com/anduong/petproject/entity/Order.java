package com.anduong.petproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order extends  AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private double totalAmount;

    private
}
