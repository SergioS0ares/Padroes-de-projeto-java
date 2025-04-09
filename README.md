# Padrões de Projeto em Java

Este repositório tem como objetivo explorar e implementar diversos **Padrões de Projeto (Design Patterns)** utilizando a linguagem **Java**. Os padrões aqui desenvolvidos são amplamente utilizados no mercado e representam boas práticas da **Programação Orientada a Objetos (POO)**.

O projeto inclui implementações com e sem **Java Swing**, leitura de arquivos `.csv`, uso de coleções da API `java.util`, entre outros recursos fundamentais do Java.

---

## 🌟 Objetivos

- Compreender o funcionamento de cada padrão
- Aplicar os conceitos na prática
- Desenvolver exemplos didáticos com Java
- Utilizar estruturas de dados e interface gráfica quando necessário
- Criar uma base de estudo para projetos futuros

---

## ✅ Padrões implementados

### 🔒 Singleton  
Gerencia o acesso a uma única instância de uma classe. Usado aqui para simular uma agência bancária onde os clientes são sempre vinculados à mesma instância.

**Pasta:** `singleton`  
**Destaques:**
- Controle de instância com `getInstance()`
- Integração com Java Swing
- Exibição de resultados em `JTextArea`

---

### 🔌 Adapter  
Permite adaptar a interface de uma classe para outra. Aqui, convertemos temperaturas entre Fahrenheit e Celsius por meio de um adaptador.

**Pasta:** `adapter`  
**Destaques:**
- Integração com interface Swing
- Conversão de unidades com dois formatos de entrada
- Separacão entre lógica e interface

---

### ⟲ Iterator  
Permite acessar os elementos de uma coleção sequencialmente, sem expor sua estrutura interna. Neste exemplo, exibimos dados de pilotos de Fórmula 1 usando diferentes estruturas de dados da biblioteca Java (`LinkedList`, `HashSet`, `TreeSet`, `Stack`, `HashMap`).

**Pasta:** `iterator`  
**Destaques:**
- Leitura de CSV com dados reais
- Uso de `Iterator` com múltiplas estruturas (`List`, `Set`, `Queue`, `Map`)
- Exibição em tabela Swing (`JTable`)
- Separacão entre persistência e interface gráfica

---

### 👁️ Observer

O padrão Observer define uma dependência um-para-muitos entre objetos, de forma que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.

**Pasta:** `observer`  
**Destaques:**
- Implementação com interface gráfica (`JFrame`, `JTextArea`, `JButton`)
- Observadores diferentes: console, web e índice de conforto
- Design desacoplado: a estação meteorológica notifica todos os displays registrados
- Baseado em interfaces `Observer`, `Subject` e `DisplayElement`

#### 📌 Estrutura e funcionamento
- `Subject`: interface que define os métodos para registrar, remover e notificar observers
- `Observer`: interface que define o método `update()`, chamado quando o estado muda
- `DisplayElement`: interface que exige o método `display()` para exibição dos dados
- `EstacaoMeteorologica`: a fonte de dados (sujeito observado)
- `MostrarClimaConsole`, `MostrarClimaWeb`, `MostrarClimaIndiceConforto`: implementações dos observers
- `TelaEstacaoMeteorologica`: interface Swing que coleta dados do usuário e atualiza os observers

#### 💻 Exemplo de funcionamento
O usuário insere temperatura, umidade e pressão em campos de texto, e ao clicar em “Atualizar Clima”, os observers são notificados automaticamente e atualizam suas exibições:

```java
EstacaoMeteorologica estacao = new EstacaoMeteorologica();
new MostrarClimaConsole(estacao, areaConsole);
new MostrarClimaWeb(estacao, areaWeb);
new MostrarClimaIndiceConforto(estacao, areaConforto);

estacao.setMeasurements(25.0f, 70.0f, 1013.0f);
```

---

### 🏠 Factory

O padrão Factory encapsula a criação de objetos, fornecendo uma interface para instanciar classes específicas com base em parâmetros, promovendo baixo acoplamento e fácil manutenção.

**Pasta:** `Factory_Decorator/factory`  
**Destaques:**
- Centraliza a lógica de criação na classe `FabricaDeArmas`
- Permite a criação de `Espada`, `Arco` e `Lança` com um único método
- Facilita testes, extensões e integração com o padrão Decorator

#### 🔧 Exemplo de uso:
```java
Arma espada = FabricaDeArmas.criarArma("espada");
System.out.println(espada.getNome()); // Excalibur
```

#### 🧪 Teste CLI:
A classe `TesteFactory` demonstra o uso da fábrica combinada com melhorias aplicadas via decorators:
```java
Arma arma = FabricaDeArmas.criarArma("arco");
arma = new EncantamentoFogo(arma);
arma = new ReforcoMitril(arma);
System.out.println(arma.getDano());
```

---

### 🎨 Decorator

O padrão Decorator permite adicionar funcionalidades extras a um objeto em tempo de execução, mantendo a estrutura base original.
É ideal para casos onde diferentes combinações de comportamento são necessárias.

**Pasta:** `Factory_Decorator/modelos`  
**Destaques:**
- Melhorias como `EncantamentoFogo`, `PontaAfiada` e `ReforcoMitril` estendem a classe abstrata `Melhoria`
- Composição flexível das funcionalidades
- Permite encadear várias melhorias sobre uma mesma arma

#### 🔧 Exemplo:
```java
Arma arco = FabricaDeArmas.criarArma("arco");
arco = new EncantamentoFogo(arco);
arco = new PontaAfiada(arco);
System.out.println(arco.descricao());
// Arco de longo alcance... + Encantamento de Fogo + Ponta Afiada
```

#### 💻 Interface gráfica:
A classe `TelaArmas` implementa uma interface Swing para que o usuário possa:
- Escolher o tipo de arma
- Marcar quais melhorias deseja aplicar
- Ver dinamicamente a descrição final e o dano total da arma montada

```java
Arma arma = FabricaDeArmas.criarArma("espada");
if (chkFogo.isSelected()) arma = new EncantamentoFogo(arma);
```

---

Novos padrões serão adicionados conforme o avanço dos estudos.

