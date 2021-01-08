package com.wcs.checkpoint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wcs.checkpoint3.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
