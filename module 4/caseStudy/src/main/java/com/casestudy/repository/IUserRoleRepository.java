package com.casestudy.repository;

import com.casestudy.entity.User_role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUserRoleRepository extends JpaRepository<User_role, Long> {
    @Query("select ar.role_id.role_name from User_role ar where ar.username.username = :username")
    List<String> findAllRoleByUser(String username);
}
