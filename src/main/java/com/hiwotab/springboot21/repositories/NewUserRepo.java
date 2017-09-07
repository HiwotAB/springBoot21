package com.hiwotab.springboot21.repositories;

import com.hiwotab.springboot21.model.NewUsers;
import org.springframework.data.repository.CrudRepository;

public interface NewUserRepo extends CrudRepository<NewUserRepo,Long> {
    NewUsers findByUsername(String username);
    NewUsers findByEmail(String email);
    Long countByEmail(String email);
    Long countByUsername(String username);
}
