package repository;

import model.Product;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {

    ArrayList<Product> listProducts = new ArrayList<>();
    {
        listProducts.add(new Product(1,"Samsung Galaxy S10",19000000));
        listProducts.add(new Product(2, "Iphone X",10000000));
        listProducts.add(new Product(3, "OPPO",6000000));
        listProducts.add(new Product(4, "NOKIA",3000000));
        listProducts.add(new Product(5, "VSMART PRO",60000000));
    }

    @Override
    public List<Product> findAll() {
        return listProducts;
    }

    @Override
    public void add(Product product) {
    listProducts.add(product);
    }


    @Override
    public void remove(int id) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.remove(i);
                return;
            }
        }
    }

    @Override
    public void Update(int id, Product product) {
        int index = 1;
    for (int i =0; i < listProducts.size();i++) {
        if (listProducts.get(i).getId() == id) {
            index = i;
            break;
        }
    }
        listProducts.set(index,product);

    }

    @Override
    public void findByName(String name) {
        ArrayList<Product> listProduct1 = new ArrayList<>();
        for (int i = 0; i < listProducts.size();i++){
        if (listProducts.get(i).getName().contains(name)){
            listProduct1.add(listProducts.get(i)) ;
        }
    }
    for (Product p : listProduct1){
        System.out.println("ID: " + p.getId() + " Name: " + p.getName());

    }
    }



    @Override
    public void comparePrice() {
        ProductsCompre productsCompre = new ProductsCompre();
        Collections.sort(listProducts, productsCompre);
        for (Product k : listProducts){
            System.out.println("ID: " + k.getId() + " Name: " + k.getName() + " Cost: " + k.getCost());
        }
    }
}
