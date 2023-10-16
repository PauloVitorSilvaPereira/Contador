import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva o primeiro parâmetro:");
        int parametro1 = leitura.nextInt();
        System.out.println("Escreva o segundo parâmetro:");
        int parametro2 = leitura.nextInt();

        if (parametro2 > parametro1) {
            int numeroDaContagem = parametro2 - parametro1;
            int contador = 1;
            for (int i = 0; i < numeroDaContagem; i++) {
                System.out.println("Imprimindo o número " + contador);
                contador++;
            }
        } else {
            System.out.println("O parâmetro 2 deve ser maior que o 1");
        }
    }
}