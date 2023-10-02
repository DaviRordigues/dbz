package dbz.main;

public class Vegeta extends Raca {

    private String orgulho;

    public Vegeta(int vida, int ki, String tecnica, String orgulho) {
        super(vida, ki, tecnica);
        this.orgulho = orgulho;
    }

    public void lutar(Raca jogador) {
        int danoJogador = this.getKi() * 18; // Vegeta é mais forte que Nappa.
        int danoVegeta = jogador.getKi() * 15;

        this.setVida(this.getVida() - danoJogador);
        jogador.setVida(jogador.getVida() - danoVegeta);

        System.out.println("Você atacou Vegeta com " + danoJogador + " de dano.");
        System.out.println("Vida de Vegeta: " + this.getVida());

        System.out.println("Vegeta atacou você com " + danoVegeta + " de dano.");
        System.out.println("Sua vida: " + jogador.getVida());

        // Verificar o resultado da luta
        if (this.getVida() <= 0) {
            System.out.println("Você venceu a luta contra Vegeta!");
        } else if (jogador.getVida() <= 0) {
            System.out.println("Você foi derrotado por Vegeta...");
        } else {
            System.out.println("A luta continua!");
        }
    }
}
