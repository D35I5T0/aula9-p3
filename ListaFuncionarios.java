import java.util.ArrayList;
import java.util.Scanner;
public class ListaFuncionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        
        do {
            System.out.println("Informe o nome do funcionário: ");
            String nome = sc.nextLine();
            System.out.println("Informe o salário anual do funcionário: ");
            double salarioAnual = Double.parseDouble(sc.nextLine());
            System.out.println("Informe a idade do funcionário: ");
            int idade = Integer.parseInt(sc.nextLine());
            Funcionario funcionario = new Funcionario(nome, salarioAnual, idade);
            listaFuncionarios.add(funcionario);
            System.out.println("0 - Finalizar. Digite qualquer outro número para continuar");
            op = Integer.parseInt(sc.nextLine());
        } while (op != 0);

        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getIdade() < 30 && funcionario.getSalarioAnual() > 50000) {
                System.out.println(funcionario);
            }
        }
        sc.close();
    }
}
