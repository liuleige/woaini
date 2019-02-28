package com.jk.service.user;



import com.jk.entity.User.User;

import java.util.Map;

public interface UserService {

    public Map<String, Object> userLogin(User user);
}
