package com.doctorTreat.app.memberBoard.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.MemberBoardDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberBoardDAO {
    private SqlSession sqlSession;

    public MemberBoardDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }
    
    // 페이지네이션 적용된 리스트 가져오기
    public List<MemberBoardDTO> showList(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        
        Map<String, Object> params = new HashMap<>();
        params.put("pageSize", pageSize);
        params.put("offset", offset);
        
        return sqlSession.selectList("memberBoard.showlist", params);
    }
    
    // 총 게시물 수를 가져오는 메서드 추가
    public int getTotalCount() {
        return sqlSession.selectOne("memberBoard.getTotalCount");
    }
    
    
}
