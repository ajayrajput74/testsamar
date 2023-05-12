package com.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oauth.model.User;

@Repository
public interface UserRepodsitory extends JpaRepository<User,Long>
{
	

}
