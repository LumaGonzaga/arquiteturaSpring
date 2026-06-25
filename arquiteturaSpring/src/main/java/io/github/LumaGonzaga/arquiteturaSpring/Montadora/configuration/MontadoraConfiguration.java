package io.github.LumaGonzaga.arquiteturaSpring.Montadora.configuration;

import io.github.LumaGonzaga.arquiteturaSpring.Montadora.Motor;
import io.github.LumaGonzaga.arquiteturaSpring.Montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")//Registra a instância criada no Container
    @Primary
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(140);
        motor.setCilindros(4);
        motor.setModelo("XPTO-B1");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.Turbo);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(160);
        motor.setCilindros(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.Turbo);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPTO-02");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.Turbo);
        return motor;
    }
}
