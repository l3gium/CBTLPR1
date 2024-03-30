import java.util.Scanner;

public class TP02Ex02 
{
    /*
     Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
     erro, se necessário. Após a digitação, exibir:
     a. O maior valor;
     b. A soma dos valores;
     c. A média aritmética dos valores.
     */

     //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        double[] num = new double[10];

        //preencher array
        for(int i = 0; i < num.length; i++)
        {
            do
            {
                System.out.println("Digite o " + (i + 1) + "o. valor");
                num[i] = scan.nextDouble();

                if(num[i] <= 0)
                {
                    System.out.println("Por favor digite um valor positivo: ");
                }
            } while(num[i] <= 0);
        }

        //maior numero
        double maiorNum = num[0];

        for(int k = 0; k < num.length; k++)
        {
            if(num[k] > maiorNum)
                maiorNum = num[k];
        }

        double somaValores = 0;
        //soma
        for(int s = 0; s <  num.length; s++)
        {
            somaValores += num[s];
        }

        //exibição
        System.out.println("\nO maior numero foi: " + maiorNum);
        System.out.println("\nA soma dos valores e: " + somaValores);
        System.out.println("\nA media aritmetica dos valores e: " + (somaValores / num.length));
    }
}
