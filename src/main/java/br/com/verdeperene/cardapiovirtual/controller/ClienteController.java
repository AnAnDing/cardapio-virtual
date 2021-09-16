package br.com.verdeperene.cardapiovirtual.controller;

import br.com.verdeperene.cardapiovirtual.model.Cliente;
import br.com.verdeperene.cardapiovirtual.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cliente")
public class ClienteController {


    @Autowired
    private ClienteService service;

    @PostMapping
    public Cliente insert(@RequestBody Cliente cliente){
        return service.insert(cliente);
    }

    @PutMapping
    public Cliente update(@RequestBody Cliente cliente){
        return service.update(cliente);
    }

    @GetMapping
    public Page<Cliente> list(@RequestParam int pageSize, @RequestParam int pageNumber){
        return service.list(pageSize, pageNumber);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
