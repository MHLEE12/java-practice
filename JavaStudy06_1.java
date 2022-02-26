public class JavaStudy06_1 {
    public static void main(String[] args) {
        //생활코딩 java입문 - 배열
        String[] members = {"송강", "박민영", "박재범"};
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "이 상담을 받았습니다.");
        }

        String[] memberss = {"송강", "박민영", "박재범"};
        for(String e : memberss) {  //for-each
            System.out.println(e + "이 상담을 받았습니다!");
        }

    }
}
