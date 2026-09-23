import java.util.Scanner;

public class revisao03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas amizades a Riley fez?");
        int amizades = sc.nextInt();

        System.out.println("Digite a nota 1:");
        double a1 = sc.nextDouble();

        System.out.println("Digite a nota 2:");
        double a2 = sc.nextDouble();

        System.out.println("Digite a nota 3:");
        double a3 = sc.nextDouble();

        System.out.println("Quantos exercícios físicos foram realizados (de 0 a 10)?");
        int exerciciosRealizados = sc.nextInt();

        int pontosAlegria = 0;
        int pontosTristeza = 0;

        // Amizades
        if (amizades > 0) {
            pontosAlegria += amizades * 10;
        } else {
            pontosTristeza += 30;
        }

        // Notas
        double media = (a1 + a2 + a3) / 3;

        if (media >= 7) {
            pontosAlegria += 50;
        } else {
            pontosTristeza += 50;
        }

        // Exercícios
        pontosAlegria += exerciciosRealizados * 10;
        pontosTristeza += (10 - exerciciosRealizados) * 10;

        // Resultado
        if (pontosAlegria > pontosTristeza) {
            System.out.println(
                "A mudança para a nova cidade foi uma experiência incrível para a Riley."
            );
        } else {
            System.out.println(
                "A mudança para a nova cidade foi uma experiência desagradável para a Riley."
            );
        }

        sc.close();
    }
}