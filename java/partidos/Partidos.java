// Elaborar un algoritmo que permita ingresar el número de partidos ganados, perdidos y empatados, por algún equipo en el torneo apertura, se debe mostrar su puntaje total, teniendo en cuenta que por cada partido ganado obtendrá 3 puntos, empatado 1 punto y perdido O puntos.

import java.util.Scanner;

public class Partidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ganados, perdidos, empatados, puntajeTotal;

        System.out.println("Ingrese el numero de partidos ganados: ");
        ganados = sc.nextInt();

        System.out.println("Ingrese el numero de partidos empatados: ");
        empatados = sc.nextInt();

        System.out.println("Ingrese el numero de partidos perdidos: ");
        perdidos = sc.nextInt();

        puntajeTotal = (ganados * 3) + (empatados * 1) + (perdidos * 0);

        System.out.println("El puntaje total es: " + puntajeTotal);

        sc.close();
    }
}
