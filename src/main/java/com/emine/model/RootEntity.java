package com.emine.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RootEntity <T> {

    private boolean result;

    private String errorMessage;

    private T data;

    public static  <T>RootEntity<T> ok(T data){
       RootEntity<T> rootEntity = new RootEntity<T>();
       rootEntity.setData(data);
       rootEntity.setResult(true);
       rootEntity.setErrorMessage(null);
       return rootEntity;
    }
    public static  <T>RootEntity<T> error(String errorMessage){
        RootEntity<T> rootEntity = new RootEntity<T>();
        rootEntity.setData(null);
        rootEntity.setErrorMessage(errorMessage);
        rootEntity.setResult(false);
        return rootEntity;
    }

}
