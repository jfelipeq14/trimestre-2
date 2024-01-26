import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        float nota;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite la nota: ");
        nota = read.nextFloat();
        if (nota >= 3.5) {
            System.out.println("approved");
        } else {
            System.out.println("reprobate");
        }
        read.close();
    }
}
