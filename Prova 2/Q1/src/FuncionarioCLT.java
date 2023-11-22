import java.util.ArrayList;
import java.util.List;

public class FuncionarioCLT {
    private String nome;
    private Long cpf;
    private Float salario;
    private Float valeRefeicao;
    private Integer auxilioSaude = 500;

    public FuncionarioCLT(String nome, Long cpf, Float salario) {
        this.nome = nome;
        this.cpf = cpf;
        if(salario >= 1320) {
            this.valeRefeicao = ((salario * 6) / 100);
            this.salario = salario;
        }else{
            this.salario = salario;
            this.valeRefeicao = 0.0F;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        if(salario >= 1320){
            this.valeRefeicao = ((salario * 6)/100F);
            this.salario = salario;

        }else {
            System.out.println("Não é possível passar um salário menor que R$ 1320 ");
            return;
        }
    }

    public Float getValeRefeicao() {
        return this.valeRefeicao;
    }

    public void setValeRefeicao(Float valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }

    public Integer getAuxilioSaude() {
        return auxilioSaude;
    }

    public void setAuxilioSaude(Integer auxilioSaude) {
        this.auxilioSaude = auxilioSaude;
    }
}
