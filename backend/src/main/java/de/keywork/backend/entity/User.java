package de.keywork.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    private String username;
    private String password;

    @OneToMany(targetEntity = FormData.class) // not sure if form data is supposed to be user details or contact information.
    private FormData[] formData;
}
