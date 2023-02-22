package org.navvy.springtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @RequestMapping(value = "test1")
    public String test1() {
        log.info("test1");
        return "1";

    }
}
