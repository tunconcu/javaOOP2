package JavaOOP2;

public class MultipleDimentionList {
    public static void main(String[] args){
        double[][] list = {
                        {1.1,1.2},
                        {2.1,2.2}
                        };
   

    for(int i=0;i<2;i++){
        System.out.println();
        for(int j=0;j<2;j++){
            System.out.println(list[i][j]);
        }
    }

    System.out.println("---------------------------");

        double[][] myList = new double[2][2];
        myList[0][0] = 1.1;
        myList[0][1] = 1.2;
        myList[1][0] = 2.1;
        myList[1][1] = 2.2;

       
}
}