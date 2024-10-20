import br.com.daguer.desafio.dominio.Bootcamp;
import br.com.daguer.desafio.dominio.Curso;
import br.com.daguer.desafio.dominio.Dev;
import br.com.daguer.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Spring");
        mentoria1.setDescricao("Mentoria de Spring");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro Daguer");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Pedro: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("----------------------");
        System.out.println("Conteúdos concluídos de Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("XP de Pedro: " + devPedro.calcularTotalXp());


        System.out.println("----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("----------------------");
        System.out.println("Conteúdos concluídos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("XP de João: " + devJoao.calcularTotalXp());

    }

}
