package org.zero2hero.applicationservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;


public class NameFormatException extends RuntimeException {
    public NameFormatException(String message) {
        super(message);
    }
}
