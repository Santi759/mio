import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Ejercicio_1
        ArrayList <Integer> listaEnteros = new ArrayList<>();
        for (int i = 1; i < 6; i ++) {
            listaEnteros.add(i);
        }

        //Ejercicio_2
        ArrayList <String> listaNombres = new ArrayList<>();
        listaNombres.add("Santiago Andrez");
        listaNombres.add("Pepon Soler");
        listaNombres.add("DOn Satir");

        System.out.println(listaNombres);

        //Ejercicio_3
        System.out.println(listaEnteros);

        //Ejercicio_4
        ArrayList <Character> listaCaracter = new ArrayList<>();
        listaCaracter.add('A');
        listaCaracter.add('B');
        listaCaracter.add('C');
        listaCaracter.add('D');
        listaCaracter.add('E');
        listaCaracter.add('%');
        listaCaracter.add('&');
        System.out.println(listaCaracter.size());

        //Ejercicio_5
        listaNombres.remove(2);
        System.out.println(listaNombres);

        //Ejercicio_6
        ArrayList <Integer> listaEnteros1 = new ArrayList<>();
        ArrayList <Integer> listaEnteros2 = new ArrayList<>();

        listaEnteros1.add(3);

        if (listaEnteros1.isEmpty()){
            System.out.println("La lista 1 esta vacia");
        }
        if (listaEnteros2.isEmpty()){
            System.out.println("La lista 2 esta vacia");
        }

        //Ejercicio_7
        int mayor=0;
        listaEnteros1.add(10);
        listaEnteros1.add(25);
        listaEnteros1.add(-3);
        listaEnteros1.add(6);

        for (int i=0;i<listaEnteros1.size();i++){
            if (listaEnteros1.get(i)>mayor){
                mayor=listaEnteros1.get(i);
            }
        }
        System.out.println("El número mayor de la lista es: "+mayor);

        //Ejercicio_8
        Random random = new Random();
        ArrayList<Integer> listaEnt = new ArrayList<>();
        ArrayList<Integer> listaEnterosCopia = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaEnt.add(random.nextInt(100));
        }
        listaEnterosCopia.addAll(listaEnt);
        // Tambien se puede usar {ArrayList<Integer> listaEnterosCopia = new ArrayList<>(listaEnt);} al crear la lista
        System.out.println("Lista original: " + listaEnt);
        System.out.println("Copia lista original: " + listaEnterosCopia);

        //Ejercicio_9

        Random random1 = new Random();
        ArrayList<Integer> listaEnt2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaEnteros.add(random.nextInt(100));
        }
        System.out.println(listaEnteros);
        Collections.reverse(listaEnteros);
        System.out.println(listaEnteros);
        
    }
        }
