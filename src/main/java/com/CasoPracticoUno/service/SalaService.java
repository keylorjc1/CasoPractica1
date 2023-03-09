/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CasoPracticoUno.service;

import com.CasoPracticoUno.entity.Peliculas;
import com.CasoPracticoUno.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class SalaService implements ISalaService{
    
    @Autowired
    private SalaRepository SalaRepository;

    @Override
    public List<Peliculas> listSala() {
        return (List<Peliculas>)SalaRepository.findAll();
    }
    
}
