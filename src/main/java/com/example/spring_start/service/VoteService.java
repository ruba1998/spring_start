package com.example.spring_start.service;

import com.example.spring_start.domain.Comment;
import com.example.spring_start.domain.Vote;
import com.example.spring_start.repository.VoteRepository;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public Vote save(Vote vote){
        return voteRepository.save(vote);
    }

}
