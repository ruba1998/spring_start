package com.example.spring_start;


import com.example.spring_start.domain.Comment;
import com.example.spring_start.domain.Link;
import com.example.spring_start.repository.CommentRepository;
import com.example.spring_start.repository.LinkRepository;
import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringStartApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringStartApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringStartApplication.class, args);
    }

    @Bean
    PrettyTime prettyTime() {
        return new PrettyTime();
    }

}
