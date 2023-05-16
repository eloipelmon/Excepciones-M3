package org.example;

import org.example.Ejemplo.Datos.*;
import org.example.Ejemplo.Datos.*;
import org.example.Ejemplo.Excepciones.AccesoDatosEx;
import org.example.model.Division;
import org.example.model.IndeterminacionEx;

public class Main {
    public static void main(String[] args) throws AccesoDatosEx {
        AccesoDatos accesoDatos = new ImplementacionOracle();
        accesoDatos.simularError(false);
        ejecutar(accesoDatos, "listar");

    }
    public static void ejecutar(AccesoDatos datos,String operacion) {
        try{
            if(operacion.equals("listar")){
                datos.listar();
            }
            else if(operacion.equals("insertar")){
                datos.insertar();
            }
            else{
                System.out.println("No se proporciono ninguna operacion conocida");
            }
        }catch (AccesoDatosEx ex){
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);

        }catch (Exception ex){
            System.out.println("Error general");
            ex.printStackTrace(System.out);
        }
        finally {
            System.out.println("Procesar finally.");
        }
    }
}