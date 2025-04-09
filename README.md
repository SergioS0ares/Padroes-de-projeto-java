# Padrões de Projeto em Java

Este repositório tem como objetivo explorar e implementar diversos **Padrões de Projeto (Design Patterns)** utilizando a linguagem **Java**. Os padrões aqui desenvolvidos são amplamente utilizados no mercado e representam boas práticas da **Programação Orientada a Objetos (POO)**.

O projeto inclui implementações com e sem **Java Swing**, leitura de arquivos `.csv`, uso de coleções da API `java.util`, entre outros recursos fundamentais do Java.

---

## 🎯 Objetivos

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
- Separação entre lógica e interface

---

### 🔁 Iterator  
Permite acessar os elementos de uma coleção sequencialmente, sem expor sua estrutura interna. Neste exemplo, exibimos dados de pilotos de Fórmula 1 usando diferentes estruturas de dados da biblioteca Java (`LinkedList`, `HashSet`, `TreeSet`, `Stack`, `HashMap`).

**Pasta:** `iterator`  
**Destaques:**
- Leitura de CSV com dados reais
- Uso de `Iterator` com múltiplas estruturas (`List`, `Set`, `Queue`, `Map`)
- Exibição em tabela Swing (`JTable`)
- Separação entre persistência e interface gráfica

---

### 👁️ Observer  
Define uma dependência um-para-muitos entre objetos, onde quando um objeto muda de estado, todos os seus dependentes são notificados automaticamente.

**Pasta:** `observer`  
**Destaques:**
- Implementação do padrão publicador/assinante (publisher/subscriber)
- Observadores reagem automaticamente a mudanças no estado do objeto observado
- Exemplo didático com simulação de notificações em tempo real

---

### 🏭 Factory  
Fornece uma interface para criar objetos em uma superclasse, mas permite que subclasses alterem o tipo de objetos que serão criados.

**Pasta:** `factory`  
**Destaques:**
- Criação dinâmica de objetos com base em parâmetros
- Redução de acoplamento entre classes
- Exemplo prático com criação de diferentes tipos de veículos, contas bancárias ou usuários

---

### 🎨 Decorator  
Permite adicionar funcionalidades a objetos de forma dinâmica sem alterar sua estrutura.  
Ideal para cenários onde queremos manter a flexibilidade na composição de comportamentos.

**Pasta:** `decorator`  
**Destaques:**
- Composição de funcionalidades em tempo de execução
- Simulação com personalização de bebidas, pedidos ou componentes visuais
- Reforço da aplicação do princípio aberto/fechado (Open/Closed Principle)

---

## 📌 Estrutura do projeto

A estrutura segue separação por padrão de projeto, com pacotes organizados individualmente. Cada padrão conta com exemplos comentados e organizados para facilitar o estudo e reuso do código.

---

Novos padrões serão adicionados conforme o avanço dos estudos.
