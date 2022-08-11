package proyect;

import java.util.Random;
import java.util.Scanner;

public class Numeros {


    public static void adivina(){
        Random random = new Random();
        Scanner scnr= new Scanner(System.in);
        int rdm = random.nextInt(10 + 1) + 1;
        boolean bol=true;
        int contador = 0;
        do {
            System.out.println("Adivina el numero del 1 al 10");
            int value= scnr.nextInt();
            contador++;
            if(contador == 5){
                System.out.println("Tu chance se acabo");
                bol=false;
            }else{
                if(value==rdm){
                    System.out.println("Adivinaste el numero");
                    bol=false;
                }else{
                    if(value > rdm){
                        System.out.println("El numero es mas chico");
                    }else{
                        if(rdm > value){
                            System.out.println("El numero es mas grande");
                        }
                    }
                }
            }
        } while (bol);
    }

    public static void mayorMenor(){
        int a,b,c;
        Scanner scnr= new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        a= scnr.nextInt();
        System.out.println("Ingresa el segundo numero");
        b= scnr.nextInt();
        System.out.println("Ingresa el tercer numero");
        c= scnr.nextInt();

        if(a>b && b>c){
            System.out.println("Grande: "+a+" Mediano: "+b+" Chico: "+c);
        }else{
            if (a>c && c>b)
                System.out.println("Grande: "+a+" Mediano: "+c+" Chico: "+b);
            else{
                if (b>a && a>c)
                    System.out.println("Grande: "+b+" Mediano: "+a+" Chico: "+c);
                else{
                    if (b>c && c>a)
                        System.out.println("Grande: "+b+" Mediano: "+c+" Chico: "+a);
                    else{
                        if(c>a && a>b)
                        System.out.println("Grande: "+c+" Mediano: "+a+" Chico: "+b);
                        else{
                            if(c>b && b>a)
                                System.out.println("Grande: "+c+" Mediano: "+b+" Chico: "+a);
                        }
                    }
                }
            }
        }


    }

    

    public static void main(String[] args) {
        adivina();
    }

}
