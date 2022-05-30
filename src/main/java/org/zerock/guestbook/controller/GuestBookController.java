package org.zerock.guestbook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/guestbook")
public class GuestBookController {

    @GetMapping({"/","/list"})
    public String list() {
        log.info("list..");

        return "/guestbook/list";
    }
}
