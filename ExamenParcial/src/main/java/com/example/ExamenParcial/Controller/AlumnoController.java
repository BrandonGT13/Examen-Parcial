package com.example.ExamenParcial.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExamenParcial.Model.AlumnoModel;
import com.example.ExamenParcial.Rutas.rutas;
import com.example.ExamenParcial.Services.AlumnoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(rutas.Alumno)
public class AlumnoController {
    
    @Autowired
    AlumnoService alumnoService;

    @GetMapping(rutas.GetAll)
    public List<AlumnoModel> getAll() {   
        return alumnoService.findAll();
    }

    @PostMapping(rutas.Crear)
    public AlumnoModel create(@RequestBody AlumnoModel model) {
        return alumnoService.add(model);
    }

    @GetMapping(rutas.BuscarPorId)
    public AlumnoModel getById(@PathVariable int id) {
        return alumnoService.findById(id);
    }

    @PutMapping(rutas.Actualizar)
    public AlumnoModel update(@RequestBody AlumnoModel model) {
        return alumnoService.update(model);
    }

    @DeleteMapping(rutas.EliminarPorId)
    public boolean delete(@PathVariable int id) {
        return alumnoService.delete(id);
    }
    
}
