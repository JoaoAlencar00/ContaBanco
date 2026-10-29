# Código-fonte — Conta bancária pelo terminal

Esta pasta contém o exercício `ContaTerminal`, que lê nome do cliente, agência, número da conta e saldo e imprime uma mensagem no console.

Consulte o [README principal](../README.md) para a apresentação e o escopo do projeto.

## Executar a partir desta pasta

Com um JDK instalado e `javac` e `java` disponíveis:

```sh
mkdir build
javac -encoding UTF-8 -d build src/ContaTerminal.java
java -cp build ContaTerminal
```

## Organização

- `src/`: código-fonte Java.
- `.vscode/settings.json`: configuração do projeto para VS Code.
- `build/`: saída da compilação sugerida acima, criada localmente.

A extensão Java do VS Code também permite executar a classe pelo editor. Veja a [documentação de gerenciamento de dependências da extensão](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
