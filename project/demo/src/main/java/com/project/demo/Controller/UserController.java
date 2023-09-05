package com.project.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.demo.Model.User;
import com.project.demo.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
    @Autowired
     UserService userservice;
    @GetMapping("showuser")
    public List<User> getBookByUser() {
        return userservice.show();
    }

    @PostMapping("adduser")
    public User createUser(@RequestBody User use) {
        return userservice.addinfo(use);
    }                                                                                                                     @GetMapping("userSort/{field}")
	public List<User> sort(@PathVariable String field)
	{
		return userservice.sort(field);
	}
	
	@GetMapping("userPage/{pno}/{psize}")
	public List<User> sort(@PathVariable int pno, @PathVariable int psize)
	{
		return userservice.page(pno, psize);
	}
	
	@GetMapping("userPageAndSort/{pno}/{psize}/{field}")
	public List<User> pageAndSort(@PathVariable int pno, @PathVariable int psize , @PathVariable String field)
	{
		return userservice.pageAndSort(pno, psize, field);
	}
     @PostMapping("add1")
	public User saveUser(@RequestBody User user) {
	return userservice.saveUser(user);
	}
     @GetMapping("getlogin/{emailid}/{password}")
     public boolean login(@PathVariable String emailid,@PathVariable String password){
     	return userservice.getsignups(emailid, password);	
     }
	@GetMapping("show1")
	  public List<User> gethotelbyUsers() {
	      return userservice.show();
	   }

}

