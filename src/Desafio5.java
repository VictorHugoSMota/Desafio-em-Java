//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler
import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu salário:  ");
        double salario = scanner.nextDouble();
        double percentualAumento;
        if (salario <= (double)280.0F) {
            percentualAumento = (double)20.0F;
        } else if (salario <= (double)700.0F) {
            percentualAumento = (double)15.0F;
        } else if (salario <= (double)1500.0F) {
            percentualAumento = (double)10.0F;
        } else {
            percentualAumento = (double)5.0F;
        }



        double valorAumento = salario * (percentualAumento / (double)100.0F);
        double novoSalario = salario + valorAumento;
        double inflacao = 3.8;
        double aumentoReal = valorAumento - salario * (inflacao / (double)100.0F);
        System.out.println("\nSalário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário após aumento: R$ " + novoSalario);
        System.out.println("Valor do aumento real (descontando a inflação): R$ " + aumentoReal);
    }
}
