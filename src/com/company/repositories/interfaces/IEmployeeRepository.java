package com.company.repositories.interfaces;

import com.company.entities.Merey;
import com.company.entities.Merey;

import java.util.List;
interface IEmployeeReprository {
    boolean createUser(Merey user);
    Merey getUser(int id);
    List<Merey> getAllUsers();
}