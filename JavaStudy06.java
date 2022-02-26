public class JavaStudy06 {
    public static void main(String[] args) {
        int i = 0;
        while(i<10) { //while옆 괄호 안 값이 언제까지 반복할 것인지 조건을 의미
            System.out.println("coding everybody " + i);
            i++; //i=i+1
        }

        //for(초기화; 종료조건; 반복실행){반복적으로 실행될 구문}
        for(int m = 0; m<10; m++) {
            if(m==5)
                break; //if뒤의 조건 구문이 1줄이면 중괄호 생략해도 가능
            System.out.println("coding everybody " + m);
        }

    }
}
