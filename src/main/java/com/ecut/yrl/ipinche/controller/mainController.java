package com.ecut.yrl.ipinche.controller;

import com.ecut.yrl.ipinche.dataobject.User;
import com.ecut.yrl.ipinche.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/main")
public class mainController {
    private  final Logger logger = LoggerFactory.getLogger(mainController.class);

    @Autowired
    UserRepository userRepository;
    @GetMapping("/list")
    public String list(){
        User user = userRepository.findOneById("1");
        String name = user.getName();
        String openid = user.getOpenid();
        logger.info("test log");
        return name+openid;
    }
}
