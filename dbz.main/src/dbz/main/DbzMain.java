package dbz.main;

import java.util.Scanner;

public class DBZGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao mundo de Dragon Ball!");
        System.out.println("Você é um Saiyajin em treinamento e sua jornada começa agora.");

        Saiyajin jogador = new Saiyajin(100, 50, "Kamehameha", 0);
        raca inimigo = gerarInimigoAleatorio();

        while (jogador.getVida() > 0) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Usar Técnica Especial");
            System.out.println("3. Fugir");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    int danoJogador = jogador.atacar();
                    int danoInimigo = inimigo.atacar();
                    jogador.setVida(jogador.getVida() - danoInimigo);
                    inimigo.setVida(inimigo.getVida() - danoJogador);
                    System.out.println("Você causou " + danoJogador + " de dano no inimigo.");
                    System.out.println("O inimigo causou " + danoInimigo + " de dano em você.");
                    break;
                case 2:
                    if (jogador instanceof Saiyajin) {
                        int custoKamehameha = 10;
                        if (jogador.getKi() >= custoKamehameha) {
                            jogador.setKi(jogador.getKi() - custoKamehameha);
                            int danoKamehameha = jogador.usarTecnicaEspecial();
                            inimigo.setVida(inimigo.getVida() - danoKamehameha);
                            System.out.println("Você usou o Kamehameha e causou " + danoKamehameha + " de dano no inimigo.");
                        } else {
                            System.out.println("Você não tem energia suficiente para usar o Kamehameha.");
                        }
                    } else {
                        System.out.println("Você não possui uma técnica especial.");
                    }
                    break;
                case 3:
                    System.out.println("Você tentou fugir da batalha.");
                    if (tentarFugirDaBatalha()) {
                        System.out.println("Você escapou com sucesso!");
                        inimigo = gerarInimigoAleatorio();
                    } else {
                        System.out.println("O inimigo te alcançou e você foi derrotado!");
                        jogador.setVida(0);
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }

            if (jogador.getVida() <= 0) {
                System.out.println("Você foi derrotado pelo inimigo. Game Over!");
            } else if (inimigo.getVida() <= 0) {
                System.out.println("Você derrotou o inimigo! Parabéns!");
                jogador.recuperarVida(20); // Recupera um pouco de vida após cada vitória.
                inimigo = gerarInimigoAleatorio();
            }
        }

        scanner.close();
    }

    private static boolean tentarFugirDaBatalha() {
        // Simule aqui as chances de sucesso ou fracasso ao tentar fugir da batalha.
        return Math.random() < 0.5; // 50% de chance de sucesso.
    }

    private static raca gerarInimigoAleatorio() {
        // Gere aleatoriamente um inimigo aqui (por exemplo, Freeza, Nappa, Saibamen, etc.).
        // Retorne uma instância da classe apropriada.
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return new freeza(80, 30, "Ataque de Raio", (int) 0.5, "Transformação Final");
            case 1:
                return new nappa(90, 40, "Investida");
            case 2:
                return new saibamen(60, 20, "Auto Destruição");
            default:
                return new freeza(80, 30, "Ataque de Raio", (int) 0.5, "Transformação Final");
        }
    }
}

