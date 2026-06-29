package io.github.LumaGonzaga.arquiteturaSpring.todos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

    @Id
    @Column(name = "id")//Nome da coluna
    @GeneratedValue(strategy = GenerationType.IDENTITY)//O banco gera a numeração do ID
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "flag_concluido")
    private Boolean concluido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
