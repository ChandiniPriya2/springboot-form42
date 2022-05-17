package com.jobiak.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mongo.repository.RepositoryMongo;
import com.jobiak.mongo.user.UserData;


@Controller

public class MongoController {
	@Autowired
	RepositoryMongo repo;
@RequestMapping(path="/test" ,method=RequestMethod.GET)
public String redirect() {
	return "insertion";
}
@RequestMapping(path="/insertion",method=RequestMethod.POST)
public String doSignUp(@ModelAttribute("user")UserData user) {
	
	repo.save(user);
	return "completed";
}
}
