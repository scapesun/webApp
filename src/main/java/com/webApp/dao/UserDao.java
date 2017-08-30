package com.webApp.dao;

import com.webApp.entity.User;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * Created by Administrator on 2017/8/28.
 */
@RepositoryDefinition(domainClass = User.class, idClass = Integer.class)
public interface UserDao {

    public User getByNameAndPassword(String name, String password);
}
