package tst.project.dao;

import java.util.List;


import tst.project.bean.StudentBean;
import tst.project.page.PageBean;

public interface StudentDao {

	public List<StudentBean> getStudents(StudentBean studentBean,PageBean pageBean);

	public StudentBean getStudentDetail(StudentBean studentBean);

}
