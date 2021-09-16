package br.com.verdeperene.cardapiovirtual.repository;

import br.com.verdeperene.cardapiovirtual.model.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long>, PagingAndSortingRepository<Produto, Long> {

    @Query("select p from Produto p where lower(p.nome) = lower(:name)")
    Page<Produto> listAll(String name, Pageable pageable);

    @Query("select p from Produto p where lower(p.nome) = lower(:name)")
    Produto findByNameIgnoreCase(String name);

    @Query("select p from Produto p where lower(p.nome) = lower(:name) and p.id <> :id")
    Produto findByNameIgnoreCaseAndIdDiff(String name, Long id);

    boolean existsByNome(String nome);
}
