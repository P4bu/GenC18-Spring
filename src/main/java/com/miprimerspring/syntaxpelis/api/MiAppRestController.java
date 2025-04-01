package com.miprimerspring.syntaxpelis.api;

import com.miprimerspring.syntaxpelis.model.Usuario;
import com.miprimerspring.syntaxpelis.repository.MiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MiAppRestController {

    private final MiRepository miRepository;

    @Autowired
    public MiAppRestController(MiRepository miRepository) {
        this.miRepository = miRepository;
    }

    @Value("${custom.message}")
    private String msg;

    @GetMapping("/saludo")
    public String saludo() {
        return msg;
    }

    @GetMapping("/allUsuarios")
    public List<Usuario> allUsuario() {
        return miRepository.findAll();
    }


}
