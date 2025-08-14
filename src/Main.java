import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Development");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJancker = new Dev();
        devJancker.setNome("Jancker");
        devJancker.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Jancker: " + devJancker.getConteudosInscritos());

        devJancker.progredir();
        devJancker.progredir();

        System.out.println("--------------- // ---------------");
        System.out.println("Conteudos inscritos Jancker: " + devJancker.getConteudosInscritos());
        System.out.println("Conteudos concluídos Jancker: " + devJancker.getConteudosConcluidos());
        System.out.println("XP: " + devJancker.calcularTotalXp());

        System.out.println("--------------- // ---------------");

        Dev devLivia = new Dev();
        devLivia.setNome("Livia");
        devLivia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Livia: " + devLivia.getConteudosInscritos());

        devLivia.progredir();
        devLivia.progredir();
        devLivia.progredir();

        System.out.println("--------------- // ---------------");
        System.out.println("Conteúdos inscritos Livia: " + devLivia.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Livia: " + devLivia.getConteudosConcluidos());
        System.out.println("XP: " + devLivia.calcularTotalXp());

    }
}
