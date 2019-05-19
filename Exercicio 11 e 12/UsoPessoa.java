package ExerciciosPOO;
import java.util.Scanner;
public class UsoPessoa {
     public static void main(String[] args) throws Exception {
        int qtnd = 1, opçao;
        
        Funcionario funcionarios[] = new Funcionario[qtnd];
        
        for(int i=0; i<qtnd ; i++){
            System.out.println("\nCadastro: 1 para Funcionario, 2 para Chefe ou 3 para Diretor: ");
            opçao = new Scanner(System.in).nextInt();
            
            try{
                if(opçao == 1){
                    System.out.println("Nome: ");
                    String nome = new Scanner(System.in).next();
                    System.out.println("Identidade: ");
                    String identidade = new Scanner(System.in).next();
                    System.out.println("Data nascimento (dd/mm/aaaa): ");
                    String dtNasc = new Scanner(System.in).next();
                    System.out.println("Data admissao: ");
                    String dtAdm = new Scanner(System.in).next();
                    System.out.println("Salario: ");
                    double salario = new Scanner(System.in).nextDouble();
                    funcionarios[i] = new Funcionario(nome, identidade, dtNasc, dtAdm, salario);
                }else if(opçao == 2){
                    System.out.println("Nome: ");
                    String nome = new Scanner(System.in).next();
                    System.out.println("Identidade: ");
                    String identidade = new Scanner(System.in).next();
                    System.out.println("Data nascimento (dd/mm/aaaa): ");
                    String dtNasc = new Scanner(System.in).next();
                    System.out.println("Data admissao: ");
                    String dtAdm = new Scanner(System.in).next();
                    System.out.println("Salario: ");
                    double salario = new Scanner(System.in).nextDouble();
                    salario = new Scanner(System.in).nextDouble();
                    System.out.println("Departamento: ");
                    String depto = new Scanner(System.in).next();
                    funcionarios[i] = new Chefe(nome, identidade, dtNasc, dtAdm, salario, depto);
                }else if(opçao == 3){
                    System.out.println("Nome: ");
                    String nome = new Scanner(System.in).next();
                    System.out.println("Identidade: ");
                    String identidade = new Scanner(System.in).next();
                    System.out.println("Data nascimento (dd/mm/aaaa): ");
                    String dtNasc = new Scanner(System.in).next();
                    System.out.println("Data admissao: ");
                    String dtAdm = new Scanner(System.in).next();
                    System.out.println("Salario: ");
                    double salario = new Scanner(System.in).nextDouble();
                    salario = new Scanner(System.in).nextDouble();
                    System.out.println("Departamento: ");
                    String depto = new Scanner(System.in).next();
                    System.out.println("Data promocao: ");
                    String dtPromo = new Scanner(System.in).next();
                    funcionarios[i] = new Diretor(nome, identidade, dtNasc, dtAdm, salario, depto, dtPromo);
                }
            }catch (Exception e){
                System.out.println(e);
		i--;
                continue;
            }
        }
        for(int i=0; i < qtnd; i++) {
            System.out.println("\n" + funcionarios[i].toString());
	}
        
    }
}
