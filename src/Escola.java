import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("Informe as 8 notas anuais (valores de 0.0 a 10.0):");
        for (int i = 0; i < 8; i++) {
            while (true) {
                System.out.printf("Nota %d: ", i + 1);
                if (!sc.hasNextDouble()) {
                    System.out.println("Valor inválido. Digite um número.");
                    sc.next();
                    continue;
                }
                double v = sc.nextDouble();
                if (v < 0.0 || v > 10.0) {
                    System.out.println("Nota deve estar entre 0.0 e 10.0. Tente novamente.");
                    continue;
                }
                notas[i] = v;
                break;
            }
        }

        double[] bimestre = new double[4];
        for (int i = 0; i < 4; i++) {
            bimestre[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2.0;
        }

        double semestre1 = (bimestre[0] + bimestre[1]) / 2.0;
        double semestre2 = (bimestre[2] + bimestre[3]) / 2.0;
        double mediaFinal = (semestre1 + semestre2) / 2.0;

        System.out.println();
        System.out.printf("Práticas%n%n");
        System.out.printf("1o Bimestre: %.1f%n", bimestre[0]);
        System.out.printf("2o Bimestre: %.1f%n", bimestre[1]);
        System.out.printf("1o Semestre: %.1f%n", semestre1);
        System.out.println("----------------------");
        System.out.printf("3o Bimestre: %.1f%n", bimestre[2]);
        System.out.printf("4o Bimestre: %.1f%n", bimestre[3]);
        System.out.printf("2o Semestre: %.1f%n", semestre2);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        sc.close();
    }
}