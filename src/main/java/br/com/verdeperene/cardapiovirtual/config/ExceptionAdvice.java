package br.com.verdeperene.cardapiovirtual.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

@ControllerAdvice
public class ExceptionAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = RuntimeException.class)
    public @ResponseBody
    Map<String, Object> bizErrorHandler(RuntimeException e) {
        return Map.of(
                "message", e.getMessage(),
                "type", e.getClass().getSimpleName()
        );
    }
}
