package com.pineapple.service;

import com.pineapple.entity.Scheme;
import com.pineapple.dto.SchemeDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SchemeService {

    List<Scheme> getAllSchemes();

    void addScheme(SchemeDTO scheme);
}
