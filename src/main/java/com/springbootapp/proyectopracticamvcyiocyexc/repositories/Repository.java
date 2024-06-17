package com.springbootapp.proyectopracticamvcyiocyexc.repositories;

import com.springbootapp.proyectopracticamvcyiocyexc.Exceptions.NoExisteElementoException;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();

    T getById(int id) throws NoExisteElementoException;

    int add(T t);
}
