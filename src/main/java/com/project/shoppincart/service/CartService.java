package com.project.shoppincart.service;

import com.project.shoppincart.model.Cart;

public interface CartService {

    Cart save(Cart cart);
    void delete(Long id);

}
