package level3.reports.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import level3.reports.core.entities.User;
import level3.reports.core.utilities.DataResult;
import level3.reports.business.abstracts.UserService;

@RestController
@RequestMapping("/api/userControl")
@CrossOrigin
public class UserController {
	
private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@GetMapping("/getUser")
	public DataResult<User>getUser(@RequestParam String name)
	{
	return this.userService.getUser(name);
	}
	
	@GetMapping("/isUser")
	public DataResult<Boolean>isUser(@RequestParam String name,@RequestParam String password)
	{
	return this.userService.isUser(name, password);
	}

}
