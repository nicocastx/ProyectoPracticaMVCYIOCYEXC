package com.springbootapp.proyectopracticamvcyiocyexc.repositories;

public interface Repository<T> {
    void getAll();

    int getById(int id);

    int add(T t);
}
