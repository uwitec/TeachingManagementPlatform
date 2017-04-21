package com.ruicai.evaluation.controller;

import com.alibaba.fastjson.JSON;
import com.ruicai.evaluation.service.impl.MessageReviewServiceImpl;
import com.ruicai.evaluation.vo.EvaluationMessageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 留言审核控制器
 *
 * Created by lws on 2017/4/17.
 */
@SuppressWarnings("SameReturnValue")
@Controller
public class MessageReviewController {

    private final MessageReviewServiceImpl service;

    @Autowired
    public MessageReviewController(MessageReviewServiceImpl service) {
        this.service = service;
    }

    @RequestMapping(value = "MessageReview", method = RequestMethod.GET)
    public String MessageReview() {
        return "message";
    }

    @ResponseBody
    @RequestMapping(value = "MessageStatuses", method = RequestMethod.POST)
    public String MessageStatuses() {
        return JSON.toJSONString(service.getMessageStatuses());
    }

    @ResponseBody
    @RequestMapping(value = "GetMessages", method = RequestMethod.POST)
    public String GetMessages(int page, int rows, String searchParams) {
        return JSON.toJSONStringWithDateFormat(service.getMessages(page, rows, JSON.parseObject(searchParams, EvaluationMessageView.class)), "yyyy-MM-dd HH:mm:ss");
    }
}
