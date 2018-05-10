package com.pibigstar.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.pibigstar.system.domain.SystemUser;
import com.pibigstar.system.repository.SystemUserRepository;
import com.pibigstar.system.service.SystemUserService;

@Service
public class SystemUserServiceImpl implements SystemUserService{
	
	@Autowired
	private SystemUserRepository systemUserRepository;
	
	
	@Override
	public SystemUser login(SystemUser user) {
		SystemUser exitUser = systemUserRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		return exitUser;
	}


	@Override
	public List<SystemUser> listUser() {
		return systemUserRepository.findAll();
	}

}
