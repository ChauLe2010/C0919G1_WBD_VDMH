package service;

import model.Product;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAllHaveBusiness() {

        return productRepository.findAll();
    }

    @Override
    public void addHaveBuniness(Product product) {
        productRepository.add(product);

    }

    @Override
    public void removeHaveBuniness(int id) {
        productRepository.remove(id);
    }

    @Override
    public void updateHaveBuniness(int id, Product product) {
    productRepository.Update(id,product);
    }

    @Override
    public void findbyName(String name) {
    productRepository.findByName(name);
    }

    @Override
    public void comparePrice() {
    productRepository.comparePrice();
    }
}
