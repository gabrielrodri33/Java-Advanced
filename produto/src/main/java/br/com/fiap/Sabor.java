package br.com.fiap;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_2TDSPF_SABOR")
public class Sabor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ-SABOR")
    @SequenceGenerator( name = "SQ-SABOR", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_SABOR")
    private Long id;

    @Column(name = "NM_SABOR")
    private String nome;

    @Column(name = "DS_SABOR")
    private String descrilcao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrilcao() {
        return descrilcao;
    }

    public void setDescrilcao(String descrilcao) {
        this.descrilcao = descrilcao;
    }

    @Override
    public String toString() {
        return "Sabor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrilcao='" + descrilcao + '\'' +
                '}';
    }
}
