package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/we")
	public String hello() {
		return "redirect:Hello";
	}
	
	@RequestMapping("/Hello")
	public String teString() {
		return "Hello";
	}
	
	@RequestMapping("/test")
	public String teString1() {
		return "test";
	}
	
	
	@RequestMapping("/test1")
	public String teString2() {
		return "redirect:/test1.html";
	}
	
	@RequestMapping("/testforward")
	public String teString3() {
		return "forward:test1";
	}
	@RequestMapping("/hehe")
	public String teString4() {
		return "hehe1";
	}
}