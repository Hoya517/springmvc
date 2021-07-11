package hello.springmvc.basic;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class HttpMessageConverterEx {

    /**
     * content-type: application/json
     * => StringHttpMessageConverter 사용!
     */
//    @RequestMapping
//    void hello(@RequestBody String data) { }

    /**
     * content-type: application/json
     * => MappingJackson2HttpMessageConverter 사용!
     */
//    @RequestMapping
//    void hello(@RequestBody HelloData data) { }

    /**
     * content-type: text/html
     * => error
     */
//    @RequestMapping
//    void hello(@RequetsBody HelloData data) {}
}
