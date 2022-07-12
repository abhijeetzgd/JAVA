/*calling a instance method with parameter and with returntype as int*/
class Multiplication{

  int num1,num2;//instance Variables
// claculate Multiplication of two number instance method withparameter and returntype
  int mul(int num1,int num2){
    int mul=num1*num2;
    System.out.println(" mul = " +mul);
    return mul;//only one value can be return at a time
  }
}

class Method{

  public static void main(String [] args){

    Multiplication obj = new Multiplication();//creating object of class Multiplication
    int ans =obj.mul(100,2);//calling mul method for Multiplication
    System.out.println("value return from mul function="+ans);//value catch from mul()
  }
}
/*
output
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ javac pr3.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ java Method
 mul = 200
value return from mul function=200
*/
