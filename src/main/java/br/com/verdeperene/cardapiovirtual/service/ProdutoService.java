package br.com.verdeperene.cardapiovirtual.service;

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
        return repository.save(produto);
    }

    public Produto update(Produto produto){
        return repository.save(produto);
    }

    public Page<Produto> list(int pageSize, int pageNumber){
        var pg= PageRequest.of(pageNumber, pageSize);
        return repository.findAll(pg);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
