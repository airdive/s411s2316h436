package controller;

import java.util.Date;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public class TestAction extends BaseAction {
	@Override
	public String execute() throws Exception {
		this.getAllService().getUserinfoService().insertUserinfo("a", "aa",23L,new Date());
		this.getAllService().getUserinfoService().insertUserinfo("a", "aa",25L,new Date());
		return null;
	}
}
