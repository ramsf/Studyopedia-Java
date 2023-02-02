import java.util.Scanner;

public class treinoinsercaodedados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int x;
    System.out.println("Digite o valor de x");
    x = entrada.nextInt();
    int y;
    System.out.println("Agora digite o valor de y");
    y = entrada.nextInt();
    int z;
    System.out.println("Por fim diga o valor de z");
    z = entrada.nextInt();
    int soma = x + y + z;
    System.out.println("a soma dos valores e: " + soma);
    }
}
