public class javastudy03 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(0%a);
        System.out.println(1%a);
        System.out.println(2%a);
        System.out.println(3%a);

        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);

       int b = 10;
       int c = 3;
       float d = 10.0F;
       float f = 3.0F;
        System.out.println(b/c);
        System.out.println(d/f);
        System.out.println(b/f);

        int i = 3;
        i++;
        System.out.println(i); //결과는 4
        ++i;
        System.out.println(i); //결과는 5
        System.out.println(++i); //괄호 내부에서 1을 더해서 결과값이 프린트 = 6
        System.out.println(i++); //괄호 내부에서 더해지지 않고 맥락이 끝난 뒤 그 다음 i값에 1이 더한 것으로 나옴 = 6
        System.out.println(i); //결과는 7
    }
}
