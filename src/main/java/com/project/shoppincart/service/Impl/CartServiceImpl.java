package com.project.shoppincart.service.Impl;

import com.project.shoppincart.model.Cart;
import com.project.shoppincart.repository.CartRepository;
import com.project.shoppincart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }
    @Override
    public void delete(Long id) {
        Cart cart = cartRepository.findById(id).
                orElseThrow(() -> new RuntimeException ("cart could not be delete"));
        cartRepository.delete(cart);
    }
}
