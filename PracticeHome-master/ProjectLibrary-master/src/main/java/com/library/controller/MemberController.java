package com.library.controller;

import com.library.Service.MemberService;
import com.library.dto.MemberDTO;
import com.library.dto.SearchMember;
import com.library.printResult.MemberView;

import java.util.List;
import java.util.Map;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.memberList;

public class MemberController {

    private final MemberView memberView;
    private final MemberService memberService;

    public MemberController() {
        memberView = new MemberView();
        memberService = new MemberService();
    }

    public void memberTest() {

        List<MemberDTO> memberList = memberService.memberTest();

        if(memberList != null) {
            memberView.printMemberList(memberList);
        } else {
            memberView.printErrorMessage("selectList");
        }
    }

    public void insertMember(Map<String, String> parameter) {
        String code = parameter.get("code");
        String name = parameter.get("name");
        String phone = parameter.get("phone");
        String no = parameter.get("no");

        MemberDTO member = new MemberDTO();
        member.setMembercode(code);
        member.setMembername(name);
        member.setMemberphone(phone);
        member.setMemberno(no);

        if(memberService.insertMember(member)) {
            memberView.printSuccessMessage("insert");
        } else {
            memberView.printErrorMessage("insert");
        }
    }

    public void updateMember(Map<String, String> parameter) {
        String code = parameter.get("code");
        String name = parameter.get("name");
        String phone = parameter.get("phone");
        String no = parameter.get("no");

        MemberDTO member = new MemberDTO();
        member.setMembercode(code);
        member.setMembername(name);
        member.setMemberphone(phone);
        member.setMemberno(no);

        if(memberService.updateMember(member)) {
            memberView.printSuccessMessage("update");
        } else {
            memberView.printErrorMessage("update");
        }

    }

    public void deleteMember(Map<String, String> parameter) {

        String membercode = parameter.get("code");

        if(memberService.deleteMember(membercode)) {
            memberView.printSuccessMessage("delete");
        } else {
            memberView.printErrorMessage("delete");
        }
    }

    public void searchMember(SearchMember searchMember) {

        String membername = searchMember.getValue();
        List<MemberDTO> memberList = memberService.searchMember(membername);

        if(membername != null) {
            memberView.printMemberList(memberList);
        } else {
            memberView.printErrorMessage("selectOne");
        }

    }


}
