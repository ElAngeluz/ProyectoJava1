/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import Entidades.Sensor;
import java.util.ArrayList;

/**
 *
 * @author Johanna Parrales
 */
public class ValidacionS {
      public static int existeSensor(ArrayList<Sensor> registros, Sensor s){
        int i=0;
            for (Sensor s2 : registros) {
                if(s2.getId().equals(s.getId()))
                    return i;
              
                i++;
          }    
        return -1;    
    }
}
