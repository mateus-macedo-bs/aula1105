/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1105;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercici01105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero=");
        numero = teclado.nextInt();
                
        if (numero % 2==0){
            System.out.println("Esse numero é par! "+numero); 
        }else{
            System.out.println("Esse numero é impar! "+numero);  
        }
    }
    
}
