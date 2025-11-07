public class bubblesort {
    public static int bubblesorting(int[]arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0 ;j<n-i-1; j++){
                 if(arr[j] > arr[j+1]){ 
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] =temp;
                 }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {5,1,4,2,8};
        int result = bubblesorting(arr);
        System.out.println(result + " ");
    }
}
