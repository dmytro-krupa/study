package practice.flat_company.exceptions;

import java.util.List;

public class FlatConstructorException extends RuntimeException{
    public FlatConstructorException(final List<String> messages) {
        super(messages.toString());
    }
}
