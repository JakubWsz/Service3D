package pl.teb.spring.api.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class UserRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
