public class Runner {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT1 = new FuncionarioCLT("Antonio",31155522212L,2000F);
        FuncionarioCLT funcionarioCLT2 = new FuncionarioCLT("Francisco",11122233344L, 1000F); // invalido
        FuncionarioCLT funcionarioCLT3 = new FuncionarioCLT("Marcos",12345678901L, 15000F);
        FuncionarioCLT funcionarioCLT4 = new FuncionarioCLT("Maria", 55512398721L,8000F);
        FuncionarioCLT funcionarioCLT5 = new FuncionarioCLT("Felipe", 77743212334L,700F); // invalido
        FuncionarioCLT[] funcionariosCLT = {funcionarioCLT1,funcionarioCLT2,funcionarioCLT3,funcionarioCLT4,funcionarioCLT5};

        FuncionarioPJ funcionarioPJ1 = new FuncionarioPJ("Ana", 11111111111L, 22222222222222L, 5000F);
        FuncionarioPJ funcionarioPJ2 = new FuncionarioPJ("Lucas",33333333333L,44444444444444L, 2500F);
        FuncionarioPJ funcionarioPJ3 = new FuncionarioPJ("Pedro",55555555555L,66666666666666L, 20000F);
        FuncionarioPJ funcionarioPJ4 = new FuncionarioPJ("Matheus",777777777777L,88888888888888L, 8000F);
        FuncionarioPJ funcionarioPJ5 = new FuncionarioPJ("André",20099999999L,1987654321123L, 9300F);
        FuncionarioPJ[] funcionariosPJ = {funcionarioPJ1,funcionarioPJ2,funcionarioPJ3,funcionarioPJ4,funcionarioPJ5};

        GerenciamentoFolha gerenciamento = new GerenciamentoFolha(funcionariosCLT,funcionariosPJ);
        gerenciamento.ExtratoGeral();
        gerenciamento.TotalDaFolha();
        gerenciamento.TotalDosBeneficios();


    }
}