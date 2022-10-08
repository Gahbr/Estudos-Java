import javax.swing.*;
import java.lang.*;
import java.io.*;
import java.util.*;
public class Palindromo {
    String entrada = JOptionPane.showInputDialog("Teste de palindromos:");

    public static String reverse(String input){
        if(input ==null || input.isEmpty()){
            return input;
        }
    return input.charAt(input.length()-1) + reverse(input.substring(0, input.length() - 1));
    }

    public static boolean ehPalindromo(StringBuilder palavra){
        return palavra.toString().equals((palavra.reverse().toString()));
    }

    public static boolean isPalindrome(StringBuilder input) {
        return input.toString().equals(input.reverse().toString());
    }

    public static void main(String[] args) {
       // System.out.println( isPalindrome( new StringBuilder("anna")));

        System.out.println(ehPalindromo(new StringBuilder()));
       // System.out.println(reverse("annb"));





    }

}