package com.company.controllers;

import com.company.entities.Merey;
import com.company.entities.Merey;
import com.company.repositories.interfaces.ICompanyRepository;

import java.util.List;

public class MereyController {
    private final ICompanyRepository repo;

    public MereyController(ICompanyRepository repo) {
        this.repo = repo;
    }

    public String createCompany(String name, String project, int amount) {
        Merey merey = new Merey(name, project, amount);

        boolean created = repo.createCompany(merey);

        return (created ? "User was created!" : "User creation was failed!");
    }

    public String getCompany(int id) {
        Merey merey = repo.getCompany(id);

        return (merey == null ? "User was not found!" : merey.toString());
    }

    public String getAllUsers() {
        List<Merey> companies = repo.getAllCompanies();

        return companies.toString();
    }
}