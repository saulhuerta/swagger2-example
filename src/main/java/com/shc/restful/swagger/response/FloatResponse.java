package com.shc.restful.swagger.response;

/**
 *
 * @author Saul Huerta - <saul.huerta@gmail.com>
 *
 */

public class FloatResponse {

    private Float   resultado;

    public FloatResponse(Float resultado) {
        this.resultado = resultado;
    }
    
    public Float getResultado() {
        return resultado;
    }

    public void setResultado(Float resultado) {
        this.resultado = resultado;
    }
    
}
