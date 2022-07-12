import java.util.*;
class UserInput{

  public static void main(String []arhs){

    int [][] xarr = new int[3][];
    xarr[0] = new int[2];
    xarr[1] = new int[3];
    xarr[2] = new int[4];

Scanner sc = new Scanner(System.in);

for(int i=0;i<xarr.length;i++){

  for(int j=0;j<xarr[i].length;j++){

    xarr[i][j] = sc.nextInt();
  }
}

for(int i=0;i<xarr.length;i++){

  for(int j=0;j<xarr[i].length;j++){

    System.out.print(xarr[i][j]+"  ");
  }
  System.out.println();
}
   }
}
