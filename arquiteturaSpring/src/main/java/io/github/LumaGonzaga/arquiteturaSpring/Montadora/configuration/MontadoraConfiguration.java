package io.github.LumaGonzaga.arquiteturaSpring.Montadora.configuration;

import io.github.LumaGonzaga.arquiteturaSpring.Montadora.Motor;
import io.github.LumaGonzaga.arquiteturaSpring.Montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")//Registra a instância criada no Container
    //@Primary//Se não usar o @Qualifier, usando o @Primary, mostramos qual o Bean primário. Se não indicasse qual o Bean
    //@Qualifier ou Primary, como temos mais de um Bean do tipo carro, teríamos erro.
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(140);
        motor.setCilindros(4);
        motor.setModelo("XPTO-B1");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.Aspirado);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(160);
        motor.setCilindros(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.Eletrico);
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
