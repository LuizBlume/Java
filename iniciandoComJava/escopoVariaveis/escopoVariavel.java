package escopoVariaveis;

public class escopoVariavel {
    public static void main(String[] args) {
        int count = 2;
        if (count == 1) {
            int salario = 1200;
            System.out.println("O salário é: " + salario);
        } else {
            double salario = 1000;
            System.out.println("O salário é: " + salario);
        } 
    }
}
