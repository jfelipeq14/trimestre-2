package momentouno.src;

public class TablasDeVerdad {
    public static void main(String[] args) {
        boolean v = true;
        boolean f = false;

        System.out.println("Tabla de verdad del operador lógico AND");
        System.out.println("v && v = " + (v && v));
        System.out.println("v && f = " + (v && f));
        System.out.println("f && v = " + (f && v));
        System.out.println("f && f = " + (f && f));

        System.out.println("Tabla de verdad del operador lógico OR");
        System.out.println("v || v = " + (v || v));
        System.out.println("v || f = " + (v || f));
        System.out.println("f || v = " + (f || v));
        System.out.println("f || f = " + (f || f));
    }
}
