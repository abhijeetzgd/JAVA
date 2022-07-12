class Relational{
  public static void main(String []args){
    int num1 = 10;
    int num2 = 20;
    //int ans; error: incompatible types: boolean cannot be converted to int
    boolean ans;

    ans = num1==num2;
    System.out.println(ans);//false

    ans = num1!=num2;
    System.out.println(ans);//true

    ans = num1<num2;
    System.out.println(ans);//true

    ans = num1>num2;
    System.out.println(ans);//false

    ans = num1<=num2;
    System.out.println(ans);//true

    ans = num1>=num2;
    System.out.println(ans);//false


  }
}
