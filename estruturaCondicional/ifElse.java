package estruturaCondicional;

public class ifElse {
    public static void main(String[] args) {
        double media = 7;

        // se média for >= 7 (aprovado)
        // se média for >= 5 < 7 (reprovado)
        // se não, reprovado 
        if (media >= 7) {
            System.out.println("Aprovado");
            System.out.println("Parabéns pela sua média de " + media);
        } else if (media >= 5) {
            System.out.println("Está de recuperacao");
        } else {
            System.out.println("Infelizmente está reprovado");
        }
    }
}
