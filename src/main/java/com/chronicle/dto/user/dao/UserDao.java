package com.chronicle.dto.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chronicle.dto.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

  //public User findByEmail(String emailid);

} 

