import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double p1 = 2;
        double p2 = 3;
        double p3 = 4;
        double p4 = 1;

        double media = (n1 * p1 + n2 * p2 + n3 * p3 + n4 * p4) / (p1 + p2 + p3 + p4);
        media = Math.floor(media * 10) / 10; // arredonda para uma casa decimal

        System.out.println("Media: " + media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double n5 = sc.nextDouble();
            System.out.println("Nota do exame: " + n5);
            double mediaFinal = (media + n5) / 2;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + mediaFinal);
        }
        sc.close();
    }
}
