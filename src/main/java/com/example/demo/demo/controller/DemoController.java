package com.example.demo.demo.controller;

import com.example.demo.demo.model.Demo;
import com.example.demo.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @PostMapping("/create")
    public Demo create(@RequestBody Demo demo){
        return demoRepository.save(demo);
    }

    @GetMapping("/all")
    public List<Demo> getAllAuthors() {
        return demoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Demo> findOneById(@PathVariable String id) {
        return demoRepository.findById(id);
    }

    @PutMapping("/update")
    public Demo update(@RequestBody Demo demo){
        return demoRepository.save(demo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id){
        demoRepository.deleteById(id);
    }
}
