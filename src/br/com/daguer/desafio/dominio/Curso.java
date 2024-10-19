package br.com.daguer.desafio.dominio;

public class Curso {

    private String titulo;
    private Integer cargaHoraria;
    private String descricao;

    public Curso() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
