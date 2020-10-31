package com.iftm.course.repositories;

import org.springframework.stereotype.Repository;

import com.iftm.course.entities.user;

@Repository
public class userRepository extends JpaRepository<user, Long> {

}
