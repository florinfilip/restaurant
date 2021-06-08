package com.florin.restaurant.service.Impl;

import com.florin.restaurant.repository.RoleRepository;
import com.florin.restaurant.role.Role;
import com.florin.restaurant.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public List<Role> findAll(){
        return roleRepository.findAll();
    }

}
