package jjfactory.learnmanage.business.service;

import jjfactory.learnmanage.business.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserService {
    private final UserRepository userRepository;

    public String create(){
        return "Y";
    }

    public String delete(){
        return "Y";
    }

    public String update(){
        return "Y";
    }
}
