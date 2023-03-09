/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CasoPracticoUno.controller;

import com.CasoPracticoUno.entity.Sala;
import com.CasoPracticoUno.entity.Peliculas;
import com.CasoPracticoUno.service.IPeliculasService;
import com.CasoPracticoUno.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author User
 */

@Controller
public class PeliculasController {
    @Autowired
    private IPeliculasService peliculasService;

    @Autowired
    private ISalaService salaService;
    
}
