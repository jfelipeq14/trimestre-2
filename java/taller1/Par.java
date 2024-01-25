import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        int numero, n;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        numero = read.nextInt();
        n = numero % 2;
        if (n == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero no es par");
        }
        read.close();
    }
}
