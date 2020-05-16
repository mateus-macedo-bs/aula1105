/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio3;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double nota, nota_baixo,nota_rec;
         int nota_acima;
         String nomeUsuario;
         
         nota_baixo = 3.99;
         nota_rec = 5.99;
        Scanner teclado= new Scanner(System.in); 
        
        System.out.println("Digite seu nome:");
        nomeUsuario = teclado.next();
        
        System.out.println("Digite sua nota");
        nota = teclado.nextInt();
        
         if (nota <= nota_baixo){
            System.out.println(nomeUsuario+" Situação"+ nota+ "Situação:Reprovado"); 
        }else{
            if (nota > nota_baixo && nota < nota_rec ) {
                System.out.println(nomeUsuario+" Situação"+ nota+ "Situação:Recuperação"); 
            }else{
                System.out.println(nomeUsuario+" Situação"+ nota+ "Situação Aprovado");
            } 
        }
    }
    
}
