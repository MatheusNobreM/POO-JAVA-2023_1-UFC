
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String iniciar = "\n";
        do {
            System.out.println("\nDigite" + " \"" + "5" + "\" " + "para jogar ou"+ " \""+ "0" + "\" " + "para sair do Jogo");
            System.out.print("-> ");
            iniciar = sc.next();

            while (iniciar.equals("5") && !iniciar.equals("0")) {
                sc.nextLine();
                processamentoDoPalpite myGuess = new processamentoDoPalpite();
                System.out.println("\nVamos começar!\n");

                for(int i=1; i <= 6;i++) {

                    do {

                        System.out.print("Digite palpite #"+ i +": ");
                        String tentativa = sc.nextLine();
                        myGuess.setPalavraTentada(tentativa);

                    } while (!myGuess.altorizacaoDaTentativa());

                    System.out.println();
                    System.out.print("Palpite:\t" + myGuess.impressaoPalpite());
                    String resposta = myGuess.impressaoResposta();
                    System.out.println("Resultado:\t" + resposta);

                    //System.out.println(myGuess.getPalavraDoDia());      //RETIRE O COMENTÁRIO DESTA LINHA
                    //System.out.println(resposta);                       //RETIRE O COMENTÁRIO DESTA LINHA

                    if(resposta.equals("+ + + + + \n")){
                        System.out.println(myGuess.toString());
                        break;
                    }

                    if(i == 6){
                        System.out.println(myGuess.impressaoDerrota());
                    }

                }

                System.out.println("Digite" + " \"" + "5" + "\" " + "para jogar novamente ou"+ " \""+ "0" + "\" " + "para sair do Jogo");
                System.out.print("-> ");
                iniciar = sc.next();
            }
        } while(!iniciar.equals("0"));
        System.out.println();
        System.out.print("Obrigado por jogar Letrexto!\n");

        sc.close();

    }
}