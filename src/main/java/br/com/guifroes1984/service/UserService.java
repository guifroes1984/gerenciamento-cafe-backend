package br.com.guifroes1984.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService {

    ResponseEntity<String> signUp(Map<String, String> requestMap);
}
