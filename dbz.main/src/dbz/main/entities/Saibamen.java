package dbz.main.entities;

public class Saibamen extends Raca {

    public Saibamen(int vida, int ki, String tecnica) {
        super(vida, ki, tecnica);
    }

    public void lutar(Raca jogador) {
        int danoJogador = this.getKi() * 10; // Suponhamos que 10 de ki cause 10 de dano.
        int danoSaibamen = jogador.getKi() * 8; // O Saibamen é mais fraco que o jogador.

        this.setVida(this.getVida() - danoJogador);
        jogador.setVida(jogador.getVida() - danoSaibamen);

        System.out.println("Você atacou o Saibamen com " + danoJogador + " de dano.");
        System.out.println("Vida do Saibamen: " + this.getVida());

        System.out.println("O Saibamen atacou você com " + danoSaibamen + " de dano.");
        System.out.println("Sua vida: " + jogador.getVida());

        // Verificar o resultado da luta
        if (this.getVida() <= 0) {
            System.out.println("Você venceu a luta contra o Saibamen!");
        } else if (jogador.getVida() <= 0) {
            System.out.println("Você foi derrotado pelo Saibamen...");
        } else {
            System.out.println("A luta continua!");
        }
    }
}
