package br.senai.sp.jandira.ds1t.MediaEscolar;

import br.senai.sp.jandira.ds1t.MediaEscolar.model.CalculoMediaEscolar;

public class MediaApp {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("------- INICIANDO APLICATIVO -------");
        System.out.println(" ");

        CalculoMediaEscolar calculo = new CalculoMediaEscolar();
        calculo.receberDados();
    }
}
