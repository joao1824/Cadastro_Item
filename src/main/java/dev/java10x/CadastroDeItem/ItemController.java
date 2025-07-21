package dev.java10x.CadastroDeItem;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ItemController {
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Boasvindas";
    }
}
