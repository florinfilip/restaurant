package com.florin.restaurant.controller;


import com.florin.restaurant.model.Menu;
import com.florin.restaurant.order_item.OrderItem;
import com.florin.restaurant.service.MenuService;
import com.florin.restaurant.service.OrderService;
import com.florin.restaurant.util.AttributeNames;
import com.florin.restaurant.util.Mappings;
import com.florin.restaurant.util.ViewNames;
import lombok.RequiredArgsConstructor;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import java.util.List;

@Controller
@RequestMapping(Mappings.MENUS)
@RequiredArgsConstructor
public class MenuController {

private final MenuService menuService;


    @GetMapping(Mappings.LIST)
    public ModelAndView list(Model model){
        List<Menu> meniuri= menuService.getMenus();
        model.addAttribute(AttributeNames.MENUS, meniuri);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName(ViewNames.LIST);
        return modelAndView;
    }




}
