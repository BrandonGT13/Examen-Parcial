package com.example.ExamenParcial.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamenParcial.Model.AlumnoModel;
import com.example.ExamenParcial.Repository.IAlumnoRepository;

@Service
public class AlumnoService implements IAlumnoService {


    @Autowired
    IAlumnoRepository repository;

    @Override
    public AlumnoModel add(AlumnoModel model) {
        return repository.save(model);
    }

    @Override
    public AlumnoModel update(AlumnoModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<AlumnoModel> findAll() {
        return (List<AlumnoModel>) repository.findAll();
    }

    @Override
    public AlumnoModel findById(int id) {
        return repository.findById(id).get();
    }

}