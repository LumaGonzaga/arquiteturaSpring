package io.github.LumaGonzaga.arquiteturaSpring.Montadora.api;

import io.github.LumaGonzaga.arquiteturaSpring.Montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TesteFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darignicao(chave);
    }
}
