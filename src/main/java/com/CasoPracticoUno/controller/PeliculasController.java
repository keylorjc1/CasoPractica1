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
            @GetMapping("/peliculas")
    public String index(Model model) {
        List<Sala> listaPeliculas = peliculasService.getAllPeliculas();
        model.addAttribute("tituloVisualizacion", "Acá puedes visualizar las peliculas");
        model.addAttribute("tituloPeliculas", "Próximas Peliculas");
        model.addAttribute("peliculas", listaPeliculas);
        return "peliculas";
    }

    @GetMapping("/peliculasN")
    public String crearPeliculas(Model model) {
        List<Peliculas> listaSala = salaService.listSala();
        model.addAttribute("peliculas", new Peliculas());
        model.addAttribute("sala", listaSala);
        return "crear";
    }
}
