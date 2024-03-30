import java.util.Scanner;

public class TP02Ex01 
{
    /*Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
    Caso contrário solicitar novamente apenas o segundo valor. */

    //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int num1 = scan.nextInt();

        System.out.println("\nDigite o segundo valor:");
        double num2 = scan.nextDouble();

        while(num2 < num1)
        {
            System.out.println("O segundo valor tem que ser maior que o primeiro");
            num2 = scan.nextDouble();
        }

        System.out.println("O primeiro valor foi: " + num1);
        System.out.println("\nO segundo valor foi: " + num2);
    }
}
