package BaiscSortingAlgo;

public class InsertionSort {
    public static void insertion(int arr[]){
        for(int i=0; i<arr.length;i++){
            int carr = arr[i];
            int prev = i-1;
            // finding out correct (position) to insert
            while(prev >= 0 && arr[prev]>carr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=carr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    


    public static void main(String[] args) {
        int arr[] = {5,4,7,3,8};
        insertion(arr);
        printArr(arr);
}
}
        

    
