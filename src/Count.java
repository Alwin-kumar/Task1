public class Count {
    public static void main(String[] args) {
        int num = 9999396,count =0;
        while (num!=0){
            num /= 10;
            count++;

        }
        System.out.println("Digits : "+ count);
    }
}
