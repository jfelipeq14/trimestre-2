import java.util.Scanner;

public class Contrario {
    public static void main(String[] args) {
        float numero;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite el numero: ");
        numero = read.nextFloat();
        System.out.println(numero * -1);

        read.close();
    }
}
