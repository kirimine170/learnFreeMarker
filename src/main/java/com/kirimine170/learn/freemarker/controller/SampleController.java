package com.kirimine170.learn.freemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kirimine170.learn.freemarker.model.Message;
import com.kirimine170.learn.freemarker.service.MessageService;

@Controller
//@RequestMapping("/sample")　// NOTE クラス単位でも指定できるっぽい
public class SampleController
{
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public ModelAndView showSamplePage()
    {
        messageService.addMessage(new Message("hogehoge", "Hello, World!"));
        messageService.addMessage(new Message("piyopiyo", "foobar"));
        return new ModelAndView("sample", "messages", messageService.getMessages());
    }

    // @RequestMapping(value = "/sample", method = RequestMethod.GET)
    // public String sample()
    // {
    //     return "sample";
    // }

}
