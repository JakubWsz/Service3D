package pl.teb.spring.api.controller;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.teb.spring.api.dto.request.UserRequest;
import pl.teb.spring.api.dto.response.UserResponse;
import pl.teb.spring.api.exeption.AppExceptionHandler;
import pl.teb.spring.domain.service.UserService;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final ConversionService conversionService;

    @PostMapping
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200"),
                    @ApiResponse(responseCode = "400", content = @Content(schema = @Schema(implementation =
                            AppExceptionHandler.Error.class))),
                    @ApiResponse(responseCode = "500", content = @Content(schema = @Schema(implementation =
                            AppExceptionHandler.Error.class)))
            })
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(conversionService.convert(userService.createUser(
                userRequest.getFirstname(), userRequest.getLastname(), userRequest.getEmail(),
                userRequest.getPassword()),UserResponse.class));
    }
}
