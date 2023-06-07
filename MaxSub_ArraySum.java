// KADANE'S ALGORITHM

public class MaxSub_ArraySum {
    public static void MaxSubArraySum(int numbers[]) {

        int currentSum=0;
        int MaxSum=Integer.MIN_VALUE;


        for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for (int j = i; j < numbers.length; j++)
            {
                int end=j;
                currentSum=0;
                for (int k = i; k <= j; k++) {
                    //SubArray sum
                    currentSum+=numbers[k];


                }
                if (MaxSum<currentSum){
                    MaxSum=currentSum;
                }

            }

        }
        System.out.println("Max Sum = "+MaxSum);
    }


    public static void main(String[] args) {
        int numbers[]={1,-3,5,-6,17,9};
        MaxSubArraySum(numbers);
    }
}

