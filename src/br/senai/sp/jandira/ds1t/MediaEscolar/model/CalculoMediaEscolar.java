package br.senai.sp.jandira.ds1t.MediaEscolar.model;

import java.util.Scanner;

public class CalculoMediaEscolar {
    String nomeAluno;
    String aprovacao;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double mediaFinal;

    public void receberDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Ola! Por favor escreva o nome do aluno: ");
        nomeAluno = leitor.nextLine();

        System.out.print("Ótimo, agora escreva a nota 1: ");
        nota1 = leitor.nextDouble();

        System.out.print("Ótimo, agora escreva a nota 2: ");
        nota2 = leitor.nextDouble();

        System.out.print("Ótimo, agora escreva a nota 3: ");
        nota3 = leitor.nextDouble();

        System.out.print("Ótimo, agora escreva a nota 4: ");
        nota4 = leitor.nextDouble();

        calcularMedia();
    }

    public void calcularMedia(){
        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        if (mediaFinal >= 5){
            aprovacao = "Aprovado";
        }else {
            aprovacao = "Reprovado";
        }
         exibirResultados();
    }

    public void exibirResultados(){
        String notaMediaCom2Decimais = String.format("%.2f", mediaFinal);

        System.out.println(" ");
        System.out.println(" ------- MÉDIA ESCOLAR -------");
        System.out.println("******************************");
        System.out.println(" ");
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Média: " + notaMediaCom2Decimais);
        System.out.println(" ");
        System.out.println("******************************");
        System.out.println(" ");
        System.out.println("Situação: " + aprovacao);

    }
}
