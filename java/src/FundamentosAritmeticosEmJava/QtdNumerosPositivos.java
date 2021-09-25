// Quantidade de Números Positivos

/* Crie um programa que leia 6 valores. Você poderá receber valores negativos
e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em
seguida, apresente a quantidade de valores positivos digitados.
- Entrada
Você receberá seis valores, negativos e/ou positivos.
- Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é
exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos"
ao final. */
package FundamentosAritmeticosEmJava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QtdNumerosPositivos {

    public static void main(String[] args) {

        List<Double> listNumber = new ArrayList<Double>();
        int valoresPositivos = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {
            listNumber.add(scanner.nextDouble());
            if(listNumber.get(i) > 0){
                valoresPositivos ++;
            }
        }
        System.out.println(valoresPositivos + " valores positivos");
    }
}
