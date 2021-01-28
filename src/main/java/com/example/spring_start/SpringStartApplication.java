package com.example.spring_start;


import com.example.spring_start.domain.Comment;
import com.example.spring_start.domain.Link;
import com.example.spring_start.repository.CommentRepository;
import com.example.spring_start.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringStartApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringStartApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringStartApplication.class, args);
    }


  //  @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
        return args -> {
            Link link = new Link("Getting Started with Spring Boot 2","https://therealdanvega.com/spring-boot-2");
            linkRepository.save(link);

            Comment comment = new Comment("This Spring Boot 2 Link is awesome",link);
            commentRepository.save(comment);
            link.addComment(comment);

            System.out.println("We just inserted a link and comment");
            System.out.println("================================================");

        };
    }




}
