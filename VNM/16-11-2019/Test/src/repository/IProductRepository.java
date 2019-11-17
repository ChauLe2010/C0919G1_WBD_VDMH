package repository;

import model.Product;

public interface IProductRepository extends IGeneralRepository<Product> {
    void comparePrice();
}
