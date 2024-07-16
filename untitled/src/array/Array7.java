package array;

public class Array7 {
    public static void main(String[] args) {

        int [][] arr = new int[2][3];

        arr[0][0]= 1;
        arr[0][1]= 2;
        arr[0][2]= 3;

        arr[1][0]= 5;
        arr[1][1]= 6;
        arr[1][2]= 7;

        for(int row =0 ; row<2; row++){
            System.out.println(arr[row][0]);
            System.out.println(arr[row][1]);
            System.out.println(arr[row][2]);
        }

        System.out.println(); // 한 행이 끝나면 줄을 바꾼다.



    }
}
