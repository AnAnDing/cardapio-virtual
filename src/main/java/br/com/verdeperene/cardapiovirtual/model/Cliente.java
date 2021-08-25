package br.com.verdeperene.cardapiovirtual.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 500)
    private String nome;

    @Column(nullable = false, length = 11)
    private String numContato;

    @Column(nullable = false)
    private Date dataNascimento;

    @Column(nullable = false, length = 500)
    private String endereco;

}
