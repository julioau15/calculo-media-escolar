package br.senai.sp.jandira.ds1t.MediaEscolar.model;

import java.util.Scanner;

public class CalculoMediaEscolar {
    String nomeAluno;
    String situacao;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double mediaFinal;

    public void receberDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Ola! Por favor escreva o nome do aluno(a): ");
        nomeAluno = leitor.nextLine();

        System.out.print("Ótimo, agora digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Ótimo, agora digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.print("Ótimo, agora digite a terceira nota: ");
        nota3 = leitor.nextDouble();

        System.out.print("Ótimo, agora digite a quarta nota: ");
        nota4 = leitor.nextDouble();

        calcularMedia();
    }

    public void calcularMedia(){
        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        mediaFinal = somaDasNotas / 4;

         determinarSituacao();
    }

    public void determinarSituacao(){
        if (mediaFinal >= 5){
            situacao = "Aprovado(a)!!";

        } else if (mediaFinal >= 3) {
            situacao = "De recuperação!!";
        } else{
            situacao= "Reprovado(a)!!";
        }
        exibirResultados();
    }

    public void exibirResultados(){
        String notaMediaCom2Decimais = String.format("%.2f", mediaFinal);

        System.out.println(" ");
        System.out.println(" ------- MÉDIA ESCOLAR -------");
        System.out.println("******************************");
        System.out.println(" ");
        System.out.println("         Aluno: " + nomeAluno);
        System.out.println("         Nota 1: " + nota1);
        System.out.println("         Nota 2: " + nota2);
        System.out.println("         Nota 3: " + nota3);
        System.out.println("         Nota 4: " + nota4);
        System.out.println(" ");
        System.out.println("******************************");
        System.out.println(" ");
        System.out.println("Média do aluno(a): " + notaMediaCom2Decimais);
        System.out.println("Situação: O(a) aluno(a) " + nomeAluno + " está " + situacao);
    }
}
