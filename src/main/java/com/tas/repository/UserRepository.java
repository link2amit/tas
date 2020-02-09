/**
 * 
 */
package com.tas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tas.bean.User;

/**
 * @author asrivastava
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
