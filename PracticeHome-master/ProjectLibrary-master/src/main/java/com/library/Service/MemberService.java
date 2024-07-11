package com.library.Service;

import com.library.Mapper.MemberMapper;
import com.library.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.library.common.MemberTemplate.getSqlSession;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.memberList;

public class MemberService {
    private MemberMapper mapper;

    public List<MemberDTO> memberTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = mapper.memberTest();

        sqlSession.close();

        return memberList;

    }

    public boolean insertMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        int result = mapper.memberInsert(member);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean updateMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MemberMapper.class);

        int result = mapper.memberUpdate(member);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteMember(String parameter){

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        int result = mapper.memberDelete(parameter);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean searchMember(String membername) {

       SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MemberMapper.class);

        int result = mapper.searchMember(memberList);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }



}


