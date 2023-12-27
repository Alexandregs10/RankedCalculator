package pro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Insira a quantidade de vitórias que o jogador tem: ");
        Scanner s = new Scanner(System.in);
        int win = s.nextInt();

        System.out.println("Insira a quantidade de derrotas que o jogador tem: ");
        Scanner input2 = new Scanner(System.in);
        int lost = s.nextInt();

        int calculateKD = win - lost;

        if (calculateKD < 0) {
            calculateKD = 0;
        }

        if (calculateKD < 10) {
            System.out.println("Ranking: Ferro");
        } else if (calculateKD >= 11 && calculateKD <= 20) {
            System.out.println("Ranking: Bronze");
        } else if (calculateKD >= 51 && calculateKD <= 80) {
            System.out.println("Ranking: Ouro");
        } else if (calculateKD >= 81 && calculateKD <= 90) {
            System.out.println("Ranking: Diamante");
        } else if (calculateKD >= 91 && calculateKD <= 100) {
            System.out.println("Ranking: Lendário");
        } else if (calculateKD >= 101) {
            System.out.println("Ranking: Imortal");
        }

        System.out.println("\nO Herói tem de saldo de " + win + " vitórias e " + "está no nível " + calculateKD);

        s.close();
    }
}