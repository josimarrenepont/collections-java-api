package list.OperacoesBasicas;

import list.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();

    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefas : tarefaList){
            if(tarefas.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefas);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterdescricaoTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("número total da minha lista é: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("número total da minha lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("removendo tarefa: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterdescricaoTarefas();
    }
}


