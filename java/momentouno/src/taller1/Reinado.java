import java.util.Scanner;

public class Reinado {
    public static void main(String[] args) {
        int estatura, busto, cintura, cadera;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite la estatura: ");
        estatura = read.nextInt();
        System.out.print("Digite el busto: ");
        busto = read.nextInt();
        System.out.print("Digite la cintura: ");
        cintura = read.nextInt();
        System.out.print("Digite la cadera: ");
        cadera = read.nextInt();

        if (estatura >= 170 && busto == 90 && cintura == 60 && cadera == 90) {
            System.out.println("Reina guajira!");
        } else {
            System.out.println("Nah...");
        }
        read.close();
    }
}
