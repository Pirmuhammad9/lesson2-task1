package com.company.lesson2task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Attachment attachment;
    private String code;
    @ManyToOne
    private Measurement measurement;
    private boolean active;
}
