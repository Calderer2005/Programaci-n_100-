/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /*
        //EJERCICIO 1
        System.out.print("Introduzca la longitud de la lista:\n>");
        
        int n = sc.nextInt();
        int arr[];
        arr = new int[n];
        System.out.println("Ahora introduzca los valores de la lista:");
        
        for(int i = 0;i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max=0;
        max = valorMax(arr,max);
        
        System.out.println("El valor máximo es : "+max);
        */
        
        /*
        //EJERCICO 2
        System.out.println("Introduza un número entero:");
        int num = sc.nextInt();  
    
        int[] arr;
        
        arr = listaDig(num);
        
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Posición: "+i+" Valor: "+arr[i]);
        }
        */
        
        //EJERCICIO 3
        
        System.out.print("1] Calcular factorial \n2] Calcular potencia \n >");
        int op = sc.nextInt();
        
        if(op == 1){
            
            System.out.print("Introduzca un número: \n>");
        
            int n = sc.nextInt();
        
        }else if(op == 2){
            
        }else{
            System.out.println("No era una opción");
        }
        
        /*
        //EJERCICIO 4
        System.out.print("Introduzca la posicón del numero de Fibonacci que desea saber: \n >");
        int n = sc.nextInt();
        int p = n;
        n = numFibonacci(n);
        System.out.println("El número de Fibonacci para la posición "+p+" es : "+n);
        */
        
        /*//EJERCICIO 12
        System.out.print("Introduzca un número entero:\n>");
        int num = sc.nextInt();
        num = numPrimo(num);
        */
    }
    public static int 
    /*EJERCICIO 1
    
    public static int valorMax(int[] arr, int max){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }
    */
    /*EJERCICIO 2
    public static int[] listaDig(int num){
        int lg = 0;
        int f = num;
        int resto ;
        
        for (int i = 0 ;f>0; i++){
            f = f/10;
            lg++;
        }
        int arr[] = new int[lg];
        for (int i = lg-1; i>= 0; i--) {
            resto = num%10;
            num = num/10;
            arr[i] = resto;
        }
        
        return arr;
    }
    */
    
    /*EJERCICIO 4
    public static int numFibonacci(int n){
        int a = 1;
        int b = 0;
        int c = 0;
        if(n >1){
            
            for(int i = 2; i<=n;i++){
                c = a + b;
                b = a;
                a = c;
            }
            
            n = c;
            
        }else if(n==1){
            n = 1;
            
        }else if(n==0){
            n = 0;    
        }
        
        return n;
    }
    */
    
    /*EJERCICIO 12
    public static int numPrimo(int num){
        boolean prime = true;
        for(int i = 2; i < num; i++){
            if (num % i == 0){
                prime = false;
            }
        }
        if(prime)
            System.out.println(num+" es primo");
        else
            System.out.println(num+" no es primo");
        return num;
    }
    */
    
}
