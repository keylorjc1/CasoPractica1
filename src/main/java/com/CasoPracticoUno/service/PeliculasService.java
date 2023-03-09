/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CasoPracticoUno.service;

import com.CasoPracticoUno.entity.Peliculas;
import com.CasoPracticoUno.entity.Sala;
import com.CasoPracticoUno.repository.PeliculasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class PeliculasService implements IPeliculasService{
    
    @Autowired
    private PeliculasRepository peliculasRepository;

    @Override
    public List<Sala> getAllPeliculas() {
        return (List<Sala>)peliculasRepository.findAll();
    }

    @Override
    public Sala getPeliculasId(long id) {
        return peliculasRepository.findById(id).orElse(null);
    }

    @Override
    public void savePeliculas(Sala pelicula) {
        peliculasRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        peliculasRepository.deleteById(id);
    }

    @Override
    public void savePeliculas(Peliculas pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
