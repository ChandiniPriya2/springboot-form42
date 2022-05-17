package com.jobiak.mongo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.jobiak.mongo.user.UserData;
@Repository


public interface RepositoryMongo extends JpaRepository<UserData,Long> {

}
