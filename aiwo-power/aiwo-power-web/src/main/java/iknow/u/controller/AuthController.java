package iknow.u.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
@Slf4j
public class AuthController {


    @RequestMapping("test")
    public void test(){
        log.info("路由通过");
    }

}
