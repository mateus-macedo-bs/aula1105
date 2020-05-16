/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercici02;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercici02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ano, ano_passado,ano_futuro;
        
        ano_passado = 2019;
        ano_futuro = 2021;
        Scanner teclado= new Scanner(System.in); 
        
        System.out.println("Digite um ano");
        ano = teclado.nextInt();
        
         if (ano <= ano_passado){
            System.out.println(ano +" é do passado"); 
        }else{
            if (ano > ano_passado && ano < ano_futuro ) {
                System.out.println(ano+ " é do presente"); 
            }else{
                System.out.println(ano + "é do futuro");
            } 
        }
        
        
    }
    
}
