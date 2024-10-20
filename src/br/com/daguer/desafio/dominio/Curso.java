package br.com.daguer.desafio.dominio;

public class Curso extends Conteudo     {

    private Integer cargaHoraria;

    public Curso() {
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
