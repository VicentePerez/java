package PARSEO;
import java.util.Scanner;


public class PARSEO{ 

    public PARSEO(){
    }
    public void suma(){
    	Scanner texto = new Scanner(System.in);
    	System.out.println("Introduce un numero");
    	String numero1 = texto.next();
    	System.out.println("Introduce un numero");
    	String numero2 = texto.next();
    	
    	int num1 = Integer.parseInt(numero1);
    	int num2 = Integer.parseInt(numero2);
    	int resultado = num1 + num2;
    	
    	System.out.println("La suma de " + num1 + " mas " + num2 + " = " + resultado);
   
    	
    }
}
