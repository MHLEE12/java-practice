class Calculator{ //변수와 메소드의 집합 = 객체
    int left, right;
    public void setOprands(int left, int right){
        this.left = left; //this.는 인스턴스 자신을 의미
        this.right = right; // 오른쪽의 left;, right;는 3번째 줄의 괄호 안 left, right를 의미함
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
}

public class JavaStudy08 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(); //Calculator는 객체
        c1.setOprands(10, 20); //객체가 가지고 있는 변수들은 객체가 가진 상태이며 그 상태를 바탕으로 메소드를 호출하는 것은 행위
        c1.sum(); //30
        c1.avg(); //15

        Calculator c2 = new Calculator(); //c1,c2는 인스턴스(컨테이너)! 설계도(class)에 따라 만들어진 제품이라고 보면 된다
        c2.setOprands(20,40);
        c2.sum(); //60
        c2.avg(); //30
    }
}
