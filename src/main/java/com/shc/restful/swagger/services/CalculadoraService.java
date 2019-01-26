package com.shc.restful.swagger.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author Saul Huerta - <saul.huerta@gmail.com>
 *
 */

@Service
public class CalculadoraService implements CalculadoraServiceInterface{

    @Override
    public Integer sumar(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer restar(Integer a, Integer b) {
        return a-b;
    }

    @Override
    public Integer multiplicar(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public Float dividir(Float a, Float b) {
        return a/b;
    }
    
}
