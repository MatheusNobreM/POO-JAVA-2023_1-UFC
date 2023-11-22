package Lista.cartaoru;

public class CartaoRU {
    String idCartao;
    String siapeDiscente;
    Boolean isencao;
    Double saldo;

    public CartaoRU(String idCartao, String siapeDiscente, Boolean isencao){
        this.idCartao = idCartao;
        this.siapeDiscente = siapeDiscente;
        this.isencao = isencao;
        this.saldo = 0.0;
    }

    public void recarregar(Double valor){
        if( valor <= 0.0){
            return;
        }
            this.saldo += valor;
    }

    public boolean fazerRefeicao(){
        if(this.isencao == true){
            return true;
        }else if(this.saldo >= 1.1){
            this.saldo -= 1.1;
            return true;
        }else {
            return false;
        }
    }

    public double emitirSaldo(){
        return this.saldo;
    }

    public void alterarIsencao(Boolean isencao){
        this.isencao = isencao;
    }


}
