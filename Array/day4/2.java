import java.util.*;
class demo{

  public static void main(String []arg){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter numer of rows and col:");
    int row = sc.nextInt();
    int col = sc.nextInt();

    char arr[][]=new char[row][col];

    for(int i=0;i<3;i++){

      for(int j=0;j<3;j++){

    arr[i][j]=sc.next().charAt(0);
  }
}
System.out.println("Elements are : ");
    for(int i=0;i<3;i++){

      for(int j=0;j<3;j++){

    System.out.print(arr[i][j]+" ");
  }System.out.print("\n");
}

  }
}
