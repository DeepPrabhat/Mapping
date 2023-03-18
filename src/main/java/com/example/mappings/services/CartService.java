package com.example.mappings.services;

import com.example.mappings.models.Cart;
import com.example.mappings.repositories.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CartService {
    final private CartRepository cartRepository;

    public Cart addCart(Cart cart){
        return cartRepository.save(cart);
    }

    public List<Cart> showAllCarts(){
        return cartRepository.findAll();
    }
}
