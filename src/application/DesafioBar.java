package application;

import java.util.Locale;
import java.util.Scanner;

public class DesafioBar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char sexo;
        int cerveja, refrigerante, espetinho;
        double consumo, couvet, ingresso = 0, valorTotal;

        System.out.print("Sexo: ");
        sexo = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        cerveja = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        refrigerante = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        espetinho = sc.nextInt();

        if (sexo == 'm' || sexo == 'M') {
            ingresso = 10.00;
        } else if (sexo == 'f' || sexo == 'F') {
            ingresso = 8.00;
        }

        consumo = cerveja * 5.0 + refrigerante * 3.0 + espetinho * 7.0;

        if (consumo > 30) {
            couvet = 0;
        } else {
            couvet = 4.00;
        }

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo: R$ %.2f%n", consumo);
        if (couvet == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvet);
        }
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);

        valorTotal = consumo + couvet + ingresso;

        System.out.printf("%nValor a pagar = R$ %.2f%n", valorTotal);

    }
}
