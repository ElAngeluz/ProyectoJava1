/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;
import Entidades.Sensor;
import general.ValidacionS;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Johanna Parrales
 */
public class ArchivoS {
    private static final String RUTA_ARCHIVO = "sensores.txt";
    
    public static boolean crear(){
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_ARCHIVO);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static boolean borrar_contenido(){
        try{
            EscribirArchivo archivo = new EscribirArchivo();
            archivo.borrar_contenido(RUTA_ARCHIVO);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static ArrayList<Sensor> obtener_registros()throws Exception{
        ArrayList<Sensor> sensores;
        try{
            LeerArchivo archivo = new LeerArchivo();
            archivo.abrir(RUTA_ARCHIVO);
            sensores = archivo.obteniendo_objetos();
            archivo.cerrar();
        }catch(Exception e){
            throw e;
        }    
        return sensores;        
    }
    
    public static boolean insertar_registro(Sensor s){
        EscribirArchivo archivo = new EscribirArchivo();
        try{
            archivo.abrir(RUTA_ARCHIVO);
            archivo.insertar_objeto(s);
            archivo.cerrar(); 
        }catch(IOException e){
            return false;
        }                          
        return true;
    }
    
   public static boolean actualizar_registro(Sensor s){
         ArrayList<Sensor> sensores;
         try{
            sensores = ArchivoS.obtener_registros();
            int indice = ValidacionS.existeSensor(sensores,s);
            sensores.set(indice, s);
         }catch(Exception e){
             return false;
         }
         return ArchivoS.actualizar_registros(sensores);         
    }
    
    public static boolean actualizar_registros(ArrayList sensores){
        borrar_contenido();
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_ARCHIVO);
            for(int i=0;i<sensores.size();i++)
                archivo.insertar_objeto(sensores.get(i));
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }                 
        return true;
    }
    
    public static boolean actualizarDatosSensor(Sensor s){        
        ArrayList<Sensor> registros;
        
        try{
            registros = ArchivoS.obtener_registros();
            for(int i=0;i<registros.size();i++){
                Sensor tmp = registros.get(i); 
                if(tmp.getId().equals(s.getId())){                
                    s.setId(tmp.getId());
                    s.setNombre(tmp.getNombre());
                    s.setFabricante(tmp.getFabricante());
                    s.setModelo(tmp.getModelo());
                    s.setUbicacion(tmp.getUbicacion());
                    s.setEstado(tmp.getEstado());
                    s.setTipo(tmp.getTipo());
                    s.setDescripcion(tmp.getDescripcion());
                    s.setValorActual(tmp.getValorActual());
                    s.setValorAlarma(tmp.getValorAlarma());                 
                    return true;
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
}
