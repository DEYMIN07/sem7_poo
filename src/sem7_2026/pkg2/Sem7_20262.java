/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem7_2026.pkg2;

import java.util.HashSet;

/**
 *
 * @author UCA40405
 */
public class Sem7_20262 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona p1 = new persona(35);
        p1.setNombre("juan");
        p1.ver_datos();
        
        empleado e1=new empleado(30);
        e1.ver_datos();
        e1.setSalario(3000);
        e1.setNombre("fredy");
        e1.ver_datos();
        
        obrero o1= new obrero(12);
        o1.setNombre("oscar");
        o1.setJornal(50);
        o1.ver_datos();
        
        controlador_persona cp1= new controlador_persona();
        cp1.agregar(p1);
        cp1.agregar(e1);
        cp1.agregar(o1);
        
        cp1.Listar();
                 
    }
    
}
