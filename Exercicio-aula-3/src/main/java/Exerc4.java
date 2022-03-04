import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos");
        int alunos;

        alunos = entrada.nextInt();

         switch(alunos) {
            case 10:
             case 20:
                System.out.println("Curso será ministrado na sala I-15");
                break;

                case 30:
                System.out.println("Curso será ministrado na sala I-22");
                break;
            default:
                System.out.println("Numero de alunos errado");
        }
        entrada.close();
    }
}
