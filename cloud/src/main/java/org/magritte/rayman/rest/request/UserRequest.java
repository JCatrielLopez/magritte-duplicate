package org.magritte.rayman.rest.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class UserRequest {

    private String dni;

    private String name;

    private String lastname;

    private String password;

    private String email;

//    private char type;
}
