package com.guirrugo.ecommerce.entities;

import java.util.List;

public class Cart {

    private Long id;
    private User user;
    private List<CartItem> cartItems;

    public Cart(User user, List<CartItem> cartItems) {
        this.user = user;
        this.cartItems = cartItems;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}
