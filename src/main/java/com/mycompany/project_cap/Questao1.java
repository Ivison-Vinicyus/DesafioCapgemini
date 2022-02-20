
package com.mycompany.project_cap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    try{
        System.out.println("Entrada:");        
        int size = input.nextInt();
        //Entrada do valor de * desejados
        System.out.println(ladder(size).toString());
    }catch(InputMismatchException e){
    System.out.println("Falha");
    }
input.close();
}
public static String ladder(int size){
    StringBuilder stringBuilder = new StringBuilder();
    for (int i=0; i<size; i++) {
        for (int j=1; j<size-i; j++) {
            stringBuilder.append(" ");
            //For para imprimir os espaços em branco
        }for (int k=0; k <=i; k++) {
            stringBuilder.append("*");
            //For para imprimir os asteriscos
        }stringBuilder.append("\n");          
    }return stringBuilder.toString();       
}
}