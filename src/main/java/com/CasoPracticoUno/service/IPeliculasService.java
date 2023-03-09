/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CasoPracticoUno.service;

import com.CasoPracticoUno.entity.Peliculas;
import java.util.List;

/**
 *
 * @author User
 */
public interface IPeliculasService {
    public List<Peliculas> getAllPeliculas();
    public Peliculas getPeliculasId(long id);
    public void savePeliculas(Peliculas pelicula);
    public void delete (long id);
}
