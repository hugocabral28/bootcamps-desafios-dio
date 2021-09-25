// Exibindo Números Pares

/* Crie um programa que leia um número e mostre os números pares até esse
número, inclusive ele mesmo.
- Entrada
Você receberá 1 valor inteiro N, onde N > 0.
- Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
*/
package FundamentosAritmeticosEmJava;

import java.util.Scanner;

public class ExibirNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for(int i = 2; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
