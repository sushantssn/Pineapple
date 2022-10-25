package com.pineapple.controller;

import com.pineapple.pojo.Scheme;
import com.pineapple.service.SchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchemesController {

    @Autowired
    SchemeService schemeService;

    @GetMapping("/getallschemes")
    public List<Scheme> getAllSchemes(){
        return schemeService.getAllSchemes();
    }


    @PostMapping("/allscheme")
    public ResponseEntity<?> getAllSchemes(@RequestBody Scheme scheme){

        schemeService.addScheme(scheme);

        return ResponseEntity.ok(scheme);

    }
}
