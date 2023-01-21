package pl.teb.spring.domain.exeption;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum AppExceptionCode {
    INVALID_EMAIL("Invalid email.", 400);

    private final String message;
    private final int status;

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public DomainException createException() {
        return new DomainException(this);
    }
}

