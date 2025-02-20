package loginMahe.logindemo.controller;


import loginMahe.logindemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    LoginService loginService;


    @GetMapping("login")
    public String loginMethod(){
         
         return loginService.loginMethod();
    }
}
