package momentouno.src;
// crear una clase que declare dos numeros y haga las siguientes operaciones

// sumar, restar, multiplicar, dividir

public class Calculadora {
    public static void main(String[] args) {
        // declaracion de variables
        double num1, num2, suma, resta, multiplicacion, division;
        // agregar un valor a una variable
        num1 = 4;
        num2 = 2;

        // operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        // mostrar datos
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + multiplicacion);
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + division);
    }
}