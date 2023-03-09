/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CasoPracticoUno.repository;

import com.CasoPracticoUno.entity.Peliculas;
import com.CasoPracticoUno.entity.Sala;
import jakarta.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface PeliculasRepository extends CrudRepository<Sala,Long>{

    public void save(Peliculas pelicula);

    public Object findById(SingularAttribute<AbstractPersistable, Serializable> id);
    
}
