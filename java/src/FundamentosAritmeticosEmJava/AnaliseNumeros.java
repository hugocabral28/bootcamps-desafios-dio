// Análise de Números

/* Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos
valores informados são pares, quantos valores informados são ímpares, quantos
valores informados são positivos e quantos valores informados são negativos.
- Entrada
Você receberá 5 valores inteiros.
- Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por
linha e não esquecendo o final de linha após cada uma. */

package FundamentosAritmeticosEmJava;

import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int par  = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int  numero;

        for (int i = 0; i < 5; i++) {
            numero = leitor.nextInt();
            if (numero > 0){
                positivo++;
            }
            if (numero < 0){
                negativo++;
            }

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println(par +" par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");
    }
}
