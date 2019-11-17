package repository;

import model.Product;

import java.util.Comparator;

public class ProductsCompre implements Comparator<Product> {
    @Override
    public int compare(Product cost1, Product cost2) {
        if (cost1.getCost() > cost2.getCost()) return 1;
        else if (cost1.getCost() < cost2.getCost()) return -1;
        else return 0;
    }

}
