public class Secondlargestelement {
    public static void main(String[] args) {
        int arr[] = { 50 , 50 , 50 , 50 , 50};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] > first){
                second = first;
                first  = arr[i];
            }else if ( arr[i] > second && arr[i] < first){
                second = arr[i];
            }
        }

        if(second == Integer.MIN_VALUE){
            System.out.println("no distinct second largest element!");
        }
        else{
            System.out.println("Second largest element: " + second);
        }
    }
}
