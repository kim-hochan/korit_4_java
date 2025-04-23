package ch07_loops;
/*
    while문을 사용하여

    1 2 3 4 5 6 7 8 9 10
    11 12 13 14 15 16 17 18 19 20
    ...
    91~ 100

    이 출력이 되도록 작성하시오.
 */
public class Loop03 {
    public static void main(String[] args) {
        // # 1 반복문 100번 돌리는 방법
        int i1 = 1;
        while (i1 < 101) {
            System.out.println(i1 + " ");
            if (i1 % 10 == 0) {
                System.out.println();
            }
            i1++;
        }

        // # 2 반복율 10번 돌리는 법
        int i2 = 1;
        while (i2 < 101) {
            System.out.println(i2 + " " + (i2 + 1)+ " " + (i2 + 2)+ " " + (i2 + 3)+ " "
                    + (i2 + 4)+ " " + (i2 + 5)+ " " + (i2 + 6)+ " " + (i2 + 7)+ " " +
                    (i2 + 8)+ " " + (i2 + 9));
            i2 += 10;
        }
        //고칠 필요성


    }
}
