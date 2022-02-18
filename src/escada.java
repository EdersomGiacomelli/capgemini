import java.util.Scanner;

public class escada {
    public static void main(String[] args) throws Exception {
        //inserção de dados no sistema (solicita o valor a ser analisado)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor desejado: ");
        int numero = entrada.nextInt();
        int i, j;
        //irá posicionar o número de caracteres, conforme o número informado
        for (i = 1; i <= numero; i++){

            for(j = numero - i; j>=1; j--)
                System.out.print(" ");
            
            for (j = 1; j <= i; j++)
                System.out.print("*");
            
            System.out.println();
        }
        entrada.close();
    }
}
