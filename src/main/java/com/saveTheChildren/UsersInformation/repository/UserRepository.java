package com.saveTheChildren.UsersInformation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saveTheChildren.UsersInformation.models.User;

/**
 * this is a repository interface for user
 * 
 * @author Dhavalkumar Dadhania
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
