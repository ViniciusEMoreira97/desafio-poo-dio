import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Curso java");
        curso1.setCargaHoraria(70);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Mentoria java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev vinicius = new Dev();
        vinicius.setNome("Vinicius");
        vinicius.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos" + vinicius.getConteudoInscritos());
        vinicius.progredir();
        System.out.println("Conteudos Inscritos" + vinicius.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + vinicius.getConteudoConcluidas());
        System.out.println("XP" + vinicius.calcularTotalXP());
        vinicius.progredir();
        System.out.println("Conteudos Inscritos" + vinicius.getConteudoInscritos());

        System.out.println("XP" + vinicius.calcularTotalXP());



    }

}
