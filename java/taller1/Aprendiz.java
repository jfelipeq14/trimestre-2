import java.util.Scanner;

public class Aprendiz {
    public static void main(String[] args) {
        String nombre, identificacion;
        float nota;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite el nombre: ");
        nombre = read.next();
        System.out.print("Digite la identificacion: ");
        identificacion = read.next();
        System.out.print("Digite la nota: ");
        nota = read.nextFloat();

        System.out.println("Nombre: " + nombre);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Nota: " + nota);

        read.close();
    }
}
