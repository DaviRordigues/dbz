package dbz.main.entities;

public class Raditz extends Raca {

    public Raditz(int vida, int ki, String tecnica) {
        super(vida, ki, tecnica);
    }

    public void lutar(Raca jogador) {
        int danoJogador = this.getKi() * 12; // Raditz é mais forte que o Saibamen.
        int danoRaditz = jogador.getKi() * 10;

        this.setVida(this.getVida() - danoJogador);
        jogador.setVida(jogador.getVida() - danoRaditz);

        System.out.println("Você atacou Raditz com " + danoJogador + " de dano.");
        System.out.println("Vida de Raditz: " + this.getVida());

        System.out.println("Raditz atacou você com " + danoRaditz + " de dano.");
        System.out.println("Sua vida: " + jogador.getVida());

        // Verificar o resultado da luta
        if (this.getVida() <= 0) {
            System.out.println("Você venceu a luta contra Raditz!");
        } else if (jogador.getVida() <= 0) {
            System.out.println("Você foi derrotado por Raditz...");
        } else {
            System.out.println("A luta continua!");
        }
    }
}
