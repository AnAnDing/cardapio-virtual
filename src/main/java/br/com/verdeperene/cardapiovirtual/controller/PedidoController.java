package br.com.verdeperene.cardapiovirtual.controller;

import br.com.verdeperene.cardapiovirtual.model.Pedido;
import br.com.verdeperene.cardapiovirtual.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pedido")
public class PedidoController {

        @Autowired
        private PedidoService service;

        @PostMapping
        public Pedido insert(@RequestBody Pedido pedido){
            return service.insert(pedido);
        }

        @PutMapping
        public Pedido update(@RequestBody Pedido pedido){
            return service.update(pedido);
        }

        @GetMapping
        public Page<Pedido> list(@RequestParam int pageSize, @RequestParam int pageNumber){
            return service.list(pageSize, pageNumber);
        }

        @DeleteMapping("{id}")
        public void delete(@PathVariable Long id){
                service.delete(id);
        }
}
