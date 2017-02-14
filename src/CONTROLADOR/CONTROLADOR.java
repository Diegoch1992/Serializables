/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.MODELO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class CONTROLADOR {
    //DEFINIR METODO PARA CREAR ARCHIVO
    
    public CONTROLADOR(){
    }

    public void crearFS() {
        JFileChooser selector= new JFileChooser();
        selector.setApproveButtonText("GUARDAR");
        selector.showSaveDialog(null);
        //CREO UN OBJETO TIPO FILE
        File archivo= new File(selector.getSelectedFile()+".obj");
        try {
            archivo.createNewFile();
            JOptionPane.showMessageDialog(null,"EL ARCHIVO: "+archivo.getName()+" se ha creado con exito");
        } catch (IOException ex) {
            Logger.getLogger(CONTROLADOR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //METODO PARA ABRIR OBJETOS EN UN FICHERO
    public void escribir_FS(ArrayList<MODELO>lista,File a) throws IOException{
        try {
            //creamos un objeto tipo fileoutstreams
            FileOutputStream fos=new FileOutputStream(a);
            //CRERAMOS UN OBJETO DE TIPO OBJECTOUTPUTSTREAM
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            //recorrido de mi lista para traer mis objetosy guardarlos en el archivo
            for(MODELO elemento:lista){
                oos.writeObject(elemento);
            }
            JOptionPane.showMessageDialog(null, "LOS DATOS SE ESCRIBIERON CON EXITO EN EL ARCHIVO: "+a.getName());
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(CONTROLADOR.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("fallo el fos");
        }
    }
    //METODO PARA LEER EL FICHERO SERIALIZABLE
    public ArrayList<MODELO>leer_FS(File archivo)throws ClassNotFoundException,IOException{
        //DECLARO UN OBJETO DE TIPO OBJECTIMPUTSTREAM
        ObjectInputStream ois=null;
        //DECLARO UN ARRAYLIST DE TIPO MODELO
        ArrayList<MODELO>lista= new ArrayList<MODELO>();
        try{
            FileInputStream fis= new FileInputStream(archivo);
            ois=new ObjectInputStream(fis);
            //EMPEZAMOS A LEER EL FICHERO MEDIANTE EL OBJETO ois
            while(true){
                lista.add((MODELO) ois.readObject());
                
            }
        }catch (IOException ex){
            
        }finally{
            
        }
        return lista;
    }
    
}
