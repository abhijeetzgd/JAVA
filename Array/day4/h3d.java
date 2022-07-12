class Demo{

  public static void main(String [] r){

int arr[][][]={{{1,2,3},{4,5,6},{7,8,9}},{{10,20,30},{40,50,60},{70,80,90}}};

    System.out.println("Enter elements of array : ");


        for(int i=0;i<2;i++){
          System.out.println("plane "+i);
          for(int j=0;j<3;j++){

            for(int k=0;k<3;k++){

              System.out.print(" "+arr[i][j][k]);
            }System.out.print("\n");
          }
        }
  }
}
