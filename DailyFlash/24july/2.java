class Check {

        void angle(int num){

          if(num > 90){

              System.out.println("Angle is obtuse Angle ");
            } else {

              System.out.println("Angle is Acute Angle ");
            }
      }
  }

class Demo {

    public static void main(String []args){

          Check no = new Check();
          no.angle(20); //Acute
          no.angle(97); //obtuse

    }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/24july$ java Demo
Angle is Acute Angle
Angle is obtuse Angle
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/24july$
*/
