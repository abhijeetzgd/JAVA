class LogicalDemo{
  public static void main(String []args){
    int num1=10,num2=20;
    boolean ans;

//    ans = num1 && num2;         error

    ans = (num1 != num2) && (num1 < num2);
    System.out.println(ans);//true

    //ans = num1 || num2;//Bad opperand type
    ans = (num1 < num2) ||(num1 > num2);
    System.out.println(ans);//true

  }
}
