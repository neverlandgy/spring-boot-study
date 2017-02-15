package org.hebephrenic.portal;

import javax.annotation.Resource;

import org.hebephrenic.common.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Resource
	Hello hello;

	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return hello.getHello();
	}

}
