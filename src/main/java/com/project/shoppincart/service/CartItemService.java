package com.project.shoppincart.service;

import com.project.shoppincart.model.CartItem;
import com.project.shoppincart.repository.CartItemRepository;

import java.util.List;

public interface CartItemService {
    public List<CartItem> getAllItems();
    public CartItem getItemById(Long id);
    public CartItem saveItem(CartItem item);
    public void deleteItem(Long id);
}
