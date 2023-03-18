package com.example.mappings.controllers;

import com.example.mappings.models.Cart;
import com.example.mappings.models.Items;
import com.example.mappings.services.CartService;
import com.example.mappings.services.ItemService;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.CompositeUriComponentsContributor;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PostController {

    final private CartService cartService;

    final private ItemService itemService;

    @PostMapping("/addcart")
    public Cart addCart(@RequestBody Cart cart)
    {
        return cartService.addCart(cart);
    }

    @PostMapping("/additem")
    public Items addItem(@RequestBody Items item)
    {
        return itemService.addItems(item);
    }

    @GetMapping("/showcart")
    public List<Cart> cartList()
    {
        return cartService.showAllCarts();
    }

    @GetMapping("/showitems")
    public List<Items> itemsList()
    {
        return itemService.showAllItems();
    }


}
