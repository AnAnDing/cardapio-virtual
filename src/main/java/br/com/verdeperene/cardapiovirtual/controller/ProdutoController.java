package br.com.verdeperene.cardapiovirtual.controller;

import br.com.verdeperene.cardapiovirtual.dto.FiltroProdutoDto;
import br.com.verdeperene.cardapiovirtual.model.Produto;
import br.com.verdeperene.cardapiovirtual.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public Produto insert(@RequestBody Produto produto){
        return service.insert(produto);
    }

    @PutMapping
    public Produto update(@RequestBody Produto produto){
        return service.update(produto);
    }

    @GetMapping
    public Page<Produto> list(FiltroProdutoDto dto){
        return service.list(dto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
