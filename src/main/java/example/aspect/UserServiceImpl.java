package example.aspect;

import bean.ArgBean;
import bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.PrintContolUtils;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private ICustService custService;

    private String property;

    @Override
    public void addUser() {
        custService.saySomething();
        PrintContolUtils.print(PrintContolUtils.Aop, "hello UserServiceImpl!!!");
    }

    @Override
    public Person getResult(ArgBean argBean) {
        custService.saySomething();
        PrintContolUtils.print(PrintContolUtils.Aop, "hello UserServiceImpl!!!");
        return new Person("chen", 100);
    }

}
