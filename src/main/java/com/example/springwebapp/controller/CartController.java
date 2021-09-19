package com.example.springwebapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CartController {
    @PostMapping("/cart")
    public List<Integer> cart(@RequestParam int id, HttpSession session){
        Integer i = id;
        String sid = session.getId();

        Object obj = session.getAttribute("cart");
        List<Integer> cart;
        if (obj == null) {
            cart = new ArrayList<>();
        } else {
            cart = (List<Integer>) obj;
        }
        cart.add(id);

        session.setAttribute("cart", cart);
        return cart;
    }
}
