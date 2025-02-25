package loginMahe.logindemo.controller;


import loginMahe.logindemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AuthController {

    @Autowired
    LoginService loginService;


    @GetMapping
    public String loginMethod(){
         
         return loginService.loginMethod();
    }
}
