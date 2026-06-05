package io.github.LumaGonzaga.arquiteturaSpring.Montadora.configuration;

import io.github.LumaGonzaga.arquiteturaSpring.Montadora.Motor;
import io.github.LumaGonzaga.arquiteturaSpring.Montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean//Registra a instância criada no Container
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.Aspirado );
        return motor;
    }
}
