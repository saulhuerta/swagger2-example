package com.shc.restful.swagger.request;

/**
 *
 * @author Saul Huerta - <saul.huerta@gmail.com>
 *
 */

public class EnterosRequest {
    
    private Integer valorA;
    private Integer valorB;

    public EnterosRequest(Integer valorA, Integer valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }
    
    public Integer getValorA() {
        return valorA;
    }

    public void setValorA(Integer valorA) {
        this.valorA = valorA;
    }

    public Integer getValorB() {
        return valorB;
    }

    public void setValorB(Integer valorB) {
        this.valorB = valorB;
    }

}
