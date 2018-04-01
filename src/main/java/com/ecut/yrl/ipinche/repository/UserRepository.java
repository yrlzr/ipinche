package com.ecut.yrl.ipinche.repository;

import com.ecut.yrl.ipinche.dataobject.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findOneById(String id);
    User findOneByOpenid(String openid);
}


