import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Elevador elevador = new Elevador(0, 10);

        System.out.println("=== Simulador de Elevador ===");
        elevador.mostrarStatus();

        boolean rodando = true;

        while (rodando) {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Ir para um andar");
            System.out.println("2 - Abrir porta");
            System.out.println("3 - Fechar porta");
            System.out.println("4 - Ver Histórico");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Qual andar deseja ir? ");
                    int destino = leitor.nextInt();

                    if (destino < elevador.getAndarMinimo() || destino > elevador.getAndarMaximo()) {
                        System.out.println("Erro: andar invalido. Escolha entre "
                                + elevador.getAndarMinimo() + " e " + elevador.getAndarMaximo() + ".");
                        break;
                    }

                    if (elevador.isPortaAberta()) {
                        System.out.println("Erro: feche a porta antes de se mover.");
                        break;
                    }

                    if (destino == elevador.getAndarAtual()) {
                        System.out.println("Voce ja esta no andar " + destino + ".");
                        break;
                    }

                    // Chama subir() ou descer() em loop — exatamente como o professor pediu
                    while (elevador.getAndarAtual() != destino) {
                        if (destino > elevador.getAndarAtual()) {
                            elevador.subir();
                        } else {
                            elevador.descer();
                        }
                    }
                    break;

                case 2:
                    elevador.abrirPorta();
                    break;

                case 3:
                    elevador.fecharPorta();
                    break;

                case 4:
                    elevador.mostrarStatus();
                    break;

                case 0:
                    rodando = false;
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        }

        leitor.close();
    }
}
