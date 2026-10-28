package lkeksperimentkocke;

import java.util.Random;

public class LKeksperimentkocke {

    public static void main(String[] args) {

        Random rmd = new Random();

        int kocka1;
        int kocka2;
        int brojac = 0;

        do {

            kocka1 = rmd.nextInt(6) + 1;
            kocka2 = rmd.nextInt(6) + 1;

            brojac++;

            System.out.println("Bacanje " + brojac + ". : " + kocka1 + " i " + kocka2);
        } while (kocka1 + kocka2 !=2);
//        jer je skala 1-6, jedini moguc zbir da se dobije br 2 jeste 1+1

        System.out.println("Kraj igre! Zmajske oci su pale nakog " + brojac + " pokusaja!");

    }

}
