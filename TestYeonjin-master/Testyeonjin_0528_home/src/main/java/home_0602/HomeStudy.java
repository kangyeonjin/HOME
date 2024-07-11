package home_0602;

import java.util.HashMap;

public class HomeStudy {
    public void home(){
        HashMap<String, String> map = new HashMap<>();  //key,value모두 자료형지정
        map.put("people","사람");
        map.put("baseball","야구");

        System.out.println(map.get("people"));
        System.out.println(map.get("baseball"));
        System.out.println(map.containsKey("people"));  //key존재여부확인
        System.out.println(map.remove("people")); //people에해당하는 키와 벨류 모두삭제후 "사람"출력
        System.out.println(map.size());  //요소의 갯수리턴함
        System.out.println(map.keySet()); //맵의 모든 key모아서 리턴

    }
}
