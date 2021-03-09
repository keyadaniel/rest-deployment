package com.tts.deployment.controller;

import com.tts.deployment.model.Television;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/television")
@RestController
public class TelevisionController {

    @GetMapping("/get")
    public Television getTelevision(){
        return new Television(1L, "1080p", "30", "XR35", "Sony");
    }

    @GetMapping("/get4k")
    public Television getOtherTelevision(){
        return new Television(1L, "4K", "50", "e500", "Samsung");
    }

}
