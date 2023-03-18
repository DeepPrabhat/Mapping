package com.example.mappings.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    private String cartName;

    @OneToMany
    @JoinColumn(name = "cart_id",referencedColumnName = "cartId")
    private List<Items> itemsList;
}
