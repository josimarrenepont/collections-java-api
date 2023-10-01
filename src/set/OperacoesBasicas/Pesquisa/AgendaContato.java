package set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato : contatoSet){
            if(contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }

        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato : contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.exibirContatos();

        agendaContato.adicionarContato("Jose", 123456);
        agendaContato.adicionarContato("Maria", 654321);
        agendaContato.adicionarContato("Maria", 1);
        agendaContato.adicionarContato("Joao", 456789);
        agendaContato.adicionarContato("Pedro", 456789);

        agendaContato.exibirContatos();

        System.out.println(agendaContato.pesquisarPorNome("Maria"));

        System.out.println("Contato Atualizado " + agendaContato.atualizarNumeroContato("Pedro", 123789));

        agendaContato.exibirContatos();
    }

}
