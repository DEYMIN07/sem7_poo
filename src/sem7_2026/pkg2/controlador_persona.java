/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem7_2026.pkg2;

import java.util.ArrayList;

/**
 *
 * @author UCA40405
 */
public class controlador_persona {
    ArrayList<persona> listapersonas = new ArrayList();

    public void agregar(persona p){
     listapersonas.add(p);
        System.out.println("persona agregada ");
    }  
    public void Listar(){
        System.out.println("__________lista de personas___________");
    for (persona p :listapersonas)
    {
    p.ver_datos();
    if(p instanceof empleado e){
        e.calcular_sueldo_mensual(30);
    }else if(p instanceof obrero){
        obrero o;
        o= (obrero) p;
        o.calcular_jornal_mensual(25);
    }
    }    
  } 
}
