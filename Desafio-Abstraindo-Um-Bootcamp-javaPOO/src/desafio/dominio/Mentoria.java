package desafio.dominio;

import java.time.LocalDate;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Mentoria extends Conteudo {
    private LocalDate data;


    @Override
    public double calcularXP(int multiplicador) {
        return  XP_PADRAO * multiplicador;
    }
}
