package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());  // LogTestController.class

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        // 로그 어떤 상태의 레벨
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);  // 디버그할때 (개발서버에서)
        log.info(" info log={}", name);   // 중요한 비즈니스 정보 (운영서버)
        log.warn(" warn log={}", name);   // 경고
        log.error("error log={}", name);  // 에러 (알람, 파일 등등 활용해서 확인)

        return "ok";
    }
}
