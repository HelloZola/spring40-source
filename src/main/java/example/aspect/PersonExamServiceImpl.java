package example.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonExamServiceImpl implements IPersonExamService {

    @Autowired
    private ICustService custService;

    @Override
    public void addUser() {
        custService.saySomething();
        System.out.println("Thanks. Nice to Meet U!");
    }

}
