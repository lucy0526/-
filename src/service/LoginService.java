package service;

import dao.LoginDao;
import entity.Emp;

public class LoginService {
	//��¼����
	public Emp login(String empName, String password) {
		LoginDao ld = new LoginDao();
		return ld.Login(empName, password);
	}
}
