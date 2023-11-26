package reservaPassagens;
import java.util.*;

public class Main {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("Escolha uma opção:");
	            System.out.println("1. Cadastrar novo voo");
	            System.out.println("2. Consultar Voos");
	            System.out.println("3. Cadastrar novo passageiro");
	            System.out.println("4. Consultar Passageiro");
	            System.out.println("5. Reservar assento");

	            
	            
	            System.out.println("0. Sair");

	            opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    cadastrarNovoVoo();
	                    break;
	                case 2:
	                    Voo.consultarVoos();
	                    break;
	                case 3:
	                	cadastrarPassageiro();
	                	break;
	                case 4:
	                	Passageiro.consultarPassageiro();
	                	break;
	                case 5:
	                	 System.out.println("Digite o documento do passageiro que deseja reservar um assento:");
	                	 String documentoPassageiro = scanner.nextLine();

	                	 Passageiro passageiro = null;
	                	 for (Passageiro p : Passageiro.getPassageirosCadastrados()) {
	                	     if (p.getNumeroDocumento().equals(documentoPassageiro)) {
	                	         passageiro = p;
	                	         break;
	                	     }
	                	 }

	                	 if (passageiro == null) {
	                	     System.out.println("Passageiro não encontrado.");
	                	     break;
	                	 }

	                	 System.out.println("Digite o número do voo que deseja reservar um assento:");
	                	 int numeroVooEscolhido = scanner.nextInt();
	                	 scanner.nextLine();

	                	 Voo voo = null;
	                	 for (Voo v : Voo.getVoosCadastrados()) {
	                	     if (v.getNumeroVoo() == numeroVooEscolhido) {
	                	         voo = v;
	                	         break;
	                	     }
	                	 }

	                	 if (voo == null) {
	                	     System.out.println("Voo não encontrado.");
	                	     break;
	                	 }

	                	 voo.reservarAssento(passageiro);
	                	 break;

	                case 0:
	                    System.out.println("Saindo do programa. Até logo!");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 0);
	    }
	  
	 
	    private static void cadastrarPassageiro() {
	    	Passageiro novoPassageiro = new Passageiro();
	    	novoPassageiro.cadastrarPassageiro();
		
	}

		private static void cadastrarNovoVoo() {
	        Voo novoVoo = new Voo();
	        novoVoo.cadastrarVoo();
	    }
		
}


