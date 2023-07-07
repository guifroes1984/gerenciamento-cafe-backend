package br.com.guifroes1984.JWT;

import br.com.guifroes1984.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Slf4j
@Service
public class CustomerUsersDetailsService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    private br.com.guifroes1984.POJO.User userDetails;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Dentro de loadUserByUsername {}", username);
        userDetails = userDao.findByEmailId(username);
        if(!Objects.isNull(userDetails))
            return new User(userDetails.getEmail(), userDetails.getPassword(), new ArrayList<>());
        else
            throw  new UsernameNotFoundException("Usuário não encontrado.");
    }

    public br.com.guifroes1984.POJO.User getUserDetails() {
        return userDetails;
    }

}
