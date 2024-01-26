package momentouno.src;
// Elaborar un algoritmo que permita calcular el número de CDs necesarios para hacer una copia de seguridad, de la información almacenada en un disco cuya capacidad se conoce. Considerar que el disco duro está lleno de información, además expresado en gigabyte. Un CD virgen tiene 700 Megabytes de capacidad y una Gigabyte es igual a 1,024 megabyte

public class Discos {
    public static void main(String[] args) {
        // declaracion de variables
        int cantidadCDs;
        // operaciones
        cantidadCDs = (500 * 1024) / 700 + 1;
        // mostrar datos
        System.out.println(cantidadCDs);
    }
}
