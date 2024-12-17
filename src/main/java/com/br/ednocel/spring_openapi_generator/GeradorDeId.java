package com.br.ednocel.spring_openapi_generator;

public class GeradorDeId {

    private static Integer id = 1;

    public static Integer getNextCode() {
        return id++;
    }
}