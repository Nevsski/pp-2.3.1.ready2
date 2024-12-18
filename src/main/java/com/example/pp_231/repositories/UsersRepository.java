package com.example.pp_231.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pp_231.models.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
