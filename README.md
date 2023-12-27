# Calculadora de Partidas Ranqueadas

Este é um projeto de uma calculadora de saldo de partidas ranqueadas de jogadores. A função principal é calcular o saldo do jogador com base na quantidade de vitórias e determinar o nível de ranking de acordo com as regras fornecidas.

## Funcionalidades

- Calcula o saldo de partidas ranqueadas com base nas vitórias e derrotas inseridas.
- Determina o nível de ranking do jogador de acordo com o saldo calculado.

## Como usar

1. Clone este repositório para sua máquina local.
2. Abra o projeto em seu ambiente de desenvolvimento (IDE).
3. Execute o arquivo `Main.java`.
4. Siga as instruções no console para inserir a quantidade de vitórias e derrotas do jogador.

## Regras de Rankeamento

- Se vitórias for menor do que 10 = Ferro
- Se vitórias for entre 11 e 20 = Bronze
- Se vitórias for entre 21 e 50 = Prata
- Se vitórias for entre 51 e 80 = Ouro
- Se vitórias for entre 81 e 90 = Diamante
- Se vitórias for entre 91 e 100 = Lendário
- Se vitórias for maior ou igual a 101 = Imortal

## Exemplo de Saída

Ao final da execução, o programa exibirá uma mensagem no formato:
"O Herói tem um saldo de {saldoVitorias} vitórias e está no nível de {nivel}"
