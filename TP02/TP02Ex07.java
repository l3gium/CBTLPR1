import java.util.Scanner;

public class TP02Ex07
{
     /*
     7. Entrar via teclado com doze valores e armazena-los em uma matriz de ordem 3x4. Apos a
    digitaaoo dos valores solicitar uma constante multiplicativa, que devera multiplicar cada
    valor matriz e armazenar o resultado na propria matriz, nas posicoes correspondentes.
     */

     //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int[][] array = new int[3][4];

        for(int i = 0; i  < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print("Digite o valor na posicao " + (i + 1) + ", " +(j + 1) + ": ");
                array[i][j] = scan.nextInt();
            }
            System.out.println("\n");
        }

        System.out.print("Insira um numero para ser multiplicador: ");
        int constante = scan.nextInt();

        for(int i = 0; i  < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                array[i][j] *= constante;
                System.out.print(array[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
            System.out.print("----");
            System.out.print("\n");
        }
    }
}
