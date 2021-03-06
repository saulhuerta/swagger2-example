# Spring Boot, RESTful Services, SWAGGER2

Este proyecto expone una serie de servicios RESTful en los cuales los requests se pueden hacer con diferentes métodos (se implementarán) y las respuestas en formatos distintos.

La intención de este proyecto es principalmente mostrar el uso de SWAGGER2 para documentar los servicios REST que se exponen mediante un proyeto Java desarrollado y ejecutado en NetBeans IDE 8.2.

De manera adelantada, te puedo compartir que se requieren dos dependencias adicionales en tu archivo pom.xml:

    <dependency>  
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger2</artifactId>
        <version>2.9.2</version>
    </dependency> 
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger-ui</artifactId>
        <version>2.9.2</version>
    </dependency>
        

Posteriormente, una clase de configuración para SWAGGER2:


    @Configuration
    @EnableSwagger2
    public class SwaggerConfig {

        @Bean
        public Docket api(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
        }

    }



Con lo anterior, es casi tan encillo como ejecutar el proyecto y acceder a la URL:  
http://localhost:8080/swagger-ui.html

Lo anterior mostrará el detalle de los servicios expuestos:
![Swagger2](https://saulh.files.wordpress.com/2019/01/screenshot-from-2019-01-28-11-37-11.png)


Incluso te da la posibilidad de probar los servicios desde la vista o desce una terminal con curl:
![Swagger2](https://saulh.files.wordpress.com/2019/01/screenshot-from-2019-01-28-11-37-55.png)






