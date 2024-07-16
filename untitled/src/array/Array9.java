package array;

public class Array9 {
    public static void main(String[] args) {

        int [][] arr = new int[][]{{1,2,3},{4,5}};


        for(int row =0 ; row<2; row++){
            for(int col = 0; col<3; col++){
                System.out.println(arr[row][col]+" ");
            }System.out.println(); // 한 행이 끝나면 줄을 바꾼다.
        }


    }
}
