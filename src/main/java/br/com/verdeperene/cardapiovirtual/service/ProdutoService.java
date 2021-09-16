package br.com.verdeperene.cardapiovirtual.service;

import br.com.verdeperene.cardapiovirtual.dto.FiltroProdutoDto;
import br.com.verdeperene.cardapiovirtual.model.Produto;
import br.com.verdeperene.cardapiovirtual.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto insert(Produto produto){
        var existente = repository.findByNameIgnoreCase(produto.getNome());
        if(existente != null) {
            throw new IllegalArgumentException("Produto já existe");
        }
        return repository.save(produto);
    }

    public Produto update(Produto produto){
        var existente = repository.findByNameIgnoreCaseAndIdDiff(produto.getNome(), produto.getId());
        if(existente != null) {
            throw new IllegalArgumentException("Produto já existe");
        }
        return repository.save(produto);
    }

    public Page<Produto> list(FiltroProdutoDto filtro){
        var pg= PageRequest.of(filtro.getPageNumber(), filtro.getPageSize());
        if(filtro.getNome() != null) {
            return repository.listAll(filtro.getNome(), pg);
        } else {
            return repository.findAll(pg);
        }
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
