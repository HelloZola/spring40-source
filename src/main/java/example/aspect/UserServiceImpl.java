package example.aspect;

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
        PrintContolUtils.print(PrintContolUtils.Aop, "hello UserServiceImpl!!!");
    }

}
