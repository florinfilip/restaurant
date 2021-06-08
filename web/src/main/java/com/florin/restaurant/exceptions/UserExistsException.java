package com.florin.restaurant.exceptions;

public class UserExistsException extends RuntimeException{

    public UserExistsException(String message){super(message);}
}
