package koda.dev.br.finance.controller;

import koda.dev.br.finance.model.Usuario;
import koda.dev.br.finance.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;


import static java.lang.Math.random;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @GetMapping("{id}")
    public Usuario BuscarPorId(@PathVariable("id") Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        usuarioRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody Usuario usuario){
        usuario.setId(id);
        usuarioRepository.save(usuario);
    }
}
