package dev.java10x.CadastroDeItem;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Boasvindas";
    }
}
