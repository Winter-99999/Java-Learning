package method;

public class m10 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int [][]arr1=new int[3][3];
        int [][]arr2={
                {1,2,3},
                {4,5,6},
                {7,8,9,10}
        };
        //System.out.println(arr[0][0]);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
