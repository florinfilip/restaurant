package com.florin.restaurant.service;

import com.florin.restaurant.model.Menu;

import java.util.HashMap;
import java.util.List;


public interface MenuService {

List<Menu> getMenus();
    Menu addMenu(Menu menu);
    void deleteMenu(int id);
    Menu getMenuById(int id);
    Menu updateMenu(Menu menu);



}
