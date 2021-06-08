package com.florin.restaurant.repository;

import com.florin.restaurant.model.Menu;
import com.florin.restaurant.order_item.OrderItem;
import com.florin.restaurant.user.User;
import org.hibernate.criterion.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<OrderItem,Integer> {

     List<OrderItem> findByUser(User user);
     OrderItem findByUserAndMenu(User user, Menu menu);
     void deleteByUserId(int id);

}
