
public class FuncionarioPJ {
    private String nome;
    private Long cpf;
    private Long cnpj;
    private Float salario;
    private Float valeRefeicao;
    private Integer auxilioSaude = 500;

    public FuncionarioPJ(String nome, Long cpf, Long cnpj, Float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.salario = salario;
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

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getValeRefeicao() {
        return valeRefeicao;
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
