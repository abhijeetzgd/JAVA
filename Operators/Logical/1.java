class LogicalDemo{
  public static void main(String []args){
    int num1=10,num2=20;
    boolean ans;

    ans = num1 && num2;
    system.out.println(ans);//true


  }
}
/*
1.java:6: error: bad operand types for binary operator '&&'
    ans = num1 && num2;
               ^
  first type:  int
  second type: int
1.java:7: error: package system does not exist
    system.out.println(ans);//true
          ^
2 errors
*/
