# 🔄 Refatoração de Sistema em C para Java 🧱

> Projeto reestruturado com foco em boas práticas de design e organização orientada a objetos.

![Java](https://img.shields.io/badge/linguagem-Java-red)
![MVC](https://img.shields.io/badge/padr%C3%A3o-MVC-blue)
![Object Calisthenics](https://img.shields.io/badge/princ%C3%ADpios-Object%20Calisthenics-green)

---

## 📌 Visão Geral

Este projeto foi migrado de **linguagem C** para **Java**, com o objetivo de aplicar conceitos modernos de arquitetura e design orientado a objetos. Ele utiliza o padrão **MVC (Model-View-Controller)** para separação de responsabilidades, além de boas práticas inspiradas em **Object Calisthenics**, 
garantindo código mais limpo, modular e fácil de manter, essa oportunidade de estudo me permitiu verificar e analisar ainda mais as classes como objetos e simplificar bastante o código e diminuir a questão dos **If's and Else's** uma boa prática excelente para quem está iniciando.

---

## 🗂️ Estrutura de Pastas

projeto/
├── bin/ # Arquivos .class compilados
│
├── src/ # Código-fonte Java
│ ├── model/ # Lógica de negócios e dados
│ ├── view/ # Interface (geralmente via console)
│ ├── controller/ # Coordena a lógica da aplicação
│ └── Main.java # Ponto de entrada do programa
├── settings/ # Configurações de IDE (ex: Eclipse)

## 🧱 Arquitetura Aplicada

### MVC – Model View Controller

- **Model**: Gerencia os dados e as regras de negócio.
- **View**: Exibe a interface para o usuário (via console, neste projeto).
- **Controller**: Faz a mediação entre os dados (Model) e a interface (View), controlando o fluxo da aplicação.

