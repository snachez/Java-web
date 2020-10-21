package com;
import dao.Persona;
import dao.PersonaGestion;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "ingresar")
@RequestScoped
public class ingresar extends Persona{

    public ingresar() {
    }
    
    public String guardarInformacion(){
        PersonaGestion.agregar(this);
        return "verpersonas";
    }
}
