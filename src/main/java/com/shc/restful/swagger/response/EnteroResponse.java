package com.shc.restful.swagger.response;

/**
 *
 * @author Saul Huerta - <saul.huerta@gmail.com>
 *
 */

public class EnteroResponse {

    private Integer resultado;

    public EnteroResponse(Integer resultado) {
        this.resultado = resultado;
    }
    
    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
    
}
