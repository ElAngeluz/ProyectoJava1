/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import Entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author Johanna Parrales
 */
public class ValidacionP {
     public static int existePersona(ArrayList<Persona> registros, Persona p){
        int i=0;
        for (Persona p2:registros) {
            if(p2.getId().equals(p.getId())){
                return i;
            }
            i++;
        }    
        return -1;    
    }
}
