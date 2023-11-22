
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Agenda {
    public List<Contato> contatos;
    public Agenda(){
        contatos = new ArrayList<>();
    }
    public Agenda(String nome, String identificador, String numero){
        Contato contato = new Contato(nome,identificador,numero);
        contatos = new ArrayList<>();
        this.contatos.add(contato);
    }

    public Boolean inserirCtt(String nome, String identificador, String numero) {
        Contato ctt = null;
        for (Contato c : this.contatos) {
            if (c.getNome().equals(nome)) {
                ctt = c;
                break;
            }
        }
        if (ctt != null) {
            return false;
        }
        ctt = new Contato(nome);
        ctt.adicionarTelefone(identificador, numero);
        this.contatos.add(ctt);
        return true;
    }

    public String imprime (){

        ordenar();
        String str = "";
        Collections.sort(contatos);
        for (Contato contato : this.contatos) {
            str += contato.toString() ;
        }
        return str;
    }

    public String contatoRepetido(String nome){
        for (Contato c : this.contatos){
            if(c.getNome().contains(nome)) {
                System.out.println(c.getNome() +" Removido");
                contatos.remove(c);
            }
        }
        return null;
    }

    public String removerContato(String nome){
        for (Contato c : this.contatos){
            if(c.getNome() == nome) {
                System.out.println(c.getNome() +" Removido");
                contatos.remove(c);
            }
        }
        return null;
    }

    private void ordenar() {
        Collections.sort(contatos);
    }

}
