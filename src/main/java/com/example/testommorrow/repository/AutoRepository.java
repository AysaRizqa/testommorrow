package com.example.testommorrow.repository;

import com.example.testommorrow.model.Model;

import java.util.List;

public interface AutoRepository {


    public List<Model> getAll();
    public Model save(Model model);
    Model getAutoById(long id);
    void removeAutoById(long id);





}
