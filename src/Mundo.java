import proyect.Listas;
import proyect.Numeros;
import proyect.Rectangulo;

import java.util.Scanner;

public class Mundo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean bol=true;
        int value;
        do{
            System.out.println("\nIngre el numero del ejercicio que quieras probar\n 1.-Ejercicio 1 \n 2.-Ejercicio 2 \n 3.-Ejercicio 5 \n 4.-Ejercicio 6 \n 5.-Ejercicio 7 \n 6.-Ejercicio 8 \n 7.-Ejercicio 9  \n 8.-Salir");
            value=sc.nextInt();
            switch (value){

                case 1:
                    System.out.println();
                    System.out.println("Ingresa la altura del rectangulo");
                    int altura=sc.nextInt();
                    System.out.println("Ingresa la base del rectangulo");
                    int base=sc.nextInt();
                    Rectangulo rec=new Rectangulo(base,altura);
                    rec.calcularArea();
                    System.out.println(rec.toString());
                    break;
                case 2:
                    System.out.println();
                    Listas.crearLista();
                    break;
                case 3:
                    System.out.println();
                    Listas.listaPares();
                    break;
                case 4:
                    System.out.println();
                    Listas.listaPaises();
                    break;
                case 5:
                    System.out.println();
                    Numeros.adivina();
                    break;
                case 6:
                    System.out.println();
                    Numeros.mayorMenor();
                    break;
                case 7:
                    System.out.println();
                    Listas.numerosComunes();
                    break;
                case 8:
                       bol=false;
                       break;
                default:
                    System.out.println("Ingresa un numero Valido");
            }
        }while(bol);
    }
}
