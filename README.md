# Exercício 3 de Processos - Sistemas Operacionais 1

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-000?style=for-the-badge&logo=linux&logoColor=FCC624)

</div>

## Sobre o projeto
Este é o exercício 3, da lista de exercícios de processos em Windows e Linux, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.

## Índice
=================
<!--ts-->
* [Título](#exercício-3-de-processos---sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercício 3](#exercício-3)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercício 3

* No universo do Sistema operacional Linux existem diversas distribuições.<br> Os comandos Java
`System.getProperty(“os.name”)` e `System.getProperty(“os.version”)` trazem dados sobre o
Kernel Linux, mas não sobre a distribuição.

* Criar em Eclipse, um novo Java Project com uma classe chamada `DistroController.java` no
package `controller` e uma classe `Main.java` no package `view`.

* A classe `DistroController.java` deve ter 2 métodos.
  1) O primeiro, chamado `os`, que identifica e retorna o nome do Sistema Operacional (Fazê-lo
  privado)
  2) O segundo, chamado `exibeDistro`, que verifica o SO e, se for Linux, selecione o comando para
  exibir as propriedades da distribuição. Deve-se exibir o nome e a versão da distribuição.<br>
  Caso o SO não seja Linux, exibir uma mensagem comunicando.
  A classe `Main.java` deve ter um chamado para a exibição das informações.

* Dica:
  - O comando para exibir as propriedades de uma distribuição Linux é: `cat /etc/os-release`


## Status do projeto
✅ Finalizado ✅

## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [Runtime](https://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html)
  - [JOptionPane](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)
  - [BufferedWriter](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html)
  - [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)
  - [InputStreamReader](https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html)

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, Leandro Colevati, por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
