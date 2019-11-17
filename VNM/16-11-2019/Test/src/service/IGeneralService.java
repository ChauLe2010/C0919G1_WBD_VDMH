package service;

import java.util.List;

public interface IGeneralService<E> {
    List<E> findAllHaveBusiness();
    void addHaveBuniness(E e);
    void removeHaveBuniness(int id);
    void updateHaveBuniness(int id, E e);
    void findbyName(String name);
}
