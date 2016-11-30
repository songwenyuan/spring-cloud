package cn.yifan.cloud.controller;

import cn.yifan.cloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;


@RestController
@RequestMapping(value="/test")
@Validated
public class TestController {

    @Autowired
    private TestService testService;

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(){
        return testService.getList();
	}
	
}
