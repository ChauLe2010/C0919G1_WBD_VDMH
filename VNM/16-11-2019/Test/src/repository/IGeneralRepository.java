package repository;

import model.Product;

import java.util.List;

public interface IGeneralRepository<E> {
    List<E> findAll();
    void add(E e);
    void remove(int id);
    void Update(int id, E e);
    Product findbyName(String name);

}
