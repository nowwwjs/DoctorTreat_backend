package com.doctorTreat.app.main.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.MainMedicalInfoDTO;

public class MainMedicalInfoDAO {
	public class MedicalInfoDAO {
		private SqlSessionFactory sqlSessionFactory;

		public MedicalInfoDAO(SqlSessionFactory sqlSessionFactory) {
			this.sqlSessionFactory = sqlSessionFactory;
		}

		public List<MainMedicalInfoDTO> getAllMedicalInfoTitles() {
			SqlSession session = sqlSessionFactory.openSession();
			try {
				return session.selectList("MedicalInfoMapper.getAllMedicalInfoTitles");
			} finally {
				session.close();
			}
		}
	}
}
