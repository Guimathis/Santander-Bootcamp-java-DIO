import desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso = Curso.builder().titulo("Curso java").descricao("Curso de java").cargaHoraria(20).multiplicador(2).build();
        Curso curso1 = Curso.builder().titulo("Curso python").descricao("Curso de python").cargaHoraria(40).multiplicador(2).build();

        Mentoria mentoria = Mentoria.builder().data(LocalDate.now()).descricao("Primeira mentoria ").titulo("Mentoria 1").multiplicador(1).build();


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Aprenda java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);


        Dev guimas = new Dev();
        guimas.setNome("Guimathis");
        guimas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + guimas.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + guimas.getConteudosConcluidos());
        guimas.progredir();
//        guimas.progredir();
//        guimas.progredir();
        System.out.println("Xp aquirido:" + guimas.calcularTotalXP() );

        Dev joao = new Dev();
        joao.setNome("joão");
        joao.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos: " + joao.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + joao.getConteudosConcluidos());
        joao.progredir();
        joao.progredir();
        joao.progredir();
        System.out.println("Xp aquirido:" + joao.calcularTotalXP() );
    }
}
