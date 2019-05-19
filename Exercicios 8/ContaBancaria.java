package contabancaria;
import java.util.Scanner;
public class ContaBancaria {
    private static Scanner scanner;
    public static void main(String[] args)throws Exception {
        try{
            int qntd = 2;
            Conta conta[] = new Conta[qntd];
                for(int i=0 ; i<qntd ; i++){
                    scanner = new Scanner(System.in);
                        System.out.println("Digite o nome do correntista: ");
                        String _nome = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("Digite o saldo do correntista: ");
                        double _saldo = scanner.nextDouble();
                        conta[i] = new Conta(_nome,_saldo);
                }
                for(int j=0 ; j<qntd; j++){
                    System.out.println(conta[j].toString());
                }
        }catch (Exception e){
                   System.out.println("Nao foi possivel cadastrar.L"); 
        }
    }
    
}
