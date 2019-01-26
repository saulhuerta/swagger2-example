
package com.shc.restful.swagger.services;

/**
 *
 * @author saul
 */
public interface CalculadoraServiceInterface {
    public Integer  sumar       (Integer a, Integer b);
    public Integer  restar      (Integer a, Integer b);
    public Integer  multiplicar (Integer a, Integer b);
    public Float    dividir     (Float   a, Float   b);
}
