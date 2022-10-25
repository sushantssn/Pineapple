package com.pineapple.service;

import com.pineapple.pojo.Scheme;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SchemeService {

    List<Scheme> getAllSchemes();

    void addScheme(Scheme scheme);
}
