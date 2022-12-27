import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
            curso1.setTitulo("curso Java");
            curso1.setDescricao("descricao curso java");
            curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
            curso2.setTitulo("curso js");
            curso2.setDescricao("descrição curso js");
            curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
            mentoria.setData(LocalDate.now());
            mentoria.setDescricao("descrição mentoria java");
            mentoria.setTitulo("mentoria de java");

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLettycia = new Dev();
        devLettycia.setNome("Cami");
        devLettycia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos cami" +  devLettycia.getConteudosInscritos());
        devLettycia.progredir();
        devLettycia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devLettycia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devLettycia.getConteudosConcluidos());
        System.out.println("XP:" + devLettycia.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}


