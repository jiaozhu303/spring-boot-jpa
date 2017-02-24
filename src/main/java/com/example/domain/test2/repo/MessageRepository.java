package com.example.domain.test2.repo;


import com.example.domain.test2.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {

    Message findByMsg(String name);


}
