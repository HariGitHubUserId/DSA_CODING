public class linearsearch{ // CLASS NAME AND FILE NAME
    public static int Linear(int arr[], int target){ // METHOD NAME 
        if(arr == null){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] data = { 1, 2, 3, 45, 5, 6 ,7 , 10};
        System.out.println(Linear(data,1)); // best case
        System.out.println(Linear(data,45)); // average case
        System.out.println(Linear(data,10)); // worse case
        System.out.println(Linear(data,100)); // worse case not present in array
    }
}
