package Lista.pedraPapelTesoura;
import java.util.Random;
import java.util.Scanner;

public class TestPedraPapelTesoura {
        static final int PEDRA = 0;
        static final int PAPEL = 1;
        static final int TESOURA = 2;

        static public void main(String[] args){
            System.out.println("Vamos jogar Pedra, Papel, Tesoura!");
            int jogadaUsuario = recebeJogadaUsuario();
            int jogadaCpu = geraJogadaCpu();
            int resultado = executaJogada(jogadaUsuario, jogadaCpu);
            exibeResultado(jogadaUsuario, jogadaCpu, resultado);
        }

        static public int recebeJogadaUsuario(){
            System.out.println("Pedra: 0 - Papel: 1 - Tesoura: 2");
            Scanner leitura = new Scanner(System.in);
            int jogada = leitura.nextInt();
            return jogada;
        }

        static public int geraJogadaCpu(){
            Random rnd = new Random();
            long semente = System.currentTimeMillis();
            rnd.setSeed(semente);
            return rnd.nextInt(3); // retorna aleatorio entre 0 e 2
        }

        static public int executaJogada(int jogadaUsuario, int jogadaCpu){
            if (jogadaUsuario == jogadaCpu) {
                return 0;
            } else if ( (jogadaUsuario == 0 && jogadaCpu == 2) ||
                        (jogadaUsuario == 1 && jogadaCpu == 0) ||
                        (jogadaUsuario == 2 && jogadaCpu == 1) ) {
                return 1;
            }else{
                return -1;
            }
        }

        static public void exibeResultado(int jogadaUsuario, int jogadaCpu, int resultado){
            if(resultado == 0){
                System.out.println("VOCÊ = "+ jogadaUsuario +" - CPU = "+ jogadaCpu +" == EMPATE");
            } else if (resultado == 1) {
                System.out.println("VOCÊ = "+ jogadaUsuario +" - CPU = "+ jogadaCpu +" == Jogador Venceu");
            }else{
                System.out.println("VOCÊ = "+ jogadaUsuario +" - CPU = "+ jogadaCpu +" == CPU Venceu");
            }
        }

}
