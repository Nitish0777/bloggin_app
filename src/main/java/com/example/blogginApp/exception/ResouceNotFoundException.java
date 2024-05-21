package com.example.blogginApp.exception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResouceNotFoundException extends RuntimeException{
    String resourceName;
    String fieldName;
    long fieldVale;

    public  ResouceNotFoundException(String resourceName, String fieldName, long fieldVale){
        super(String.format("%s not found with this name %s: %l",resourceName,fieldName,fieldVale));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldVale = fieldVale;
    }
}
