import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Numeros de zumbis primeira partida");
        int valor1 = valorTeclado.nextInt();
        System.out.println("Numeros de zumbis segunda partida");
        int valor2 = valorTeclado.nextInt();
        System.out.println("Numeros de zumbis terceira partida");
        int valor3 = valorTeclado.nextInt();
        int total = valor1 + valor2 +valor3;


        System.out.println("Total de Zumbis: " + total);
        System.out.println("Média de Zumbis: " + total/3);

        valorTeclado.close();
    }

}
