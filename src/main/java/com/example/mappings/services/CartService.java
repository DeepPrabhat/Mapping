package com.example.mappings.services;

import com.example.mappings.dto.CartDto;
import com.example.mappings.models.Cart;
import com.example.mappings.models.Items;
import com.example.mappings.repositories.CartRepository;
import com.example.mappings.repositories.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CartService {
    final private CartRepository cartRepository;

    final private ItemRepository itemRepository;

    public Cart addCart(Cart cart){
        return cartRepository.save(cart);
    }
//    public Cart addCartUsingDto(CartDto cartDto){
//        Items item1= new Items();
//        Items item2= new Items();
//        item1.setItemName(cartDto.getItemName1());
//        item2.setItemName(cartDto.getItemName2());
//        List<Items> itemsList=new ArrayList<>();
//        itemsList.add(item1);
//        itemsList.add(item2);
//        Cart cart=new Cart();
//        cart.setCartName(cartDto.getCartName());
//        cart.setItemsList(itemsList);
//        itemRepository.save(item1);
//        itemRepository.save(item2);
//        return cartRepository.save(cart);
//    }

    public Cart addCartUsingDto(CartDto cartDto){
        Cart cart=new Cart();
        itemRepository.saveAll(cartDto.getItemsList());
        cart.setCartName(cartDto.getCartName());
        cart.setItemsList(cartDto.getItemsList());
        return cartRepository.save(cart);
    }


    public List<Cart> showAllCarts(){
        return cartRepository.findAll();
    }
}
