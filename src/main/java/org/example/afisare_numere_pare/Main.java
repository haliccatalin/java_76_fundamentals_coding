package org.example.afisare_numere_pare;

// afisarea numerelor pare de la 1 la 100
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){

            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
    }
}
