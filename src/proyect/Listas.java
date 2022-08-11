package proyect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    
    public static String upperCaseFirst(String val){
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return  new String(arr);
    }
    public static void crearLista(){
        List<String> lista = new ArrayList<>();

        lista.add("juan");
        lista.add("pedor");
        lista.add("jose");
        lista.add("maria");
        lista.add("sofia");
        int itr=0;
        for (String elemtn: lista) {
            if(itr==0){
                String output = upperCaseFirst(elemtn);
                elemtn = output;
            }
            System.out.println(elemtn);
            itr++;
        }
    }

    public static void listaPares(){
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(8);
        lista.add(5);
        lista.add(2);
        lista.add(33);
        lista.add(54);
        lista.add(22);
        lista.add(6);
        lista.add(88);
        lista.add(13);

        List<Integer> pares= lista.stream().filter(elmt -> elmt%2==0).collect(Collectors.toList());
        pares.forEach(System.out::println);

    }

    public static void listaPaises(){
        List<String> paises = Arrays.asList("Rusia", "Estados Unidos", "Brasil", "Canada", "México");
        List<String> vocales = Arrays.asList("a", "e", "i", "o", "u");
        List<String> new_paises= paises.stream().filter(elmt -> vocales.contains(elmt.substring(elmt.length()-1))).map(elemnt -> elemnt.toUpperCase()).collect(Collectors.toList());

        new_paises.forEach(System.out::println);

    }

    public static void numerosComunes(){
        List<Integer> a = Arrays.asList(1,2,4,6,8,0,3,44,52,43,129);
        List<Integer> b = Arrays.asList(23,4,6,2,34,7,99,52,5,8);
        List<Integer> new_list= a.stream().filter(elmt -> b.contains(elmt)).collect(Collectors.toList());
        new_list.forEach(System.out::println);
    }



    public static void main(String[] args) {
        numerosComunes();
    }

}
