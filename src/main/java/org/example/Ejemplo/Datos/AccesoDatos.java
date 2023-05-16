package org.example.Ejemplo.Datos;

import org.example.Ejemplo.Excepciones.AccesoDatosEx;
import org.example.Ejemplo.Excepciones.EscrituraDatosEx;


public interface AccesoDatos {
    public  static final int MAX_REGISTROS = 10;
    public abstract void insertar() throws AccesoDatosEx;
    public abstract void listar()throws AccesoDatosEx;
    public abstract void simularError(boolean simularError) throws AccesoDatosEx;
}
