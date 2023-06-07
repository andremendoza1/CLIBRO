
package Controles;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import Documentos.CLibro;
import java.io.IOException;

/**
 *
 * @author HUAWEI
 */
public class ArchivoL implements Serializable {
    
    ArrayList<CLibro> listarecuperar = new ArrayList<CLibro>();
    
    //aqui es donde tenemos el manejor de archivos por separado
    public ArrayList<CLibro> leer(){
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            
            listarecuperar = (ArrayList<CLibro>)in.readObject();
            in.close();
        
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Esperando ..... " + e.getMessage());
        
        }
        return listarecuperar;
    }
    
    void serializar(ArrayList<CLibro> listaserializada){
        try{
            
            FileOutputStream salida = new FileOutputStream("libro.txt");
            ObjectOutputStream salidaobjeto;
            salidaobjeto = new ObjectOutputStream(salida);
            salidaobjeto.writeObject(listaserializada);
            salidaobjeto.close();
        
        }catch(IOException e){
            System.out.println("Error ... "+ e.getMessage());
        
        }
    }
    
    
    
}