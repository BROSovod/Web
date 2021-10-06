package com.example.springwebapp.model;

import java.util.Date;

public class Product {

    private Integer product_id;
    private String description;
    private Integer price;
    private String category;
    private String linkImage;

    public Product(final Integer product_id, final String description, final Integer price,
                   final String category, final String linkImage) {
        this.product_id = product_id;
        this.description = description;
        this.price = price;
        this.category = category;
        this.linkImage = linkImage;
    }

    public Integer getProduct_id() {return this.product_id; }

    public void setProduct_id(final Integer product_id) {this.product_id = product_id; }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public String getLinkImage() {
        return this.linkImage;
    }

    public void setLinkImage(final String linkImage) {
        this.linkImage = linkImage;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(final Integer price) {
        this.price = price;
    }

}
