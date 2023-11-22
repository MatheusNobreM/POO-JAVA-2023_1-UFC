import java.util.ArrayList;
import java.util.List;

public class GerenciamentoFolha{
    private FuncionarioCLT[] funcionarioCLT;
    private FuncionarioPJ[] funcionarioPJ;

    public GerenciamentoFolha(FuncionarioCLT[] funcionarioCLT, FuncionarioPJ[] funcionarioPJ) {
        this.funcionarioCLT = funcionarioCLT;
        this.funcionarioPJ = funcionarioPJ;
    }
    public void ExtratoGeral(){
        for (FuncionarioCLT funcionarios : funcionarioCLT) {
            if(funcionarios.getValeRefeicao() != 0.0 ) {
                System.out.println("CPF: " + funcionarios.getCpf() + " Salario: " + funcionarios.getSalario() + " Beneficios: " + (funcionarios.getAuxilioSaude() + funcionarios.getValeRefeicao()));
            }else{
                System.out.println("Funcionario "+ funcionarios.getNome()+ " com o CPF "+ funcionarios.getCpf() +" esta com um salario inferior a R$ 1320");
            }
        }
        for (FuncionarioPJ funcionarios : funcionarioPJ) {
            System.out.println("CPF: "+ funcionarios.getCpf()+" Salario: "+ funcionarios.getSalario()+" Beneficios: "+ funcionarios.getAuxilioSaude() );
        }
    }
    public void TotalDaFolha(){
        float total = 0F;
        for(FuncionarioCLT funcionarios : funcionarioCLT){
            total += (funcionarios.getSalario() + funcionarios.getAuxilioSaude() + funcionarios.getValeRefeicao() );
        }
        for(FuncionarioPJ funcionarios : funcionarioPJ){
            total += (funcionarios.getSalario() + funcionarios.getAuxilioSaude() );
        }
        System.out.println("Valor total da folha e: " + total);
    }
    public void TotalDosBeneficios(){
        float total = 0F;
        for(FuncionarioCLT funcionarios : funcionarioCLT){
            total += (funcionarios.getAuxilioSaude() + funcionarios.getValeRefeicao() );
        }
        for(FuncionarioPJ funcionarios : funcionarioPJ){
            total += funcionarios.getAuxilioSaude();
        }
        System.out.println("Valor total da folha e: " + total);
    }

    public FuncionarioCLT[] getFuncionarioCLT() {
        return funcionarioCLT;
    }

    public void setFuncionarioCLT(FuncionarioCLT[] funcionarioCLT) {
        this.funcionarioCLT = funcionarioCLT;
    }

    public FuncionarioPJ[] getFuncionarioPJ() {
        return funcionarioPJ;
    }

    public void setFuncionarioPJ(FuncionarioPJ[] funcionarioPJ) {
        this.funcionarioPJ = funcionarioPJ;
    }
}
