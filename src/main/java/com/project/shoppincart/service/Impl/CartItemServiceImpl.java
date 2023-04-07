package com.project.shoppincart.service.Impl;

import com.project.shoppincart.model.CartItem;
import com.project.shoppincart.repository.CartItemRepository;
import com.project.shoppincart.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {
    private final CartItemRepository cartItemRepository;
    @Autowired
    public CartItemServiceImpl(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }
    @Override
    public List<CartItem> getAllItems() {
        return cartItemRepository.findAll();
    }
    @Override
    public CartItem getItemById(Long id) {
        return cartItemRepository.findById(id).orElse(null);
    }
    @Override
    public CartItem saveItem(CartItem item) {
        return cartItemRepository.save(item);
    }
    @Override
    public void deleteItem(Long id) {
        cartItemRepository.deleteById(id);
    }
}
