package com.pineapple.service;

import com.pineapple.entity.Scheme;
import com.pineapple.dto.SchemeDTO;
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
    public void addScheme(SchemeDTO schemeDTO) {
        Scheme scheme = mapSchemeDtoToScheme(schemeDTO);
        schemeRepository.save(scheme);
    }

    private Scheme mapSchemeDtoToScheme(SchemeDTO schemeDTO) {
        Scheme scheme = new Scheme();
        scheme.setSchemeName(schemeDTO.getSchemeName());
        scheme.setSchemeDesc(schemeDTO.getSchemeDesc());
        scheme.setNoOfDays(schemeDTO.getNoOfDays());
        scheme.setRateOfIntrest(schemeDTO.getRateOfIntrest());
        scheme.setSchemeJSON(schemeDTO.getSchemeDescJson().toString());
        return scheme;
    }
}
