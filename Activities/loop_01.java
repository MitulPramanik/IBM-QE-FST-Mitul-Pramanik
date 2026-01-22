import java.util.*;
public class loop_01 {

    
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size  of the array.");
        /* 
        int s=0;
        if(scn.hasNextInt()){
            s = scn.nextInt();
        }
        int[] arr = new int[s];
        
        System.out.println("Enter the elements of the array:");
        
        for(int i=1; i<s; i++){
            if(scn.hasNextInt()){
                arr[i]=scn.nextInt();
            }
        }
         
        System.out.println("The elements of the array are:");
        for(int i=0; i<s; i++){
            System.out.println(arr[i]+ " ");
        }

        Arrays.sort(arr);
        for(int i=1; i<s; i++){
            System.out.println("The sorted array is " + arr[i]+ " ");
        }

        
        while(s>0 ){
            System.out.println("The elements are:" + s);
            s--;
        }*/
            int s=0;
            do{
                System.out.println(s);
                s++;
            }
            while(s<5);
    }
}

