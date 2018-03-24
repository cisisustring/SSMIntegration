package ssm.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("bloger")
public class BloggerController {
	@ResponseBody
	@RequestMapping("hello")
	String hello() {
		return "Hello World!";
	}
}
