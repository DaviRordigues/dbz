package dbz.main;

public class Freeza extends Raca {

    private int transformacao;
    private int transformacaoAtual;
    private int vidaInicial; // Adicionamos um campo para armazenar a vida inicial

    public Freeza(int vida, int ki, String tecnica, int transformacao) {
        super(vida, ki, tecnica);
        this.transformacao = transformacao;
        this.transformacaoAtual = 1;
        this.vidaInicial = vida; // Definimos a vida inicial no construtor
    }

    public int getVidaInicial() {
        return vidaInicial;
    }

    public void lutar(Raca jogador) {
        int danoJogador = this.getKi() * 20; // Freeza é mais forte que Vegeta.
        int danoFreeza = jogador.getKi() * 18;

        this.setVida(this.getVida() - danoJogador);
        jogador.setVida(jogador.getVida() - danoFreeza);

        System.out.println("Você atacou Freeza com " + danoJogador + " de dano.");
        System.out.println("Vida de Freeza: " + this.getVida());

        System.out.println("Freeza atacou você com " + danoFreeza + " de dano.");
        System.out.println("Sua vida: " + jogador.getVida());

        // Verificar o resultado da luta
        if (this.getVida() <= 0) {
            System.out.println("Você venceu a luta contra Freeza!");
        } else if (jogador.getVida() <= 0) {
            System.out.println("Você foi derrotado por Freeza...");
        } else {
            System.out.println("A luta continua!");
        }

        // Verificar se é hora de transformar Freeza
        if (this.transformacaoAtual < this.transformacao && this.getVida() <= (this.getVidaInicial() / 2)) {
            transformar();
        }
    }

    public void transformar() {
        if (this.transformacaoAtual == 1) {
            // Transformação para a segunda forma
            this.setKi(this.getKi() * 2); // Aumenta o ki
            this.setVida(this.getVida() * 2); // Dobra a vida
            this.transformacaoAtual++;
            System.out.println("Freeza se transformou na segunda forma!");
        } else if (this.transformacaoAtual == 2) {
            // Transformação para a terceira forma
            this.setKi(this.getKi() * 2); // Aumenta o ki novamente
            this.setVida(this.getVida() * 2); // Dobra a vida novamente
            this.transformacaoAtual++;
            System.out.println("Freeza se transformou na terceira forma!");
        } else if (this.transformacaoAtual == 3) {
            // Transformação para a forma final
            this.setKi(this.getKi() * 2); // Aumenta o ki novamente
            this.setVida(this.getVida() * 2); // Dobra a vida novamente
            this.transformacaoAtual++;
            System.out.println("Freeza atingiu sua forma final! Ele está mais forte do que nunca.");
        }
    }
}
