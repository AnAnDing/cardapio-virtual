package br.com.verdeperene.cardapiovirtual.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "prato")
public class Prato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 500)
    private String nome;

    @Column(name = "descricao", length = 1000)
    private String descricao;

    private String peso;

    private Float valor;





}
