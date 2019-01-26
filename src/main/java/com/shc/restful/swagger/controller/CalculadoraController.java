package com.shc.restful.swagger.controller;

import com.shc.restful.swagger.services.CalculadoraServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Saul Huerta - <saul.huerta@gmail.com>
 *
 */

@RestController
public class CalculadoraController {
    
    @Autowired
    private CalculadoraServiceInterface  calculadoraService;
    
    @GetMapping(path = "/hello")
    public String get() throws Exception{
        return "Greetings, human.";
    }
    
    @GetMapping(path = "/sumar-enteros")
    public Integer sumaEnteros(@RequestParam(value="valorA") Integer valorA, @RequestParam(value="valorB") Integer valorB) throws Exception{
        return calculadoraService.sumar(valorA, valorB);
    }
    
    @GetMapping(path = "/restar-enteros")
    public Integer restaEnteros(@RequestParam(value="valorA") Integer valorA, @RequestParam(value="valorB") Integer valorB) throws Exception{
        return calculadoraService.restar(valorA, valorB);
    }
    
    @GetMapping(path = "/multiplicar-enteros")
    public Integer multiplicaEnteros(@RequestParam(value="valorA") Integer valorA, @RequestParam(value="valorB") Integer valorB) throws Exception{
        return calculadoraService.multiplicar(valorA, valorB);
    }
    
    @GetMapping(path = "/dividir-enteros")
    public Float divideEnteros(@RequestParam(value="valorA") Float valorA, @RequestParam(value="valorB") Float valorB) throws Exception{
       return calculadoraService.dividir(valorA, valorB);
    }
}
