package com.example.ExamenParcial.Services;

import java.util.List;

import com.example.ExamenParcial.Model.AlumnoModel;

public interface IAlumnoService {

    public AlumnoModel add(AlumnoModel model);

    public AlumnoModel update(AlumnoModel model);

    public boolean delete(int id);

    public List<AlumnoModel> findAll();

    public AlumnoModel findById(int id);
    
}
