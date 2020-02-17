import java.util.*;
 
class RotateMatrix {
 static int N;
  static void reverseColumns(int arr[][])
  {
    for (int i = 0; i < N; i++)
      for (int j = 0, k = N - 1;
        j < k; j++, k--) {
        int temp = arr[j][i];
        arr[j][i] = arr[k][i];
        arr[k][i] = temp;
      }
  } 
  static void transpose(int arr[][])
  {
    for (int i = 0; i < N; i++)
      for (int j = i; j < N; j++) {
        int temp = arr[j][i];
        arr[j][i] = arr[i][j];
        arr[i][j] = temp;
      }
  }
  static void printMatrix(int arr[][])
  {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++)
        System.out.print(arr[i][j] + " ");
      System.out.println("");
    }
  } 
  static void rotate90(int arr[][])
  {
    transpose(arr);
    reverseColumns(arr);
  }
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter matrix size(N):");
   N=sc.nextInt();
    int arr[][] = new int[N][N];
   for(int i=0;i<N;i++)
   {
     for(int j=0;j<N;j++)
     {
       arr[i][j]=sc.nextInt();
     }
   }
 
    rotate90(arr);
    printMatrix(arr);
  }
}
