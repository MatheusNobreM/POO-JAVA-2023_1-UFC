package Lista.contabancariasimples;
public class Conta {
    Integer codigo;
    Double saldo;
    Double limite;

    public Conta(Integer codigo, Double saldoInicial){
        this.codigo = codigo;
        this.saldo = saldoInicial;
        this.limite = 100.0;
    }

    public void alterarLimite(Double novoLimite){
        this.limite = novoLimite;
    }

    public double emitirSaldo(){
        return this.saldo + this.limite;
    }

    public void depositar(Double valor){
        if(valor <= 0.0){
            //System.out.println("Não é possivel realizar a operação");
            return;
        }
        this.saldo += valor;
    }

    public boolean sacar(Double valor){
        if( (valor <= 0.0) || ( (this.saldo + this.limite) < valor) ){
           // System.out.println("Não é possivel realizar a operação");
            return false;
        }else {
            this.saldo -= valor;
            return true;
        }
    }

}
