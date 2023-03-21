package com.project.shoppincart.model;

import javax.persistence.*;

@Entity
@Table(name = "shopping_cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    private int amount;
    private int items;

    public Cart() {
    }

    public Cart(Long id, Product product, UserEntity user, int amount, int items) {
        this.id = id;
        this.product = product;
        this.user = user;
        this.amount = amount;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public UserEntity getUserEntity() {
        return user;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.user = userEntity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", product=" + product +
                ", userEntity=" + user +
                ", amount=" + amount +
                ", items=" + items +
                '}';
    }
}
