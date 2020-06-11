package org.magritte.rayman.data.repository;

import org.jetbrains.annotations.NotNull;
import org.magritte.rayman.data.entity.User;
import org.magritte.rayman.rest.response.UserResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @NotNull
    Optional<User> findById(@NotNull Integer id);

    Optional<User> findByDni(String dni);

    List<UserResponse> findByUserType(char user_type);

}

