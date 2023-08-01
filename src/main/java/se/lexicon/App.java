package se.lexicon;

// Java code to implement the approach

class GFG {

    // Function to find the missing number
    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++){    //This will skip the missing index (4-1) where 4 is the missing number (position)
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0) // Here we are looking for the only 0 in the array and it is when i = 3
                ans = i + 1; //So the missing number is 3+1
        }
        System.out.println("Original array:");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println("\nThe missing number is : " + ans);
    }
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;

        // Function call
        findMissing(arr, n);
    }
}
//System.out.println("Temp["+i+"] = " + temp[i] + " Arr["+i+"] = " + arr[i] +
//        " Temp["+(arr[i]-1)+"] = " + temp[arr[i] - 1]);