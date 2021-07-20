package com.example.testommorrow.repository;

import com.example.testommorrow.model.Model;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AutoRepositoryImpl implements AutoRepository {
    List <Model> autos;

    public AutoRepositoryImpl(){
        this.autos=new ArrayList<>();
        this.autos.add(new Model("ford mustang","1972","4.2 liter V8 Engine","Rode"));
        this.autos.add(new Model("shelby cobra","1965","3.7 liter V8 Engine", "zwarte"));

    }
    @Override
    public List<Model> getAll() {
        return autos;
    }

    @Override
    public Model save(Model model) {
        this.autos.add(model);
        return model;
    }

    @Override
    public Model getAutoById(long id) {
        for(Model auto : autos){
            if(id == auto.getId());{
            return auto;}

        }
        return null;
    }

    @Override
    public void removeAutoById(long id) {
        for(Model auto : autos){
            if (id == auto.getId()){
                autos.remove(auto);
                break;
            }
        }

    }


}



