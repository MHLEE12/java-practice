class JavaStudy09_1 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 5;  //channel 값을 5로 한다.
        System.out.println("t1의 channel값을 5로 변경하였습니다.");

        // t2 = t1; <- 참조변수 t1의 값을 t2에 저장하라는 것.
        // t2가 t2가 가리키는 객체와 연결이 끊기고 t1이 가리키는 객체와 연결된 것.
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

    }
}
