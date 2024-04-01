import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Num n1 = new Num();
        Num n2 = new Num();
        Num res = new Num();

        System.out.printf("Digite o valor 1:");
        n1.setValor(scanner.nextInt());
        System.out.printf("Digite o valor 2:");
        n2.setValor(scanner.nextInt());
        res.setValor(n1.getValor() + n2.getValor());
        System.out.printf("A soma de %d e %d é igual a %d", n1.getValor(), n2.getValor(), res.getValor());

    }

    
}
