package consumer;

import consumer.feign.FeignInterface;
import org.springframework.stereotype.Component;

@Component
public class FeignInterfaceHystrix implements FeignInterface {
    public String hello(String name) {
        return "hello" +name+", this message send failed ";
    }
}
