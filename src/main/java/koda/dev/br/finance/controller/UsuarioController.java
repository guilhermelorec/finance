package koda.dev.br.finance.controller;

import koda.dev.br.finance.model.Usuario;
import koda.dev.br.finance.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        System.out.println("usuario salvo" + usuario);

        var id = UUID.randomUUID().toString();
        usuario.setId(id);

        usuarioRepository.save(usuario);
        return usuario;
    }

}
