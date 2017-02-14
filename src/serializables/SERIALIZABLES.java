/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializables;

import CONTROLADOR.CONTROLADOR;
import MODELO.MODELO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class SERIALIZABLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        CONTROLADOR o1= new CONTROLADOR();
        File archivo= new File("/home/usuario/Escritorio/SERIALIZABLE/TERCERO_SIS.obj");
        ArrayList<MODELO> lista= new ArrayList<MODELO>();
        try {
            lista=o1.leer_FS(archivo);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SERIALIZABLES.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SERIALIZABLES.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///PEDIMOS LOS DATOS
        //pedimos cedula
        /*String cedula="";
        String nombres="";
        String apellidos="";
        Scanner sc1= new Scanner(System.in);
        System.out.println("CEDULA: ");
        cedula=sc1.nextLine();
        //pedimos nombres
        Scanner sc2= new Scanner(System.in);
        System.out.println("NOMBRES: ");
        nombres=sc2.nextLine();
        //pedimos apellido
        Scanner sc3= new Scanner(System.in);
        System.out.println("APELLIDOS: ");
        apellidos=sc3.nextLine();
        MODELO o2= new MODELO(cedula, nombres, apellidos);
        lista.add(o2);
        o1.escribir_FS(lista, archivo);*/
        lista=o1.leer_FS(archivo);
        for (MODELO elemento:lista){
            System.out.println("CEDULA: "+elemento.getCedula());
            System.out.println("NOMBRES: "+elemento.getNombres());
            System.out.println("APELLIDOS: "+elemento.getApellidoss());
            System.out.println("************************************");
        }
    }
    
}
