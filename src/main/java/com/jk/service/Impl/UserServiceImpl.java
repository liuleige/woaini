package com.jk.service.Impl;

import com.jk.dao.User.UserDao;
import com.jk.entity.User.User;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public Map<String, Object> userLogin(User user)  {
        Map<String, Object> map = new HashMap<>();
        String str = "用户不存在";
        List<User> lup = userDao.findAllByUserName(user.getUserName());
        if (lup != null && lup.size() > 0) {
            str = "密码错误";
            User userLogin = lup.get(0);
            if (userLogin.getPassword().equals(user.getPassword())) {
                str = "登录成功";
                map.put("userLogin", userLogin);
            }

        }
        map.put("str", str);
        return map;
    }

}
