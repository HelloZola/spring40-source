package example.aspect;

import org.springframework.stereotype.Service;

@Service
public class CustServiceImpl implements ICustService {

    @Override
    public void saySomething() {
        System.out.println("Hello,I am your Customer Manager. Glad service for u");
    }
}
