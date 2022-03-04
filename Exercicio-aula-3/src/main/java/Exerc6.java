import java.util.Random;
import java.util.Scanner;

public class Exerc6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int entnum, gerado;

        gerado = rand.nextInt(10) + 1;

        do {
            System.out.println("Digite um Numero");

            entnum = entrada.nextInt();

            if (entnum < gerado) {
                System.out.println("O Número é maior");
            } else if (entnum > gerado) {
                System.out.println("O Número é menor");
            }


        } while (gerado != entnum);
        System.out.println("Acertou o número");

        entrada.close();
    }
}
