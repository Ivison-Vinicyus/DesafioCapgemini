package com.mycompany.project_cap2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Entrada da senha:");
            String password = input.next(); 
            //Entrada inicial da Senha
            System.out.println(verification(password).toString());
        }catch(InputMismatchException e){   
            System.out.println("Falha");
        }input.close();       
    }    
public static String verification(String string) {
    StringBuilder stringBuilder = new StringBuilder();
    Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])"
                                        + "(?=.*\\d)(?=.*[-+_!@#$%^&.,?])"
                                        + "(?=.*{6,}).+$");
    Matcher matcher = pattern.matcher(string);
    //pattern e matcher que vão fazer todas as verificações nessesaria apontadas
    boolean matches = matcher.find(); 
    //Boolean que traz o true ou false da verificação

    if(matches == true){ //If que separa a senha correta e errada
        stringBuilder.append("Saída: Senha atende os requisitos!");
    }else{
        stringBuilder.append("Saída: Senha não atende todos os requisitos!");            
    }if(string.length() < 6){
        int lack = 6 - string.length();
        stringBuilder.append(" Faltam " +lack +" caracteres");
}return stringBuilder.toString();
}
}
