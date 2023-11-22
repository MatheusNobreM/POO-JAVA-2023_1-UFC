import java.util.ArrayList;
import java.util.List;

public class Contato implements Comparable<Contato>{
    private String nome;
    private List<Telefone> telefones;

    public Contato(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(String identificador, String numero) {
        Telefone telefone = new Telefone(identificador, numero);
        telefones.add(telefone);

    }
    @Override
    public int compareTo(Contato outroContato) {
        return this.nome.compareTo(outroContato.getNome());
    }

    public Contato(String nome, String identificador, String numero) {
        this.telefones = new ArrayList<>();
        this.nome = nome;
        Telefone telefone = new Telefone(identificador, numero);
        telefones.add(telefone);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String toString() {
        String listNumeros = "Lista de contatos de " + getNome() + ":\n";
        for(Telefone telefone : this.telefones){
            listNumeros += telefone.toString();
        }
        return listNumeros;
    }


}
