package exercicio;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura em graus celsius: ");
        double C = scanner.nextDouble();

        double K = C + 273.15;
        System.out.println("A temperatura de " + C + "° celsius é equivalente a " + K + " Kelvin");

        double F = C * 1.8 + 32;
        System.out.println("A temperatura de " + C + "° celsius é equvalente a " + F + "° Fahrenheit");
    }
}
