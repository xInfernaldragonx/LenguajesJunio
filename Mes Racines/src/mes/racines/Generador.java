/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mes.racines;

import java.util.ArrayList;


/**
 *
 * @author Manuel
 */
class Nodo{
     String dato;
    ArrayList<Nodo> hijos;
    
    public Nodo(){
        hijos = new ArrayList<Nodo>();
        
    }
}

public class Generador {
   private Nodo Raiz;
 
    
    public Generador(){
        
    }
    
    public void Generar(){
        try{
            String dotpath= "C:\\Program Files (x86)\\Graphviz 2.28\\bin\\dot.exe";
            String fileInputPath = "grafo1.txt";
            String fileOutputPath = "arbol.jpg";
            String tParam = "-Tjpg";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotpath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            
        }
    }
}
