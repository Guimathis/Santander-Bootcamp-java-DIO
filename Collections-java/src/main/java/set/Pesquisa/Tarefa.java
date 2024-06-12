package main.java.set.Pesquisa;

public class Tarefa {
    private  String descricao;
    private boolean conluida;

    public Tarefa(String descricao, boolean conluida) {
        this.descricao = descricao;
        this.conluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConluida() {
        return conluida;
    }

    public void setConluida(boolean conluida) {
        this.conluida = conluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", conluida=" + conluida +
                '}';
    }
}
