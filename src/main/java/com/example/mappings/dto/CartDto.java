package com.example.mappings.dto;

import com.example.mappings.models.Items;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {
    private String cartName;
//    private String itemName1;
//    private String itemName2;
    private List<Items> itemsList;

}
