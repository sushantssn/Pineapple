package com.pineapple.service;

import com.pineapple.pojo.Scheme;
import com.pineapple.repositories.SchemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchemeServiceImp implements SchemeService{

    @Autowired
    SchemeRepository schemeRepository;

    @Override
    public List<Scheme> getAllSchemes() {
        return schemeRepository.findAll();
    }

    @Override
    public void addScheme(Scheme scheme) {
         schemeRepository.save(scheme);
    }
}
