/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas.view;
import com.mycompany.listas.model.*;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String args[]){
        
       ListaLigada lista = new ListaLigada();
       lista.adicionaInicio(10);
       lista.adicionaInicio(9);
       lista.adicionaInicio(8);
       
       System.out.println("Lista:  " + lista.toString());

    
    }
    
}
