package com.example.ExamenParcial.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ExamenParcial.Model.AlumnoModel;

@Repository     
public interface IAlumnoRepository extends CrudRepository<AlumnoModel, Integer>{
    
}
