package com.redis.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redis.demo.model.UserSession;

@Repository
public interface UserSessionRepository extends CrudRepository<UserSession, String> {
}
