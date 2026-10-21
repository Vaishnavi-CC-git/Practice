public class SwappingExampleThirdVariable{
    public static void main(String[]args){
        int a = 12;
        int b = 31;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}