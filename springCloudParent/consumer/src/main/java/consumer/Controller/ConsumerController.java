package consumer.Controller;

import consumer.feign.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    FeignInterface feignInterface;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return feignInterface.hello(name);
    }
}
