package com.ruicai.education.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 考勤管理
 * Created by XuMing on 2017/3/31.
 */
@Controller
public class AttendanceAction {

    @RequestMapping("/attendance")
    public String index() {
        return "attendanceEdit";
    }
}
