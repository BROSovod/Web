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

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/home-with-session")
    public String homeWithSession(Model model, HttpSession session) {
        String sid = session.getId();
        model.addAttribute("sid", sid);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Ангельсике глазки всех цветов и размеров",
                515, "Оптика", "Тут будет ссылка на картинку"));
        products.add(new Product(2, "Задняя LED оптика для VW Golf 6",
                24562, "Оптика", "Тут будет ссылка на картинку"));
        products.add(new Product(3, "Губа заднего бампера под раздвоенный выхлоп VW Golf 6",
                6550, "Обвесы", "Тут будет ссылка на картинку"));
        products.add(new Product(4, "Диффузор заднего бампера для VW Passat CC",
                7407, "Обвесы", "Тут будет ссылка на картинку"));
        products.add(new Product(5, "Виниловые комплекты стильных стикеров для Фольксваген Golf 7",
                3509, "Стайлинг", "Тут будет ссылка на картинку"));
        products.add(new Product(6, "Виниловые комплекты стильных стикеров для Фольксваген Polo",
                2936, "Стайлинг", "Тут будет ссылка на картинку"));
        products.add(new Product(7, "Штатная магнитола RCD 330 Plus Desay 280D",
                19103, "Магнитолы", "Тут будет ссылка на картинку"));
        products.add(new Product(8, "Штатная магнитола RCN210 / RCD320",
                3041, "Магнитолы", "Тут будет ссылка на картинку"));
        products.add(new Product(9, "Универсальная камера заднего вида в рамке номерного знака",
                1910, "Камеры", "Тут будет ссылка на картинку"));
        products.add(new Product(10, "Штатная камера заднего вида в значке для Фольксваген Passat B8",
                27291, "Камеры", "Тут будет ссылка на картинку"));
        model.addAttribute("products", products);
        return "index";
    }
}
