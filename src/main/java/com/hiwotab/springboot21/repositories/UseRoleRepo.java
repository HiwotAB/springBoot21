package com.hiwotab.springboot21.repositories;

import com.hiwotab.springboot21.model.UseRole;
import org.springframework.data.repository.CrudRepository;

public interface UseRoleRepo extends CrudRepository<UseRole,Long> {
    UseRole findByUrole(String role);
}
