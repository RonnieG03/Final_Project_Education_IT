package com.project.shoppincart.service;

import com.project.shoppincart.model.Cart;
import com.project.shoppincart.model.CartItem;
import com.project.shoppincart.model.Product;
import com.project.shoppincart.model.UserEntity;

import java.util.List;

public interface CartService {
    public List<Cart> getAllCart();

    public Cart getCartById(Long id);
    public Cart saveCart(Cart cart);
    public Cart saveCartByUserId(Long userId);
    public void deleteCart(Long id);

}
