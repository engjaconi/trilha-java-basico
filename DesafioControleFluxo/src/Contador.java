import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            contar(parametroUm, parametroDois);

        } catch (InputMismatchException ex) {
            System.err.println("Os parametros devem ser numeros!");
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        } finally {
            terminal.close();
        }
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
