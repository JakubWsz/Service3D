package pl.teb.spring.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserResponse {

    private String uuid;
    private String firstname;
    private String lastname;
    @Email(message = "Email is not valid.", regexp = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b")
    private String email;
    private String password;

}
