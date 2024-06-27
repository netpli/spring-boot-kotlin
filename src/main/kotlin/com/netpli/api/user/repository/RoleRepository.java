package com.netpli.api.user.repository;

import com.netpli.api.user.model.Role;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RoleRepository extends ReactiveMongoRepository<Role, String> {}