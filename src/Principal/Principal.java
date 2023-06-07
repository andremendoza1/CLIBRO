
package Principal;

import java.util.*;
import Controles.*;

/**
 *
 * @author HUAWEI
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        
        ManipularLibros listalibrosobj = new ManipularLibros();
        
        int opcion;
         do{
            
            System.out.println("Bienvenidos a la libreria de los gatitos");
            System.out.println("Elija la opcion deseada");
            System.out.println("1.- Agregar un nuevo libro");
            System.out.println("2.- Consultar Libro");
            System.out.println("3.- Consultar todos los libros");
            System.out.println("4.- Borrar un libro");
            System.out.println("5.- Modificar un libro");
            System.out.println("6.- Salir");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    listalibrosobj.agregarLibro();
                    
                    break;
                case 2:
                    listalibrosobj.buscar();
                    
                    break;    
                case 3:
                    listalibrosobj.ConsultaGeneral();
                    
                    break;
                case 4:
                    listalibrosobj.borrar();
                    
                    break;
                case 5:
                    listalibrosobj.modificar();
                    
                    break;
                case 6:
                    System.out.println("Gracias adios");
                    listalibrosobj.grabar();
                    break;
                default:
                    System.out.println("Error");
            }
        
        }while((opcion>=1) && (opcion<6));
        
    }
    
    
}
