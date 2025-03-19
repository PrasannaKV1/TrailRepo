package JavaPracticePrograms;

public class RotateTheArray {
    public static void main(String[] args) {
        int array[]={3,2,1,5,6,7};
        //

             //  1 to 5
        for (int i = 0; i <array.length-1; i++) {
            int temp=array[0];
            array[i]=array[i+1];
            array[array.length-1]=temp;
        }

        for(int b:array)
        {
            System.out.println(b);
        }
    }
}
