class JaggedArrayDemo{

  public static void main(String []args){

      int [][ ] arr={{1,2},{3,4,5},{6,7,8,9}};
      System.out.println("Array 1");

      for(int i=0 ;i<3;i++){

        for(int j=0;j<arr[i].length;j++){
          System.out.print(arr[i][j]+" ");
        }System.out.println();
      }
/*declaration
      int [][] xarr = new int[3][];
       xarr [0] = new int[2];
       xarr [1] = new int[3];
       xarr [2] = new int[4];
*/
System.out.println("Array 2");

int [][] xarr = new int[3][];
 xarr [0] = new int[]{10,20};
 xarr [1] = new int[]{3,4,50};
 xarr [2] = new int[]{6,7,8,9};

       for(int i=0 ;i<3;i++){

         for(int j=0;j<arr[i].length;j++){
           System.out.print(xarr[i][j]+" ");
         }System.out.println();
       }
  }
}
