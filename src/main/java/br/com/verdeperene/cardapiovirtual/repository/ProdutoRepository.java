package br.com.verdeperene.cardapiovirtual.repository;

import br.com.verdeperene.cardapiovirtual.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
