package com.example.spring_start.controller;

import com.example.spring_start.domain.Link;
import com.example.spring_start.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
    @RequestMapping("/Links/")
    public class LinkController {

        private LinkRepository linkRepository;

        public LinkController(LinkRepository linkRepository) {
            this.linkRepository = linkRepository;
        }

        // list
        @GetMapping("/")
        public List<Link> list() {
            return linkRepository.findAll();
        }

        // CRUD
        @PostMapping("/create")
        public Link create(@ModelAttribute Link link) {
            return linkRepository.save(link);
        }

        @GetMapping("/{id}")
        public Optional<Link> read(@PathVariable Long id) {
            return linkRepository.findById(id);
        }

        @PutMapping("/{id}")
        public Link update(@PathVariable Long id, @ModelAttribute Link link) {
            return linkRepository.save(link);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
            linkRepository.deleteById(id);
        }

}
