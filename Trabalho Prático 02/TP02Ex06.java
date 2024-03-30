import java.util.Scanner;

public class TP02Ex06
{
    /*
     6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
     */

     //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        String[][] array = new String[2][3];

        for(int i = 0; i  < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Digite o nome na posicao " + (i + 1) + ", " +(j + 1) + ": ");
                array[i][j] = scan.nextLine();
            }
            System.out.println("\n");
        }

        for(int i = 0; i  < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(array[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
            System.out.print("----");
            System.out.print("\n");
        }
    }
}