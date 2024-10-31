package Application;

import java.util.Scanner;

import entidades.Pecas;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int num1 = sc.nextInt();
        double valor1 = sc.nextDouble();


        int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double totalPeca1 = Pecas.valorAPagar(num1, valor1);
        double totalPeca2 = Pecas.valorAPagar(num2, valor2);

        double somaTotal = Pecas.somarTotal(totalPeca1, totalPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f",somaTotal);




    }


}
