package pl.teb.spring.infrastructure.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "app_user")
@NoArgsConstructor
@Getter
public class User {
    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "user_id_sequence"
    )
    @Column(name = "userId")
    private Long id;
    @Column(name = "userUuid")
    private String uuid;
    @Column(name = "userFirstane")
    private String firstname;
    @Column(name = "userLastname")
    private String lastname;
    @Column(name = "userEmail")
    private String email;
    @Column(name = "userPassword")
    private String password;

    public User(String uuid, String firstname, String lastname, String email, String password) {
        this.uuid = uuid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }
}
