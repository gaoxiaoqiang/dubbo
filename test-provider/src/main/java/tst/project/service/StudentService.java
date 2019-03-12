package tst.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import tst.project.bean.StudentBean;
import tst.project.dao.StudentDao;
import tst.project.interfaces.IStudentService;
import tst.project.page.PageBean;

@Service
@Transactional(rollbackFor=Exception.class)
public class StudentService implements IStudentService {
	@Autowired
	StudentDao studentDao;
	public List<StudentBean> getStudents(StudentBean studentBean,PageBean pageBean) {
		
		return studentDao.getStudents(studentBean,pageBean);
	}
	public StudentBean getStudentDetail(StudentBean studentBean) {
		// TODO Auto-generated method stub
		System.out.println(new Gson().toJson(studentBean));
		return studentDao.getStudentDetail(studentBean);
	}

}
