package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributos

    private String nome;
    private int codigoConvidado;

    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvidado() == convidado.getCodigoConvidado() && Objects.equals(getNome(), convidado.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCodigoConvidado());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvidado=" + codigoConvidado +
                '}';
    }
}
