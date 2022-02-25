public class javastudy05 {
    public static void main(String[] args) {
//        String id = args[0]; //args는 사용자 입력값
//        String password = args[1];
//        if(id.equals("egoing")) {  //사용자 입력값과 ("") 이 안의 값을 비교해서 같으면 right 다르면 wrong
//            if (password.equals("1111")) {
//                System.out.println("right");
//            } else {
//                System.out.println("wrong");
//            }
//        } else {
//            System.out.println("wrong");
//        }

        String id = args[0];
        String password = args[1];
        if(id.equals("egoing") && (password.equals("1111"))) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        } //위의 코드와 내용은 같다. and(&&)를 써서 간결해졌음. or는 || 를 사용한다. not은 ! 로 표시.

        System.out.println("switch(1)");
        switch(1) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }
//case 끝에 break를 넣으면 해당 값만 나온다
        System.out.println("switch(2)");
        switch(2) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }
        System.out.println("switch(3)");
        switch(3) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }
        //주어진 값 이외에는 defalt 를 써서 defalt값이 나오게 할 수 있다
    }
}
