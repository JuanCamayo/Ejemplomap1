/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author juan.camayo
 */
public class Cliente {

    private String nombre;
    
    private String empresa;

  
    
    private String idcliente;
    

    public Cliente() {
    }

    public Cliente(String nombre, String empresa, String idcliente) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public String toString() {
        return  nombre + ","+ empresa + "," + idcliente;
    }
    
   
}

