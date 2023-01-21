package pl.teb.spring.domain.exeption;

public class DomainException extends RuntimeException {
    private final AppExceptionCode code;

    public DomainException(AppExceptionCode code, Object... arguments) {
        super(String.format(code.getMessage(), arguments));
        this.code = code;
    }

    public AppExceptionCode getCode() {
        return code;
    }
}
