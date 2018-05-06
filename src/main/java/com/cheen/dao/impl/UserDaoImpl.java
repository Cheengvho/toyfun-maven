package com.cheen.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cheen.utils.DbUtils;

public class UserDaoImpl {
	private SqlSessionFactory sqlSessionFactory;
	public UserDaoImpl(){
		this.sqlSessionFactory = DbUtils.getSession();
	}
	public List<Kuser> getAll(){
		SqlSession session = sqlSessionFactory.openSession();
		List<Kuser> lk = session.selectList("selectAllUser");
// 该 “selectAllUser”与配置文件中的一个id相匹配。
		session.commit();
		session.close();
		return lk;
	}

}
