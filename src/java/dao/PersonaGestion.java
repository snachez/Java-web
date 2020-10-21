/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laboratorios
 */
public class PersonaGestion {
    private static List<Persona> listaPersonas = new ArrayList<>();
    
    public static void agregar(Persona persona){
        listaPersonas.add(persona);
    }
    public static List<Persona> getListaPersona(){
        return listaPersonas;
    }
    
}
