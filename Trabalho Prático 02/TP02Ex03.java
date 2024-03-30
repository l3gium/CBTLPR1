import java.util.Scanner;

public class TP02Ex03
{
    /*Entrar via teclado com 'N' valores quaisquer. O valor 'N' (que representa a quantidade de
    numeros) sera digitado, devera ser positivo, porem menor que vinte. Caso a quantidade não
    satisfaca a restricao, enviar mensagem de erro e solicitar o valor novamente. Apos a
    digitação dos 'N' valores, exibir:
    a. O maior valor;
    b. O menor valor;
    c. A soma dos valores;
    d. A media aritmetica dos valores;
    e. A porcentagem de valores que sao positivos;
    f. A porcentagem de valores negativos;
    
    Apos exibir os dados, perguntar ao usuario de deseja ou nao uma nova execucao do
    programa. Consistir a resposta no sentido de aceitar somente 'S' ou 'N' e encerrar o
    programa em funcao dessa resposta.*/

    //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        char resposta = ' ';
        char answer = ' ';
        do{
            System.out.println("Quantos valores voce tem interesse em digitar? ");
        double quantidade = scan.nextDouble();

        while (quantidade <= 0  || quantidade >= 20)
        {
            System.out.println("Digite uma quantidade positiva menor que 20");
            quantidade = scan.nextDouble();
        }

        double[] num = new double[(int) quantidade];

        //popular array
        for(int i = 0; i < quantidade; i++)
        {
            System.out.printf("Informe o " +  (i+1) + " valor: ");
            num[i] = scan.nextDouble();
        }

        //maior valor
        double maiorValor = num[0];

        for(int j = 0; j < num.length; j++)
        {
            if(num[j] > maiorValor)
                maiorValor = num[j];
        }

        //menor valor

        double menorValor = num[0];

        for(int l = 0; l < num.length; l++)
        {
            if(num[l] < menorValor)
                menorValor = num[l];
        }

        //soma
        double somaValores = 0;

        for(int s = 0; s < num.length; s++)
        {
            somaValores += num[s];
        }

        //porcentagem positivos e negativos
        double quantidadePositivos = 0;
        double quantidadeNegativos = 0;

        for(int p = 0; p < num.length; p++)
        {
            if(num[p] > 0)
                quantidadePositivos++;
            else
                quantidadeNegativos++;
        }
        
        System.out.printf("O maior valor foi: " + maiorValor);
        System.out.printf("\nO menor valor foi: " + menorValor);
        System.out.printf("\nA soma dos valores foi: " + somaValores);
        //media aritmetica
        System.out.println("\nA media aritmetica dos valores foi: " + (somaValores / num.length));
        //porcentagem numeros positivos
        System.out.println("\nA porcentagem de numeros positivos foi: " + (quantidadePositivos / num.length) * 100);
        //porcentagem numeros negativos
        System.out.println("\nA porcentagem de numeros negativos foi: " + (quantidadeNegativos / num.length) * 100);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("Voce deseja uma nova execucao do programa?");
        resposta = scan.next().charAt(0);
        answer = Character.toUpperCase(resposta);

        while(answer  != 'S'  && answer != 'N')
        {
                System.out.println("Resposta invalida. Digite novamente: ");
                resposta = scan.next().charAt(0);
                answer = Character.toUpperCase(resposta);
        }

        } while(answer == 'S');
    }
}
