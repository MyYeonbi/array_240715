package array;

public class Array2 {
    public static void main(String[] args) {
        int[] students; //배열변수 선언
        students = new int[5];

//변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

//변수값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생1 점수: " + students[1]);
        System.out.println("학생1 점수: " + students[2]);
        System.out.println("학생1 점수: " + students[3]);
        System.out.println("학생1 점수: " + students[4]);


    }
}
