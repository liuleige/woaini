package com.jk.controller.LoginRecord;

import com.jk.entity.LoginRecord.LoginRecord;
import com.jk.service.user.LoginRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LoginRecordController {

    @Resource
    private LoginRecordService loginRecordService;

    @RequestMapping("/loginrecord")
    public String loginrecord(Model model) {
        List<LoginRecord> loginRecords = (List<LoginRecord>) loginRecordService.findAll();
        System.out.println(loginRecords);
        model.addAttribute("loginRecords",loginRecords);
        return "LoginRecord/loginrecord";
    }
}
