/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.repository;

import com.movie.app.models.Role;
import com.movie.app.models.RoleList;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dineshkumar.r
 */
@Repository
public interface RoleRepository extends CrudRepository<Role,Integer> {
    List<Role> findByName(RoleList name);
}
