package DAO;

import Entities.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public UserEntity createUser (UserEntity userEntity){
        entityManager.persist(userEntity);
        return userEntity;
    }
}
