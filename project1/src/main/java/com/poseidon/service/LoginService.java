package com.poseidon.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poseidon.dao.LoginDAO;
import com.poseidon.dto.JoinDTO;
import com.poseidon.dto.LoginDTO;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO loginDAO;

	public LoginDTO login(LoginDTO dto) {
		return loginDAO.login(dto);	
		}

	public int join(JoinDTO joinDTO) {
		return loginDAO.join(joinDTO);
	}

	public List<JoinDTO> members() {
		return loginDAO.members();
	}

	public int checkID(String id) {
		return loginDAO.checkID(id);
	}

	public List<Map<String, Object>> boardList2() {
		return loginDAO.boardList2();
	}

}

