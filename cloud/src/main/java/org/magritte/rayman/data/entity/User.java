package org.magritte.rayman.data.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class User {

    private static final String GENERATOR = "user_seq_gen";
    private static final String SEQUENCE = "user_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR)
    @SequenceGenerator(sequenceName = SEQUENCE, name = GENERATOR)
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private Integer id;

    @ToString.Include
    private String dni;

    @ToString.Include
    private String name;

    @ToString.Include
    private String lastname;

    @ToString.Include
    private String password;

    @ToString.Include
    private String email;

    @ToString.Include
    private char userType;

    public User(String dni, String name, String lastname, String password, String email, char userType) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public User(String dni, String name, String lastname, String email, char userType) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.userType = userType;
    }
}



