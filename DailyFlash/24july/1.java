class Check {

        void evenOdd(int num){

          if(num % 2 == 0){

              System.out.println("Number is even number ");
            } else {

              System.out.println("Number is odd number ");
            }

      }
  }
class Demo {

    public static void main(String []args){

          Check no = new Check();
          no.evenOdd(20);
          no.evenOdd(27);

    }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/24july$ java  Demo
Number is even number
Number is odd number
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/24july$
*/
