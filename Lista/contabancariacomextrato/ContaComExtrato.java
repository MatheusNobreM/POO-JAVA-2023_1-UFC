package Lista.contabancariacomextrato;

public class ContaComExtrato {
    Integer codigo;
    Double saldo;
    Double limite;
    Double[] extrato;
    Integer cursor;

    public ContaComExtrato(Integer codigoConta, Double saldoInicial){
        this.codigo = codigoConta;
        this.saldo = 0.0;
        this.limite = 100.0;
        this.extrato = new Double[20];
        this.cursor = 0;
        this.depositar(saldoInicial);
    }

    public void alterarLimite(Double novoLimite){
        this.limite = novoLimite;
    }

    public double emitirSaldo(){
        return this.saldo + this.limite;
    }

    public void depositar (Double valor){
        if(valor <= 0.0){return;}
        this.extrato[this.cursor] = valor;
        this.cursor++;
        this.saldo += valor;
    }

    public boolean sacar (Double valor){
        if(valor <= 0.0){return false;}
        if(valor <= (this.saldo + this.limite)) {
            this.extrato[this.cursor] = -valor;
            this.cursor++;
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public Double[] emitirExtrato(){
        return this.extrato;
    }


}
