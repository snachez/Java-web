/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.Persona;
import dao.PersonaGestion;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Laboratorios
 */
@Named(value = "verpersonas")
@RequestScoped
public class verpersonas extends Persona{
private List<Persona> personas = new ArrayList<Persona>();
    /**
     * Creates a new instance of verpersonas
     */
    public List<Persona> getPersonas(){
    return personas;
    }

    public verpersonas() {
    }
    
    @PostConstruct
    public void init(){
        personas = PersonaGestion.getListaPersona();
    }
}
