package com.company.repositories.interfaces;

import com.company.entities.Merey;

import java.util.List;

public interface ICompanyRepository {
    boolean createCompany(Merey company);
    Merey getCompany(int id);
    List<Merey> getAllCompanies();
}