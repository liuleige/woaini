package com.jk.dao.User;


import com.jk.entity.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long>{

    List<User> findAllByUserName(String userName);

}
