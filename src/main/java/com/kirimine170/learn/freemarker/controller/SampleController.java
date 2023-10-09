package com.kirimine170.learn.freemarker.controller;

import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController
{
    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String sample()
    {
        return "sample";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model)
    {
        model.addAttribute("name", name);
        return "greeting";
    }

}
