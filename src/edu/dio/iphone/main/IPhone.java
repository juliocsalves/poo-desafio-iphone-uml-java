package edu.dio.iphone.main;

import edu.dio.iphone.interfaces.AparelhoTelefonico;
import edu.dio.iphone.interfaces.NavegadorInternet;
import edu.dio.iphone.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void pausar() {
        System.out.println("Música pausada...");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");

    }

    @Override
    public void ligar() {
        System.out.println("Realizando chamada...");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada...");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web...");

    }

}
