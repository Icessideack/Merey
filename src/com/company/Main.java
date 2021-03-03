package com.company;

import com.company.controllers.MereyController;
import com.company.controllers.MereyController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.MereyRepository;
import com.company.repositories.interfaces.ICompanyRepository;

public class Main {

    public static void main(String[] args) {

        IDB db = new PostgresDB();
        ICompanyRepository repo = new MereyRepository(db);
        MereyController controller = new MereyController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();
    }
}