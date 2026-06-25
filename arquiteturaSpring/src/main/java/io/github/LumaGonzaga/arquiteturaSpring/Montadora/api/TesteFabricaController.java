package io.github.LumaGonzaga.arquiteturaSpring.Montadora.api;

import io.github.LumaGonzaga.arquiteturaSpring.Montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Turbo // Consigo criar uma classe do tipo annotation e substituir o uso do Quilifier
    //@Qualifier("motorTurbo") Passa qual Bean do tipo carro seve ser injetado, pois temos mais de um Bean do tipo caro
    private Motor motor;//Injeção de dependência de todo o Bean motor

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
