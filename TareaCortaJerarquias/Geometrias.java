/*
  Tarea corta #3
  Mariana Quesada
*/
import java.util.Arrays;

public class Geometrias {
    public static void main(String args[]) {

    Circulo circulo = new Circulo(2.5);
    Rectangulo rectangulo = new Rectangulo(2.0,2.5);
    Triangulo triangulo = new Triangulo(2.0,5.0);

    System.out.println("\nComparacion de circulo con rectangulo:");
    System.out.println("Area rectangulo:");
    System.out.println(rectangulo.calcularArea());
    System.out.println("Area circulo:");
    System.out.println(circulo.calcularArea());
    System.out.println("El area del circulo es mayor que la del rectangulo:");
    System.out.println(rectangulo.compareTo(circulo));
    

    System.out.println("\n**************************\n\nComparacion de triangulo con rectangulo:");
    System.out.println("Area triangulo:");
    System.out.println(triangulo.calcularArea());
    System.out.println("Area rectangulo:");
    System.out.println(rectangulo.calcularArea());
    System.out.println("El area del triangulo es igual que la del rectangulo:");
    System.out.println(rectangulo.compareTo(triangulo));
    }
}