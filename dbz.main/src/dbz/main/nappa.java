package dbz.main;

public class Nappa extends Raca {

    public Nappa(int vida, int ki, String tecnica) {
        super(vida, ki, tecnica);
    }

    public void lutar(Raca jogador) {
        int danoJogador = this.getKi() * 15; // Nappa é mais forte que Raditz.
        int danoNappa = jogador.getKi() * 12;

        this.setVida(this.getVida() - danoJogador);
        jogador.setVida(jogador.getVida() - danoNappa);

        System.out.println("Você atacou Nappa com " + danoJogador + " de dano.");
        System.out.println("Vida de Nappa: " + this.getVida());

        System.out.println("Nappa atacou você com " + danoNappa + " de dano.");
        System.out.println("Sua vida: " + jogador.getVida());

        // Verificar o resultado da luta
        if (this.getVida() <= 0) {
            System.out.println("Você venceu a luta contra Nappa!");
        } else if (jogador.getVida() <= 0) {
            System.out.println("Você foi derrotado por Nappa...");
        } else {
            System.out.println("A luta continua!");
        }
    }
}
