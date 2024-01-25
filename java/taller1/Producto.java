import java.util.Scanner;

public class Producto {
    public static void main(String[] args) {
        int cantidad, valor, total;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite la cantidad que compro: ");
        cantidad = read.nextInt();
        System.out.print("Digite el valor del producto: ");
        valor = read.nextInt();
        total = cantidad * valor;
        System.out.println("Valor de la compra: " + total);
        read.close();
    }
}
