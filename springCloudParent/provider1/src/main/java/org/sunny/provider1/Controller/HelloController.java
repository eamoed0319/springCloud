package org.sunny.provider1.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.bouncycastle.util.Objects;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "emptyNameError")
    public String index(@RequestParam String name) {
        if (null == name || name.length() == 0){
          throw new RuntimeException("name is blank");
        }
        return "hello "+name+"，this is provider1 message";
    }

    private String emptyNameError(@RequestParam String name){
        return "name is blank";
    }
}
