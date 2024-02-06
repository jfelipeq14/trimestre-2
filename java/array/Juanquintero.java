import java.util.Scanner;

public class Juanquintero {
    public static int[] LlenarArreglo() {
        Scanner scanner = new Scanner(System.in);
        int numeros[];
        numeros = new int[10];
        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese numero: ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
        return numeros;
    }

    public static void ImprimirArreglo(int[] arreglo) {
        for (int i = 0; i <= 9; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static int SumarArreglo(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma;
    }

    public static int NumeroMenor(int[] arreglo) {
        int menor = 999999;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] <= menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    public static int NumeroMayor(int[] arreglo) {
        int mayor = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    public static int Promedio(int[] arreglo) {
        int suma = SumarArreglo(arreglo);
        return suma / arreglo.length;
    }

    public static void Ordenar(int[] arreglo) {
        int element = arreglo[0];
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[i]) {
                    element = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = element;
                }
            }
            System.out.println(element);
        }
    }

    public static void Duplicado(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("El doble de: " + arreglo[i] + " es: " + arreglo[i] * 2);
        }
    }

    public static void main(String[] args) {
        int numeros[];
        // llenar el arreglo
        numeros = LlenarArreglo();
        // Imprimir la suma de todos los elementos del arreglo
        // ImprimirArreglo(numeros);
        Ordenar(numeros);
    }

}
