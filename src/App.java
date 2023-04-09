import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Passo 1: Processamento / Armazenamento
        int numero1;
        Scanner teclado = new Scanner(System.in);
        numero1 = teclado.nextInt();
        teclado.close();
        // Passo 2: Juntar frase e número
        System.out.println("O número informado foi:" + numero1);

    }
}