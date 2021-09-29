package com.example.springwebapp.controller;

import com.example.springwebapp.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Denis on 2/20/2016.
 */

@Controller
public class Home {

    /*@RequestMapping("/")
    public String home() {
        return "index";
    }*/

    //@RequestMapping("/home-with-session")
    @RequestMapping("/")
    public String homeWithSession(Model model, HttpSession session) {
        String sid = session.getId();
        model.addAttribute("sid", sid);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Product_1", 1, new Date()));
        products.add(new Product("Product_2", 2, new Date()));
        products.add(new Product("Product_3", 3, new Date()));
        products.add(new Product("Product_4", 4, new Date()));
        products.add(new Product("Product_5", 5, new Date()));
        products.add(new Product("Product_6", 6, new Date()));
        products.add(new Product("Product_7", 7, new Date()));
        products.add(new Product("Product_8", 8, new Date()));
        products.add(new Product("Product_9", 9, new Date()));
        products.add(new Product("Product_10", 10, new Date()));
        model.addAttribute("products", products);
        return "index";
    }
}
