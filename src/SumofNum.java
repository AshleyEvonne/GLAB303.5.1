public class SumofNum {
    public static void main(String[] args) {
        //example 2 : Program to find thr sum of natural numbers from 1 to 1000.
        int sum = 0;
        int num = 1000;
        // for loop
        for (int i =1; i <= num; ++i) {
            //body inside for loop
            sum += i; //sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }
}
