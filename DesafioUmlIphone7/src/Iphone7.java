public class Iphone7 implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public void ligar(String numero){
        System.out.printf("Ligando para o numero: ", numero);
    }

    public void atender(){
        System.out.println("Chamada atendida.");
    }

    public void iniciarCorreioDeVoz(){
        System.out.printf("Correio de voz iniciado.");
    }

    public void exibirPagina(String url){
        System.out.println("Página exibida.");
    }

    public void adicionarNovaAba(){
        System.out.println("Aba adicionada.");
    }

    public void atualizarPagina(){
        System.out.printf("Págian atualizada");
    }
    
    public void tocar(){
        System.out.println("Tocando música.");
    }

    public void pausar(){
        System.out.println("Musica pausada.");
    }

    public void selecionarMusica(String musica){
        System.out.printf("Tocar musica: ", musica);
    }


}
