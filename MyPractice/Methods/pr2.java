/*calling method by passsing parameter*/

class Subtraction{

  int num1,num2;//instance Variables
/* claculate difference of two number in instance method
by passing parameter to function while calling*/
  void difference(int num1,int num2){
    int sub=num1-num2;
    System.out.println(" sub = "+sub);
  }
}

class Method{

  public static void main(String [] args){

    Subtraction obj = new Subtraction();//creating object of class Subtraction
    obj.difference(70 ,125);//calling difference method
  }
}
/*
output
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ javac pr2.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ java Method
 sub = -55
*/
