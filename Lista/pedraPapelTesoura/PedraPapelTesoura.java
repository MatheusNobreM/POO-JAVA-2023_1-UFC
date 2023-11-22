package Lista.pedraPapelTesoura;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

    static final int PEDRA = 0;
    static final int PAPEL = 1;
    static final int TESOURA = 2;

    static final int EMPATE = 0;
    static final int USUARIO_VENCEU = 1;
    static final int CPU_VENCEU = -1;

    static public void main(String[] args) {
        System.out.println("Vamos jogar Pedra, Papel, Tesoura!");
        int jogadaUsuario = recebeJogadaUsuario();
        int jogadaCpu = geraJogadaCpu();
        int resultado = executaJogada(jogadaUsuario, jogadaCpu);
        exibeResultado(jogadaUsuario, jogadaCpu, resultado);
    }

    static public int recebeJogadaUsuario() {
        System.out.println("PEDRA: 0, PAPEL: 1, TESOURA: 2");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }

    static public int geraJogadaCpu() {
        Random rnd = new Random();
        long semente = System.currentTimeMillis();
        rnd.setSeed(semente);
        return rnd.nextInt(3); // retorna aleatorio entre 0 e 2
    }

    static public int executaJogada(int jogadaUsuario, int jogadaCpu) {
        int resultado;
        if (jogadaUsuario == jogadaCpu) {
            resultado = EMPATE;
        } else if (((jogadaUsuario == PEDRA) && (jogadaCpu == TESOURA)) ||
                ((jogadaUsuario == TESOURA) && (jogadaCpu == PAPEL)) ||
                ((jogadaUsuario == PAPEL) && (jogadaCpu == PEDRA))) {
            resultado = USUARIO_VENCEU;
        } else {
            resultado = CPU_VENCEU;
        }
        return resultado;
    }

    static public void exibeResultado(int jogadaUsuario, int jogadaCpu, int resultado) {
        switch (resultado) {
            case EMPATE:
                System.out.println("Voce = " + jogadaUsuario + " vs CPU = " + jogadaCpu + " => EMPATE");
                break;
            case USUARIO_VENCEU:
                System.out.println("Voce = " + jogadaUsuario + " vs CPU = " + jogadaCpu + " => USUARIO VENCEU");
                break;
            case CPU_VENCEU:
                System.out.println("Voce = " + jogadaUsuario + " vs CPU = " + jogadaCpu + " => CPU VENCEU");
                break;
        }

    }

}