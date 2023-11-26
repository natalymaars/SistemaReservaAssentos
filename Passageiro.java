package reservaPassagens;
import java.util.*;

public class Passageiro {
	private static List<Passageiro> passageirosCadastrados = new ArrayList<>();
    private String nome;
    private String numeroDocumento;
    private String numeroTelefone;
    private static List<String> assentosReservados;
    
    public Passageiro() {
    }
    public Passageiro(String nome, String numeroDocumento, String numeroTelefone) {
        this.nome = nome;
        this.numeroDocumento = numeroDocumento;
        this.numeroTelefone = numeroTelefone;
        this.assentosReservados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
	public static List<String> getAssentosReservados() {
		return assentosReservados;
	}
	
	public static List<Passageiro> getPassageirosCadastrados() {
        return passageirosCadastrados;
    }
    
	public void cadastrarPassageiro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do passageiro:");
        String nome = scanner.nextLine();

        System.out.println("Informe o número do documento do passageiro:");
        String numeroDocumento = scanner.nextLine();

        System.out.println("Informe o número de telefone do passageiro:");
        String numeroTelefone = scanner.nextLine();

        Passageiro novoPassageiro = new Passageiro(nome, numeroDocumento, numeroTelefone);

        System.out.println("Passageiro cadastrado com sucesso:");
        passageirosCadastrados.add(novoPassageiro);
        
    }
    
    public static void consultarPassageiro() {
    	Scanner scanner = new Scanner(System.in);
    	Boolean encontrado = false;
    	System.out.println("Digite o documento do passageiro que deseja consultar:");  
    	String documentoPassageiro = scanner.nextLine ();  
              
        for (Passageiro passageiro : passageirosCadastrados) {
            if (passageiro.getNumeroDocumento().equals(documentoPassageiro)) {
                encontrado = true;
                System.out.println("Nome: " + passageiro.nome);
                System.out.println("Documento: " + passageiro.numeroDocumento);
                System.out.println("Contato:" + passageiro.numeroTelefone);
                System.out.println("Assento reservado: " + Passageiro.assentosReservados);
                System.out.println("----------------------------------");
                break;
            }           
        }
        if (!encontrado) {
            System.out.println("Passageiro não encontrado.");
        }        
    }



}
