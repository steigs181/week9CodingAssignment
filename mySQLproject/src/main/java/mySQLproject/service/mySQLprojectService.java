package mySQLproject.service;

import mySQLproject.dao.mySQLprojectDao;
import mySQLproject.entity.Project;


public class mySQLprojectService {
 private mySQLprojectDao mysqlprojectDao = new mySQLprojectDao();
 
public Project addProject(Project project) {
	return mysqlprojectDao.insertProject(project);
}
}