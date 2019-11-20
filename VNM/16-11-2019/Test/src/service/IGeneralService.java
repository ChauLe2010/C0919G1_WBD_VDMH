package service;

import java.util.List;
import model.Product;

public interface IGeneralService<E> {
    List<E> findAllHaveBusiness();
    void addHaveBuniness(E e);
    void removeHaveBuniness(int id);
    void updateHaveBuniness(int id, E e);
    Product findByName(String name);

}
