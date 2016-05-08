package service;

import java.util.Date;
import java.util.List;

import orm.AllDao;
import orm.Userinfo;

public class UserinfoService {

	private AllDao allDao;

	public AllDao getAllDao() {
		return allDao;
	}

	public void setAllDao(AllDao allDao) {
		this.allDao = allDao;
	}

	public List<Userinfo> getAllUserinfoList() {
		return allDao.getUserinfDao().getAllUserinfo();
	}

	public void insertUserinfo(String username, String password,Long age,Date insertdate) {
		Userinfo userinfo = new Userinfo();
		userinfo.setUsername(username);
		userinfo.setPassword(password);
		userinfo.setAge(age);
		userinfo.setInsertdate(insertdate);
		allDao.getUserinfDao().save(userinfo);
	}

}
