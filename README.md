# SistemaReservaPassagens
O código consiste em um sistema simples de reserva de passagens aéreas. Ele é dividido em três classes principais: Voo, Passageiro, e a classe Main, que contém o método main para interação do usuário.

Classe Voo:
Atributos:

voosCadastrados: Uma lista que armazena todos os voos cadastrados.
numeroVoo: String do número identificador do voo.
origem, destino: Strings da origem e o destino do voo.
dataVoo, horarioVoo: Strings da data e horário do voo.
totalAssentos: Número total de assentos disponíveis no voo.
assentosDisponiveis: Lista de assentos disponíveis no voo.

Métodos:
cadastrarVoo(): Permite ao usuário cadastrar um novo voo. Solicita informações como número do voo, origem, destino, data do voo, horário do voo e número total de assentos. Cria um novo objeto Voo e o adiciona à lista de voos cadastrados
consultarVoos(): Permite ao usuário consultar informações de um voo específico. Solicita o número do voo que se deseja consultar, percorre a lista de voos cadastrados e exibe os dados do voo se encontrado. Se não encontrado, exibe uma mensagem indicando que o voo não foi encontrado.
reservarAssento(Passageiro passageiro): Permite a um passageiro reservar um assento em um voo específico. Verifica se há assentos disponíveis no voo e, se sim, reserva o primeiro assento disponível para o passageiro. Adiciona o assento reservado à lista de assentos reservados do passageiro..

Classe Passageiro:

Atributos:
passageirosCadastrados: Uma lista que armazena todos os passageiros cadastrados.
nome, numeroDocumento, numeroTelefone: Strings representando informações do passageiro.
assentosReservados: Lista de assentos reservados pelo passageiro.

Métodos:
cadastrarPassageiro(): Permite ao usuário cadastrar um novo passageiro. Solicita informações como nome, número do documento e número de telefone, cria um novo objeto Passageiro e o adiciona à lista de passageiros cadastrados.
consultarPassageiro(): Permite ao usuário consultar informações de um passageiro específico. Solicita o número do documento do passageiro que se deseja consultar, percorre a lista de passageiros cadastrados e exibe os dados do passageiro se encontrado. Se não encontrado, exibe uma mensagem indicando que o passageiro não foi encontrado.

Classe Main
Usa um loop do-while para apresentar um menu de opções até que o usuário escolha sair. Exibe opções de menu para o usuário: cadastrar um novo voo, consultar voos, cadastrar novo passageiro, consultar passageiro, reservar assento e sair do programa.
Depois de ler a opção escolhida pelo usuário usa o switch case para direcionar a execução com base na opção escolhida.

Opção 1 - Cadastrar Novo Voo:
Chama o método cadastrarNovoVoo() que instancia um objeto Voo e chama o método cadastrarVoo() desse objeto. 








Opção 2 - Consultar Voos:
Chama o método estático consultarVoos() da classe Voo, que permite ao usuário consultar informações sobre voos.


Opção 3 - Cadastrar Novo Passageiro:
Chama o método cadastrarPassageiro(), que instancia um objeto Passageiro e chama o método cadastrarPassageiro() desse objeto. Esse método permite ao usuário cadastrar um novo passageiro.

Opção 4 - Consultar Passageiro:
Chama o método consultarPassageiro() da classe Passageiro, que permite ao usuário consultar informações sobre passageiros.

Opção 5 - Reservar Assento:

Solicita ao usuário o documento do passageiro que deseja reservar um assento.
Procura pelo passageiro na lista de passageiros cadastrados.
Solicita o número do voo que deseja reservar um assento.
Procura pelo voo na lista de voos cadastrados.
Chama o método reservarAssento() do objeto Voo para reservar um assento para o passageiro no voo escolhido.

Opção 0 - Sair:
Encerra o programa

