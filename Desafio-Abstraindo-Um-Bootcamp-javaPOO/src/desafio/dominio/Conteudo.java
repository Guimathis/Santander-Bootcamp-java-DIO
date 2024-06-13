package desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;
    protected int multiplicador;

    public Conteudo(String descricao, String titulo) {
        this.descricao = descricao;
        this.titulo = titulo;
    }

    public abstract double calcularXP(int multiplicador);
}
