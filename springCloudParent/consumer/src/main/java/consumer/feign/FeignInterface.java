package consumer.feign;

import consumer.FeignInterfaceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer", fallback = FeignInterfaceHystrix.class)
public interface FeignInterface {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
