package org.magritte.rayman.data.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@SuppressWarnings({"unused", "FieldMayBeFinal", "FieldCanBeLocal"})
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Entity
public class User {

    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    @GeneratedValue
    private Integer id;

    private String dni;
    private String name;
    private String lastname;
    private String password;
    private String email;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Exercise> exercise;

    public User(String dni, String name, String lastname, String password, String email) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
    }
}



