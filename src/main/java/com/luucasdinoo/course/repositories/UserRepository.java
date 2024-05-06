package com.luucasdinoo.course.repositories;

import com.luucasdinoo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
