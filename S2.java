Import java.util, *;
Import java.io.*;

public static void main(String[] args) throws java.lang.Exception {
  try {
    Scanner fs = new Scanner(System.in);

    int t = 1;
    //t = fs.nextInt();
    while (t--> 0) {
      System.out.println("ENTER SIZE OF ARRAY");
      int size = fs.nextInt();

      //creating an array of size specified by user

      int arr[] = new int[size];
      System.out.println("ENTER ARRAY VALUES");
      for (int i = 0; i < size; i++) {
        arr[i] = fs.nextInt();
      }
      System.out.println("ENTER K VALUE");
      int k = fs.nextInt();
      int temp = 0;
      int i = 0, j = 0;

      //Sorting in increasing order using bubble sort
      for (i = 0; i < size; i++) {
        for (j = 0; j < size; j++) {
          if (arr[i] < arr[j]) {
            //swap arr[i] and arr[j]
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
      }
      System.out.println("SORTED ARRAY IS -->");
      for (int a: arr) {
        System.out.print(a + " ");
      }
      System.out.println();
      //display the Kth largest value

      System.out.println("THE Kth Largest Value is " + arr[k - 1]);

    }
  } catch (Exception e) {
    return;
  }
}
