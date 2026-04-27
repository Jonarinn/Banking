package lib.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;

@Entity
public class UserModel extends BaseModel {
    @Column(unique = true)
    private String Id;
    private String firstName;
    private String lastName;
}
