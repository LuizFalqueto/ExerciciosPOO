package exercicio.pkg14;

import java.util.Scanner;

public class Uso {
    private static Scanner scanner;
    public static void main(String[] args) {
       int quant = 2;
		Cliente cliente[] = new Cliente[quant];
		int i = 0;
		while (i < quant) {
			scanner = new Scanner(System.in);
			try {
					System.out.print("Digite o email: ");
					String _email = scanner.nextLine();
					scanner.nextLine();
					System.out.print("Digite o nome do cliente: ");
					String _nome = scanner.nextLine();
					scanner.nextLine();
                                        System.out.print("Digite o numero de celular: ");
					int _celular = scanner.nextInt();
					scanner.nextLine();
                                        System.out.print("Digite o endereço: ");
					String _endereço = scanner.nextLine();
					scanner.nextLine();
					
                                        cliente[i] = new Cliente(_email, _nome, _celular, _endereço);
						System.out.println(cliente[i].toString());					
					i++;
                                    if (i == quant)
                                    System.out.println("\n ============================= \n\nFim");				
			} catch (Exception e) {
				System.out.println("\nNão foi possível cadastrar o cliente, tente novamente!");
				System.out.println(e);
			}
		}
	}
   }
    
