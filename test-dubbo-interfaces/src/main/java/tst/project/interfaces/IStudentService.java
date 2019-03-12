package tst.project.interfaces;

import tst.project.bean.StudentBean;
import tst.project.page.PageBean;

public interface IStudentService {

	public Object getStudents(StudentBean studentBean, PageBean pageBean);

	public StudentBean getStudentDetail(StudentBean studentBean);

}
