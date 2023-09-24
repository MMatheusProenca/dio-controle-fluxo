package dio.matheus.contador;

import dio.matheus.exception.ParametrosInvalidosException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                //chamando o método contendo a lógica de contagem
                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = scanner.nextInt();
                System.out.println("Digite o segundo parâmetro");
                int parametroDois = scanner.nextInt();
                contar(parametroUm, parametroDois);
                break;
            }catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.err.println(exception.getMessage());
            }catch (InputMismatchException e ){
                System.err.println("Os parâmetros precisão ser números inteiros.");
                scanner.nextLine();
            }
        }


    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois || parametroDois == parametroUm){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem ; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
