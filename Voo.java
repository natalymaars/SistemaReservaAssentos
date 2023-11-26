package reservaPassagens;

import java.util.*;


public class Voo {
	private static List<Voo> voosCadastrados = new ArrayList<>();
    private int numeroVoo;
    private String origem;
    private String destino;
    private String dataVoo;
    private String horarioVoo;
    private int totalAssentos;
    private List<String> assentosDisponiveis;
    
    public Voo() {
      
    }


    public Voo(int numeroVoo, String origem, String destino, String dataVoo,String horarioVoo, int totalAssentos) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;
        this.horarioVoo= horarioVoo;
        this.totalAssentos = totalAssentos;
        assentosDisponiveis = new ArrayList<>();
        for (int i = 0; i < totalAssentos; i++) {
            this.assentosDisponiveis.add("Assento " + (i + 1));
        }
       
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }
    
    public String getHorarioVoo() {
    	return horarioVoo;
    }
    
    public void setHorarioVoo(String horarioVoo) {
    	this.horarioVoo = horarioVoo;
    }

    public int getTotalAssentos() {
        return totalAssentos;
    }

    public void setTotalAssentos(int totalAssentos) {
        this.totalAssentos = totalAssentos;
    }

    public List<String> getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void setAssentosDisponiveis(List<String> assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }
 
    public static List<Voo> getVoosCadastrados() {
		return voosCadastrados;
	}

    public void cadastrarVoo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do voo:");
        int novoNumeroVoo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a origem do voo:");
        String novaOrigem = scanner.nextLine();

        System.out.println("Digite o destino do voo:");
        String novoDestino = scanner.nextLine();

        System.out.println("Digite a data do voo:");
        String novaDataVoo = scanner.nextLine();

        System.out.println("Digite a hora do voo:");
        String novoHorarioVoo = scanner.nextLine();

        System.out.println("Digite o número total de assentos:");
        int novoTotalAssentos = scanner.nextInt();
        scanner.nextLine();

        Voo novoVoo = new Voo(novoNumeroVoo, novaOrigem, novoDestino, novaDataVoo, novoHorarioVoo, novoTotalAssentos);

        System.out.println("Voo cadastrado com sucesso!");
   
        assentosDisponiveis = new ArrayList<>();
        for (int i = 1; i <= totalAssentos; i++) {
            assentosDisponiveis.add("Assento " + i);
        }
        
        voosCadastrados.add(novoVoo);

    }

    public static void consultarVoos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do voo que deseja consultar:");
        int numeroVooEscolhido = scanner.nextInt();
        boolean encontrado = false;

        for (Voo voo : voosCadastrados) {
            if (voo.numeroVoo == numeroVooEscolhido) {
                encontrado = true;
                System.out.println("Número do Voo: " + voo.numeroVoo);
                System.out.println("Origem: " + voo.origem);
                System.out.println("Destino: " + voo.destino);
                System.out.println("Data do Voo: " + voo.dataVoo);
                System.out.println("Horário do Voo: " + voo.horarioVoo);
                System.out.println("Total de Assentos: " + voo.totalAssentos);
                System.out.println("Assentos Disponíveis: " + voo.assentosDisponiveis);
                System.out.println("----------------------------------");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Voo não encontrado.");
        }
    }
   
    public void reservarAssento(Passageiro passageiro) {
    	   if (!assentosDisponiveis.isEmpty()) {
    	       String assentoReservado = assentosDisponiveis.remove(0);
    	       Passageiro.getAssentosReservados().add(assentoReservado);
    	       System.out.println(assentoReservado +" do voo" + numeroVoo + " reservado para o passageiro " + passageiro.getNome());
    	   } else {
    	       System.out.println("Não há assentos disponíveis para reserva.");
    	   }
    	}

}
