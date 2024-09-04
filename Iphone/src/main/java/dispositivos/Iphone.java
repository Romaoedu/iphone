package dispositivos;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    @Override
    public void exibirPagina() {
        System.out.println("Pagina foi exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina foi atualizada");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para um numero");

    }

    @Override
    public void antender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Mensagem do correio de voz reproduzindo");
    }

    @Override
    public void tocar() {
        System.out.println("Musica tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }
}
