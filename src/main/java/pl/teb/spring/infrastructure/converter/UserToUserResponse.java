package pl.teb.spring.infrastructure.converter;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import pl.teb.spring.api.dto.response.UserResponse;
import pl.teb.spring.infrastructure.entity.User;

public class UserToUserResponse implements Converter<User, UserResponse> {

    @Override
    public UserResponse convert(User car) {
        return new UserResponse(
                car.getUuid(),
                car.getFirstname(),
                car.getLastname(),
                car.getEmail(),
                car.getPassword());
    }
}
