
package com.mycompany.project_cap3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao3 {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try{        
        System.out.println("Entrada:");
        String word = input.next();
        System.out.println(anagram(word).toString());        
    }catch(InputMismatchException e){
        System.out.println("Falha");
    }input.close();    
}

public static String anagram(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>(); 
        //Guarda valor das caracteres

        for (int i = 0; i <= string.length(); i++) {

            for (int j = i; j < string.length(); j++) {

                char[] character = string.substring(i, j + 1).toCharArray(); 
                Arrays.sort(character);
                //Array de armazenamento
                String subCaract = new String(character);

                if (map.containsKey(subCaract)) {                
                    map.put(subCaract, map.get(subCaract) + 1);
                }else{
                    map.put(subCaract, 1);
                }
            }
        }int contPares = 0; //Verificação anagrama
        for (String cont : map.keySet()) {

            int n = map.get(cont);
            contPares += (n * (n - 1)) / 2;
        }
        stringBuilder.append("Saída:" + contPares);
        return stringBuilder.toString();
    }   
}