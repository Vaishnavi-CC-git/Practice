public class OverFlowExample {
    public static void main(String[]args){
        int x =  Integer.MAX_VALUE;
        System.out.println("Before:"+ x);
        x++;
        System.out.println("After:"+ x);
    }
}