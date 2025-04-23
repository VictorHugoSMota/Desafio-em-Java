import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite o seu salário: ");
            double salario = scanner.nextDouble();

            double percentualAumento;

            if (salario <= 280.0) {
                percentualAumento = 20.0;
            } else if (salario <= 700.0) {
                percentualAumento = 15.0;
            } else if (salario <= 1500.0) {
                percentualAumento = 10.0;
            } else {
                percentualAumento = 5.0;
            }

            double valorAumento = salario * (percentualAumento / 100.0);
            double novoSalario = salario + valorAumento;
            double inflacao = 3.8;
            double aumentoReal = valorAumento - salario * (inflacao / 100.0);

            System.out.println("\nSalário antes do reajuste: R$ " + salario);
            System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
            System.out.println("Valor do aumento: R$ " + valorAumento);
            System.out.println("Novo salário após aumento: R$ " + novoSalario);
            System.out.println("Valor do aumento real (descontando a inflação): R$ " + aumentoReal);

            System.out.print("\nDeseja calcular outro salário? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nPrograma encerrado.");
        scanner.close();
    }
}
