package biz;

import org.springframework.stereotype.Component;

@Component
public class TmpService {

    public String tmpMethod(String method) {
        return "tmpMethod " + method;
    }

}
