public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}};
        System.out.println(hourglass(arr));
    }

    public static int hourglass(int[][] arr)
    {
        int sum = 0;
        int highestSum = 0;
        for(int r = 0; r < arr.length - 2; r++)
        {
            for(int c = 0; c < arr[0].length - 2; c++)
            {
                sum = arr[r][c] + arr[r][c+1] + arr[r][c+2]
                        + arr[r+1][c+1] + arr[r+2][c]
                        + arr[r+2][c+1] + arr[r+2][c+2];
                if(sum > highestSum){
                    highestSum = sum;
                }
            }
        }
        return highestSum;
    }
}
