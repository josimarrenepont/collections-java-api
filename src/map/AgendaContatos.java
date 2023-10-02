package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
    return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Maria", 123456);
        agendaContatos.adicionarContato("Maria", 5665);
        agendaContatos.adicionarContato("Joao Pedro", 55555555);
        agendaContatos.adicionarContato("Jose", 968754);
        agendaContatos.adicionarContato("Rafael", 9876541);
        agendaContatos.adicionarContato("Bruno", 9635821);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Rafael");
        agendaContatos.exibirContatos();
        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Joao Pedro"));
    }
}
