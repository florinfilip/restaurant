package com.florin.restaurant.order_item;


import com.florin.restaurant.model.Menu;
import com.florin.restaurant.user.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_items", schema = "public")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;

    @ManyToOne
    @JoinColumn(name="menu_id")
    private Menu menu;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


    @Transient
    public double getSubtotal(){
        return this.menu.getPrice() * quantity;
    }
}
