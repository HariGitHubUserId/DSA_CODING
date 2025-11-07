// public class binarysearch{
//     public static int Binary(int[]arr, int key){
//         if(arr == null || arr.length == 0){
//             return -1;
//         }
//         int low = 0;// starting point
//         int high = arr.length -1; // ending point

//         while(low<=high){ 
//             int mid = low + (high - low)/2; //50

//             if(arr[mid] == key){
//                 return mid;
//             }
//             else if(key < arr[mid]){
//                 high = mid - 1;
//             }
//             else{
//                 low = mid + 1;
//             }
//         }
//         return - 1;
//     }
//     public static void main(String[] args) {
//         int[]arr = { 10 , 20 ,30 ,40 , 50 ,60, 70 ,80};
//         int key = 60;
//         int result = Binary(arr , key);
//         System.out.println( result);
//     }
// }


























// public class selectionsort1{
//     public static int selectionsort(int[]arr){
//         int n = arr.length;

//         for(int i = 0; i<n-1;i++){
//             int midindex = i;
//             for(int j = i + 1; j<n ;j++){
//                 if(arr[j]<arr[midindex]){
//                     midindex = j;
//                 }
//             }
//             int temp = arr[midindex];
//             arr[midindex]= arr[i];
//             arr[i] = temp;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[]arr = { 1 ,2,3,45,95,11,22,12};
//         selectionsort(arr);
//         for(int i : arr){
//             System.out.println(i);
//         }
//     }
// }


public class selectionsort2{
    public static int selectionsorting(int[]arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int midindex = i; //4
            for(int j = i +1;j<n; j++){
                if(arr[j]<arr[midindex]){
                    midindex = j; //1
                }
            }
            int temp = arr[midindex];
            arr[midindex] = arr[i];
            arr[i] = temp;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {4,1,3,7,6,7,-1};
        selectionsorting(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}




