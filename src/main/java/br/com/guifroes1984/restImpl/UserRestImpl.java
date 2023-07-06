package br.com.guifroes1984.restImpl;

import br.com.guifroes1984.constents.CafeConstants;
import br.com.guifroes1984.rest.UserRest;
import br.com.guifroes1984.service.UserService;
import br.com.guifroes1984.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try{
            return userService.signUp(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return CafeUtils.getResponseEntity(CafeConstants.ALGO_DEU_ERRADO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
