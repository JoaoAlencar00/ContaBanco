# Conta bancária pelo terminal em Java

Exercício de entrada e saída de dados que solicita informações de uma conta e apresenta uma mensagem de confirmação no console. O objetivo é praticar a classe `Scanner`, tipos de dados e concatenação de texto.

## Dados solicitados

| Campo | Tipo no código |
| --- | --- |
| Nome do cliente | `String` |
| Agência | `String` |
| Número da conta | `int` |
| Saldo informado | `double` |

## Como executar

Requer um JDK com `javac` e `java` disponíveis. Na raiz do repositório:

```sh
git clone https://github.com/JoaoAlencar00/ContaBanco.git
cd ContaBanco
mkdir build
javac -encoding UTF-8 -d build conta-banco/src/ContaTerminal.java
java -cp build ContaTerminal
```

Digite nome, agência, número da conta e saldo, seguindo as solicitações do terminal. O separador decimal aceito segue a configuração regional usada pelo `Scanner` na sua máquina.

## Estrutura

```text
conta-banco/
├── .vscode/settings.json
├── README.md
└── src/ContaTerminal.java
```

## Escopo atual

O programa apenas lê e exibe as informações. Ele não cadastra uma conta em banco de dados nem implementa saque, depósito, transferência ou autenticação.

Não há validação de número de conta, saldo negativo ou entradas não numéricas, nem testes automatizados no repositório.

## Referência do exercício

Proposta do [desafio de Sintaxe da Trilha Java Básico da DIO](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/sintaxe/README.md), de [Gleyson Sampaio](https://github.com/glysns).
