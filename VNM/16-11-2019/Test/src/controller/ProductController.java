package controller;

import model.Product;

import service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();

    public List<Product> getProducts() {
        return productService.findAllHaveBusiness();
    }

    public void addProduct(Product product) {
        productService.addHaveBuniness(product);
    }

    public void removeProduct(int id) {
        productService.removeHaveBuniness(id);
    }

    public void updateProduct(int id, Product product) {
        productService.updateHaveBuniness(id, product);
    }

    public Product findByName(String name) {
        return productService.findByName(name);
    }


    public void comparePrice() {
        productService.comparePrice();
    }
}

