# Estudo de Paradigmas de Programação

Este documento detalha os exemplos de código criados para ilustrar três dos principais paradigmas de programação: **Procedural**, **Funcional** e **Orientado a Objetos**.

Os códigos fonte estão localizados em `src/main/java/org/estudos/paradigmas`.

---

## 1. Programação Procedural

**Localização:** `src/main/java/org/estudos/paradigmas/procedural/ProcessamentoDadosProcedural.java`

O paradigma procedural foca na execução sequencial de passos (procedimentos ou funções) para resolver um problema.

### Características observadas no exemplo:
*   **Imperatividade:** O código diz explicitamente *como* fazer cada passo (loops `for`, instruções `if`).
*   **Mutabilidade:** As estruturas de dados são alteradas durante a execução.
    *   *Exemplo:* O método `dobrarValores` altera diretamente a lista original (`lista.set(...)`), causando um *Side Effect* (efeito colateral).
*   **Separação Dados vs. Comportamento:** Os dados (Lista de inteiros) são passados passivamente para os métodos processarem.

---

## 2. Programação Funcional

**Localização:** `src/main/java/org/estudos/paradigmas/funcional/ProcessamentoDadosFuncional.java`

O paradigma funcional trata a computação como a avaliação de funções matemáticas, evitando estados mutáveis e efeitos colaterais. No Java, utilizamos a **Stream API** para aplicar esses conceitos.

### Características observadas no exemplo:
*   **Declarativo:** Focamos em *o que* queremos fazer, não em *como* iterar.
*   **Imutabilidade:** A lista original `numeros` nunca é alterada. As operações geram novos fluxos de dados.
*   **Funções Puras:** As operações (dentro de `filter`, `map`) dependem apenas de sua entrada e não alteram nada fora delas.
*   **Composição:** Encadeamos operações (`filter` -> `map` -> `reduce`) como um pipeline de processamento.

---

## 3. Programação Orientada a Objetos (POO)

**Localização:** `src/main/java/org/estudos/paradigmas/poo/`

A POO organiza o software em torno de "objetos" que contêm dados (atributos) e código (métodos). O exemplo simula um **Sistema de Pagamentos** para demonstrar os 4 pilares.

### Os 4 Pilares Aplicados:

#### 1. Abstração (`Pagamento.java`)
Simplificamos a complexidade do mundo real focando apenas no que é essencial para o contexto.
*   Criamos uma classe abstrata `Pagamento` que define o conceito genérico.
*   Escondemos a complexidade de *como* um pagamento é feito, expondo apenas o contrato `realizarPagamento()`.

#### 2. Encapsulamento (`Pagamento.java`)
Protegemos os dados internos do objeto para garantir a integridade e reduzir o acoplamento.
*   O atributo `private double valor` não pode ser acessado diretamente de fora.
*   O acesso é controlado através do método público `getValor()` e do construtor. Isso impede que alguém defina um valor inválido diretamente se adicionássemos validações ali.

#### 3. Herança (`PagamentoCartao.java`, `PagamentoBoleto.java`)
Permite criar novas classes baseadas em classes existentes, reaproveitando código e estabelecendo relações "É um".
*   `PagamentoCartao` **é um** `Pagamento`.
*   Ele herda automaticamente o atributo `valor` e o método `getValor()`, precisando se preocupar apenas com suas especificidades.

#### 4. Polimorfismo (`SistemaPagamentos.java`)
A capacidade de um objeto ser tratado como sua forma genérica, mas comportar-se como sua forma específica.
*   Na lista `List<Pagamento>`, misturamos Boletos e Cartões.
*   Quando chamamos `p.realizarPagamento()`, o Java decide em tempo de execução qual código executar (do Boleto ou do Cartão). O mesmo código chamador funciona para qualquer novo tipo de pagamento criado no futuro.

---

## Como Executar os Exemplos

A partir da raiz do projeto, compile o código:

```bash
javac -d target/classes src/main/java/org/estudos/paradigmas/*/*.java
```

Execute cada exemplo individualmente:

**Procedural:**
```bash
java -cp target/classes org.estudos.paradigmas.procedural.ProcessamentoDadosProcedural
```

**Funcional:**
```bash
java -cp target/classes org.estudos.paradigmas.funcional.ProcessamentoDadosFuncional
```

**Orientado a Objetos:**
```bash
java -cp target/classes org.estudos.paradigmas.poo.SistemaPagamentos
```
