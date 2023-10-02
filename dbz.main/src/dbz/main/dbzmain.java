package dbz.main;

import java.util.Scanner;

import java.util.Scanner;

public class DbzMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Escolher o nome do jogador
        System.out.println("Em um futuro próspero, Trunks percebe alterações na linha do tempo no passado, inimigos que deveriam estar mortos, de repente voltaram a vida ");
        System.out.println("Sendo assim ele decide invocar Shenlong e fazer um pedido ao Deus Dragão");
        System.out.println("O Deus Dragão Diz: VAMOS, DIGA SEU DESEJO FILHO DO ORGULHOSO PRÍNCIPE");
        System.out.println("Trunks: Shenlong, eu desejo um forte aliado que irá lutar no passado e consertar as alterações no tempo, traga-me um aliado forte");
        System.out.println("Shenlong: O seu desejo foi concedido.");

        System.out.println("Digite seu nome: ");
        String nomeJogador = scanner.nextLine();
        System.out.println("Shenlong: Alguem está te chamando de algum lugar bem distante...");
        System.out.println("Poderoso guerreiro! Agora, mostre-se");

        // Escolher a raça do jogador
        System.out.println("Escolha sua raça: ");
        System.out.println("1. Saiyajin");
        System.out.println("2. Android");
        System.out.println("3. Humano");
        System.out.println("4. Namek");
        int escolhaRaca = scanner.nextInt();
        Raca jogador = null;

        // Consumir o caractere de nova linha pendente
        scanner.nextLine();

        switch (escolhaRaca) {
            case 1:
                jogador = new Saiyajin(1000, 500, "Kamehameha", 2);
                break;
            case 2:
                jogador = new Android(800, 99999999, "Energy Absorption", "Sim");
                break;
            case 3:
                jogador = new Humano(750, 600, "Solar Flare", "Treinamento em 4 missões");
                break;
            case 4:
                jogador = new Namek(1500, 700, "Regeneration", "Sim");
                break;
            default:
                System.out.println("Raça inválida. Jogo encerrado.");
                return;
        }

        System.out.println("Bem-vindo, " + nomeJogador + "!");
        System.out.println("Você escolheu a raça " + jogador.getClass().getSimpleName());

        // Criar uma instância de SementeDosDeuses
        SementeDosDeuses semente = new SementeDosDeuses("Semente dos Deuses");

        boolean continuarJogo = true;
        while (continuarJogo) {
            // Exibir os status da raça
            exibirStatus(jogador);

            // Opções do jogador e lógica do jogo aqui
            System.out.println("Escolha uma ação:");
            System.out.println("1. Lutar");
            System.out.println("2. Treinar");
            System.out.println("3. Fugir");
            System.out.println("4. Sair");
            System.out.println("5. Usar Semente dos Deuses");

            int escolhaAcao = scanner.nextInt();

            // Consumir o caractere de nova linha pendente
            scanner.nextLine();

            switch (escolhaAcao) {
                case 1:
                    System.out.println("Escolha um vilão para lutar:");
                    System.out.println("1. Saibamen");
                    System.out.println("2. Nappa");
                    System.out.println("3. Vegeta");
                    System.out.println("4. Raditz");
                    System.out.println("5. Freeza (Final Boss)");

                    int escolhaVilao = scanner.nextInt();

                    // Consumir o caractere de nova linha pendente
                    scanner.nextLine();

                    Raca vilao = null;

                    switch (escolhaVilao) {
                        case 1:
                            vilao = new Saibamen(300, 100, "Auto-Destruction");
                            break;
                        case 2:
                            vilao = new Nappa(800, 400, "Blazing Storm");
                            break;
                        case 3:
                            vilao = new Vegeta(1200, 600, "Big Bang Attack", "Orgulhoso");
                            break;
                        case 4:
                            vilao = new Raditz(1000, 500, "Double Sunday");
                            break;
                        case 5:
                            vilao = new Freeza(3000, 1000, "Death Ball", 5);
                            System.out.println("Você escolheu lutar contra " + vilao.getClass().getSimpleName());

                            // Verifique se o jogador tem status suficientes para lutar contra o vilão
                            if (jogador.getVida() >= vilao.getVida() && jogador.getKi() >= vilao.getKi()) {
                                System.out.println("Você está pronto para a batalha!");
                                jogador.lutar(vilao);
                            } else {
                                System.out.println("Vegeta: Que orgulho fraco você tem!.");
                                System.out.println("Nappa: Você realmente se considera um guerreiro digno do Lorde Freeza?!.");
                                System.out.println("Goku: Não escute eles, vá e VENÇA!!.");

                            }

                            // Verifique se o jogador tem status suficientes para lutar contra o vilão
                            if (jogador.getVida() >= vilao.getVida() && jogador.getKi() >= vilao.getKi()) {
                                jogador.lutar(vilao);

                                // Verifique se o jogador venceu Freeza
                                if (vilao instanceof Freeza && vilao.getVida() <= 0) {
                                    System.out.println("Meus parabéns, grande guerreiro! Você venceu o Imperador do Universo, o grande Freeza.");
                                    System.out.println("Sua missão está concluída, agora você já pode descansar.");
                                    continuarJogo = false; // Encerre o jogo após a vitória
                                }
                            }
                            break;
                        default:
                            System.out.println("Vilão inválido. Jogo encerrado.");
                            return;
                    }
                    break;
                case 2:
                    jogador.treinar(); // Implemente a lógica de treinamento dentro do método treinar da classe Raca.
                    break;
                case 3:
                    continuarJogo = !jogador.fugir(); // Implemente a lógica de fuga dentro do método fugir da classe Raca.
                    if (!continuarJogo) {
                        System.out.println("Você fugiu do combate.");
                    }
                    break;
                case 4:
                    continuarJogo = false;
                    System.out.println("Você saiu do jogo.");
                    break;
                case 5:
                    // Usar a Semente dos Deuses para recuperar a vida
                    semente.usar(jogador);
                    break;
                default:
                    System.out.println("Ação inválida. Escolha novamente.");
            }
        }

        System.out.println("O jogo acabou.");

        scanner.close();
    }

    private static void exibirStatus(Raca jogador) {
        System.out.println("Status da Raça:");
        System.out.println("Vida: " + jogador.getVida());
        System.out.println("Ki: " + jogador.getKi());
        System.out.println("Técnica: " + jogador.getTecnica());
        // Adicione outros atributos específicos da raça, se houver.
    }
}
