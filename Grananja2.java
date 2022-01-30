//Grananja2: Sintaksa1 uraditi ponovo, koristeci grananja kako bismo se ogradili
// od nemogucih izracunavanja povrsina (kakvi celi brojevi moraju da budu visina, sirina i duzina?)

package Domaci3011;

import java.util.Scanner;

public class Grananja2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu prostorije u metrima ");
        double duzinaProstorije = s.nextDouble();
        if(duzinaProstorije <= 0 ){
            System.out.print("Ne mozete uneti nulu ili negativan broj.");
        }
        else{
            System.out.print("Unesite sirinu prostorije u metrima ");}

        double sirinaProstorije = s.nextDouble();
        if(sirinaProstorije <= 0){
            System.out.print("Ne mozete uneti nulu ili negativan broj.");
        }
        else{
            System.out.print("Unesite visinu prostorije u metrima ");}

        double visinaProstorije = s.nextDouble();
        double povrsinaProstorije = 2 * (duzinaProstorije * visinaProstorije) + 2 * (sirinaProstorije * visinaProstorije) + (duzinaProstorije * visinaProstorije);
        if(visinaProstorije <= 0){
            System.out.println("Ne mozete uneti nulu ili negativan broj.");
        }
        else{
            System.out.print("Povrsina okrecenog dela prostorije je " + povrsinaProstorije + " m2");
        }







    }

}

