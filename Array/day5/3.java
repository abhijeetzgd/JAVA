//home work code from sir for 3d jagged array

import java.util.*;
class JaggedArray3D{

  public static void main(String []arhs){

    int [][][] xarr = new int[2][3][];
    xarr[0][0] = new int[2];
    xarr[0][1] = new int[3];
    xarr[0][2]= new int[4];

    xarr[1][0] = new int[3];
    xarr[1][1] = new int[1];
    xarr[1][2]= new int[3];

Scanner sc = new Scanner(System.in);

for(int k=0;k<2;k++){

  for(int i=0;i<xarr[k].length;i++){

    for(int j=0;j<xarr[k][i].length;j++){

      xarr[k][i][j] = sc.nextInt();
    }
  }
}
for(int k=0;k<2;k++){
System.out.println("plane "+k);
  for(int i=0;i<3;i++){

    for(int j=0;j<xarr[k][i].length;j++){

      System.out.print(xarr[k][i][j]+"  ");
    }
    System.out.println();
  }
}
   }
}
