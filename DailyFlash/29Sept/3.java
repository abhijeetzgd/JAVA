class Demo {

  public static void main(String [] args ){

    float num []={50.54f,67.43f,87.33f,98.44f,66.55f};
    float sum =0;
    for(int i=0;i<5;i++){
sum = sum + num[i];
    }
    System.out.println("Avg = "+(sum/5));

  }
}
