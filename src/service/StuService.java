package service;

import java.util.List;

import dao.StuDao;
import entity.Student;


public class StuService {
	private StuDao sd=new StuDao();
	public List<Student> FindStu() {
		List<Student> s=sd.FindStu();
		if(s!=null) {
			return s;
		}else {
			return null;
		}
	}

}
