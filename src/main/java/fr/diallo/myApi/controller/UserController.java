package fr.diallo.myApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.diallo.myApi.model.User;
import fr.diallo.myApi.service.UserService;

@RestController
public class UserController {

    private UserService userService; 

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
        User user = userService.getUsers(id);
        return user;
    }
    /*À l'intérieur de cette méthode, appelez la méthode « createUser » du « userService », avec les
    paramètres de « body » que vous récupérez avec les « getters ». Les paramètres devront être
    les variables « name » et « age ». Vous récupérerez un objet de type « User » que vous retournerez */
    @PostMapping("/user")
    public  User createUser(@Requestbody UserRequest body){
        String name = body.getName();
        int age = body.getAge();
        User user = userService.createUser(name,age);
        return user;
    }
    @PutMapping("/user")
    public User updateUser(@RequestParam Integer id , @Requestbody UserRequest body ){
        User user = UserService.updateUser(id,body.getName(),body.getAge());
            return user ; 

    }



    
}




