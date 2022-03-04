import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {

        Scanner entradanpa = new Scanner(System.in);
        System.out.println("Digite o valor da NPA");
        int npa = entradanpa.nextInt();
        if(npa>= 60)
        {
            System.out.println("Aprovado");
        }
        else if(npa<30)
        {
            System.out.printf("Reprovado sem Np3");
        }
        else if(npa<60 || npa>=30)
        {
            System.out.println("Ficou de Np3");
            System.out.println("Digite a nota da Np3");
            int np3 = entradanpa.nextInt();
            int nfa =( np3 + npa )/2;

if(nfa>=50)
    System.out.printf("Aprovado");
        }
else
        {
            System.out.printf("Reprovado");
        }
        entradanpa.close();
    }
}
