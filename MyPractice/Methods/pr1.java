/*calling a instance method without parameter*/
class Addition{

  int num1=20,num2=10;//instance Variables
// claculate addition of two number instance method
  void sum(){
    int sum=num1+num2;
    System.out.println(" sum = "+sum);
  }
}

class Method{

  public static void main(String [] args){

    Addition obj = new Addition();//creating object of class addition
    obj.sum();//calling sum method
  }
}
/*
output
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/staticMethod$ javac pr1.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/staticMethod$ java Method
 sum = 30
*/
