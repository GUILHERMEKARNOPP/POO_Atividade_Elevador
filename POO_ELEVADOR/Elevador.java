public class Elevador {

    private int andarAtual;
    private int andarMinimo;
    private int andarMaximo;
    private boolean portaAberta;

    // Construtor padrão: térreo=0, máximo=10
    public Elevador() {
        this.andarAtual = 0;
        this.andarMinimo = 0;
        this.andarMaximo = 10;
        this.portaAberta = false;
    }

    // Construtor com parâmetros
    public Elevador(int andarMinimo, int andarMaximo) {
        this.andarAtual = andarMinimo;
        this.andarMinimo = andarMinimo;
        this.andarMaximo = andarMaximo;
        this.portaAberta = false;
    }

    // Subir um andar
    public void subir() {
        if (portaAberta) {
            System.out.println("Erro: feche a porta antes de subir.");
            return;
        }
        if (andarAtual >= andarMaximo) {
            System.out.println("Erro: já está no andar máximo (" + andarMaximo + ").");
            return;
        }
        andarAtual++;
        System.out.println("Subindo... Andar atual: " + andarAtual);
    }

    // Descer um andar
    public void descer() {
        if (portaAberta) {
            System.out.println("Erro: feche a porta antes de descer.");
            return;
        }
        if (andarAtual <= andarMinimo) {
            System.out.println("Erro: já está no andar mínimo (" + andarMinimo + ").");
            return;
        }
        andarAtual--;
        System.out.println("Descendo... Andar atual: " + andarAtual);
    }

    // Abrir a porta
    public void abrirPorta() {
        if (portaAberta) {
            System.out.println("A porta já está aberta.");
            return;
        }
        portaAberta = true;
        System.out.println("Porta aberta no andar " + andarAtual + ".");
    }

    // Fechar a porta
    public void fecharPorta() {
        if (!portaAberta) {
            System.out.println("A porta já está fechada.");
            return;
        }
        portaAberta = false;
        System.out.println("Porta fechada no andar " + andarAtual + ".");
    }

    // Getter: andar atual
    public int getAndarAtual() {
        return andarAtual;
    }

    // Getter: porta aberta
    public boolean isPortaAberta() {
        return portaAberta;
    }

    // Getter: andar mínimo
    public int getAndarMinimo() {
        return andarMinimo;
    }

    // Getter: andar máximo
    public int getAndarMaximo() {
        return andarMaximo;
    }

    // Mostrar status
    public void mostrarStatus() {
        System.out.println("=== Status do Elevador ===");
        System.out.println("Andar atual  : " + andarAtual);
        System.out.println("Andar mínimo : " + andarMinimo);
        System.out.println("Andar máximo : " + andarMaximo);
        System.out.println("Porta        : " + (portaAberta ? "Aberta" : "Fechada"));
        System.out.println("==========================");
    }
}
