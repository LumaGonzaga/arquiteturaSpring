package io.github.LumaGonzaga.arquiteturaSpring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        //        SpringApplication.run(Application.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);//Objeto de configurações e start na aplicação, passando a classe que vai iniciar a aplicação.
        builder.run(args); //Build para inicializar usando os args
        builder.bannerMode(Banner.Mode.OFF);//Desliga o banner Spring do build do application
        ConfigurableApplicationContext applicationContext = builder.context();//
        //var produtoRepository = applicationContext.getBean("produtoRepository");

        builder.profiles("producao"); //Cria e ativa o perfil de produção
       // builder.properties("spring.datasourse.url=jdbc://");

    }

}
