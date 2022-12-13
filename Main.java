package JavaOOP2;

public class Main {
    public static void main(String[] args){
        double sum =0;
        
    double[] numbers = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
    double max = numbers[0];
    for(double number : numbers){
        if(max<number){
            max = number;
        }
        sum += number;
        System.out.println(number);
        System.out.println(max);
    }

    System.out.println(sum);
    System.out.println("--------------------------------------------------");


    }
}
