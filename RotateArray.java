import java.util.Scanner;

class RotateArray{

    static void rotatearray(int[] num , int k){
        if(k>num.length)
           k=k%num.length;
        int i;
        int[] result = new int[num.length]; 

        for(i=0 ; i<k ; i++){
            result[i]=num[num.length-k+i];
        }

        int j=0;
        for(i=k ; i<num.length ; i++){
            result[i]=num[j];
            j++;
        }
        // System.arraycopy( result, 0, num, 0, num.length );

        for(i=0 ; i<num.length ; i++){
            System.out.print(" " +result[i] +" " );
        }
    }

     public static void main(String[] args) {
        // int[] num={1,2,3,4,5,6,7};
        // int k=3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  array");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0 ; i<n ; i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the element from which you want rotation");
        int k=sc.nextInt();
        rotatearray(num , k);
     }
}