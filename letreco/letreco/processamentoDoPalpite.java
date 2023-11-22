
public class processamentoDoPalpite {

    private palavraSorteada palavraDaSorte;
    private String palavraDoDia;
    private String palavraTentada;


    processamentoDoPalpite() {
        palavraDaSorte = new palavraSorteada();
        palavraDoDia = palavraDaSorte.getaPalavra();
    }

    /*public String getPalavraDoDia() {   //RETIRE O COMENTÁRIO DESTE MÉTODO
        return palavraDoDia;
    }*/

    public String getPalavraTentada() {
        return palavraTentada;
    }
    public void setPalavraTentada(String palavraTentada) {
        this.palavraTentada = palavraTentada;
    }


    public String impressaoPalpite () {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < palavraTentada.length(); i++) {
            result.append(palavraTentada.charAt(i));
            if (i < palavraTentada.length() - 1) {
                result.append(" ");
            }
        }


        return result + "\n";
    }

    public String impressaoResposta () {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < palavraDoDia.length(); i++){
            if(palavraDoDia.charAt(i) == palavraTentada.charAt(i)) {
                result.append("+");
            }else {
                result.append("-");
            }
        }
        for(int i = 0; i < palavraDoDia.length(); i++) {
            if(result.charAt(i) == '-') {
                for(int w = 0; w < palavraDoDia.length(); w++) {

                    if(palavraTentada.charAt(i) == palavraDoDia.charAt(w) && result.charAt(w) != '+') {
                        break;
                    } else {
                        if( (w+1) == palavraDoDia.length() ) {
                            result.setCharAt(i, '*');
                        }
                    }

                }
            }
        }

        for(int i = 0; i < palavraDoDia.length(); i++) {
            int letraRepetidaTentada =0;
            int letraRepetidaDia =0;

            if(result.charAt(i) == '-') {
                for(int k = 0; k < palavraDoDia.length(); k++) {
                    if(palavraTentada.charAt(i) == palavraTentada.charAt(k) && result.charAt(k) == '-'){
                        letraRepetidaTentada++;
                    }
                    if(palavraTentada.charAt(i) == palavraDoDia.charAt(k) && result.charAt(k) != '+' ) {
                        letraRepetidaDia++;
                    }
                }

                int dif = letraRepetidaTentada - letraRepetidaDia;

                while(dif > 0) {
                    for(int e = palavraDoDia.length()-1; e >= 0; e--){

                        if((palavraTentada.charAt(i) == palavraTentada.charAt(e) && result.charAt(e) == '-')) {
                            result.setCharAt(e, '*');
                            break;
                        }

                    }
                    dif--;
                }

            }


        }

        StringBuilder resultFinal = new StringBuilder();
        for(int i = 0;i < 5; i++){
            resultFinal.append(result.charAt(i));
            resultFinal.append(' ');
        }

        return resultFinal + "\n";
    }
    public Boolean altorizacaoDaTentativa() {

        if(palavraTentada.length() != 5) {
            return false;
        }


        for(String procura: palavraDaSorte.getList()) {
            if(procura.equals(palavraTentada)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Parabéns, você adivinhou a palavra" + " \"" + palavraDoDia + "\" " +"corretamente!\nObrigado por jogar Letrexto!\n";

    }
    public String impressaoDerrota() {
        return "Poxa que pena, não foi dessa vez!" + "\nA palavra era " + " \"" + palavraDoDia + "\"\n";
    }


}
