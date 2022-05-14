package com.example.testhamdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping(path = "/api")
public class ClubController {
    @Autowired
    ClubRespository clubRespository ;

    @GetMapping(path = "/clubs")
    public List<Club> getAll(){
        return clubRespository.findAll();
    }
}
