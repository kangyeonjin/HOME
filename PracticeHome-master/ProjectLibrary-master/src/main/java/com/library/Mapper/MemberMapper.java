package com.library.Mapper;

import com.library.dto.MemberDTO;

import java.util.List;
import java.util.Map;

public interface MemberMapper {

    List<MemberDTO> memberTest();

    int memberInsert(MemberDTO member);

    int memberUpdate(MemberDTO member);

    int memberDelete(String parameter);

    int searchMember(String member);

}



