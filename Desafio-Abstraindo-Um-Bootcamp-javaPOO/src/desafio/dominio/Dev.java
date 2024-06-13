package desafio.dominio;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
       Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
       if(conteudo.isPresent()){
           conteudosConcluidos.add(conteudo.get());
           conteudosInscritos.remove(conteudo.get());
       } else {
           System.err.println("Você não esá matriculado em nenhum conteúdo.");
       }
    }

    public double calcularTotalXP(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP(conteudo.multiplicador)).sum();
    }
}
