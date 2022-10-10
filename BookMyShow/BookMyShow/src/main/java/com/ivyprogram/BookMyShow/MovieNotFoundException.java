package com.ivyprogram.BookMyShow;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//this will throw exception when record not found
@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class MovieNotFoundException extends RuntimeException {
private static final long serialVersionUID=1L;
public MovieNotFoundException(String msg){
    super(msg);
}
}
