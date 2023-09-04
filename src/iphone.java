public class iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    private int numeroSerie;
    private String modelo;
    private String cor;
    
    public iphone(int numeroSerie, String modelo, String cor) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void Ligar()
    {
        System.out.println("Telefone ligado");
    }
    public void Desligar()
    {
        System.out.println("Telefone desligando...");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void receberChamada() {
       System.out.println("Ligação recebida");
    }

    @Override
    public void abirPagina(String pagina) {
       System.out.println("Voce esta navegando na" + pagina);
    }

    @Override
    public void fecharPagina() {
       System.out.println("Pagina fechada");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
       System.out.println("Escolha a musica");
    }

}
