public class Runner {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.inserirCtt("Felipe", "Celular", "123456789");
        agenda.inserirCtt("Ana", "Casa", "987654321");
        agenda.inserirCtt("Silva", "Casa", "555555555");
        agenda.inserirCtt("Ciclano", "Celular", "999999999");

        System.out.println("Agenda completa:");
        System.out.println(agenda.imprime());

        agenda.removerContato("Silva");

        System.out.println("Agenda após remoção do contato:");
        System.out.println(agenda.imprime());
    }
}