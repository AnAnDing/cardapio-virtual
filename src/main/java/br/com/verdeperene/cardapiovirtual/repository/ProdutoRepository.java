package br.com.verdeperene.cardapiovirtual.repository;

import br.com.verdeperene.cardapiovirtual.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long>, PagingAndSortingRepository<Produto, Long> {


}
