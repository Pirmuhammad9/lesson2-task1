package com.company.lesson2task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Output {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String date;
    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Currency currency;

    private String factureNumber;

    private String code;

    @ManyToOne
    private Client client;
}
