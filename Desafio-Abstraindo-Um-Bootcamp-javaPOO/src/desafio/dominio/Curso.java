package desafio.dominio;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter

@SuperBuilder
@ToString(callSuper = true)

public class Curso extends  Conteudo {
    private int cargaHoraria;


    @Override
    public double calcularXP(int multiplicador) {
        return multiplicador * XP_PADRAO;
    }
}
