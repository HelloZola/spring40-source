package example.aspect;

import org.springframework.stereotype.Service;
import utils.PrintContolUtils;

@Service
public class CustServiceImpl implements ICustService {

    @Override
    public void saySomething() {
        PrintContolUtils.print(PrintContolUtils.Bean, "Hello,I am your Customer Manager. Glad service for u");
    }
}
