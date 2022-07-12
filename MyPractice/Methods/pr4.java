//calling methods by creating object

class nandedcity{
  static int mall =1;
  static int gym=1;
  int garden=1;
  void Abhijeet(){
    System.out.println(" In Abhijeet Method");
    System.out.println(" Lives In Lalit");
    System.out.println("mall = "+mall);
    System.out.println("gym = "+gym);
    System.out.println("garden = "+garden);

  }

  void Abhishek(){
    System.out.println(" In abhishek method");
    System.out.println(" Lives in Sargam");
    System.out.println("mall = "+mall);
    System.out.println("gym = "+gym);
    System.out.println("garden = "+garden);

  }

  static void asawari(){
    System.out.println("I am buldind in nanded city");
    System.out.println("mall = "+mall);
    System.out.println("gym = "+gym);
/*    System.out.println("garden = "+nandedcity.garden); this line cause following error
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ javac pr4.java
pr4.java:29: error: non-static variable garden cannot be referenced from a static context
    System.out.println("garden = "+nandedcity.garden);
                                             ^
1 error
*/
  }
}


class SatishMagar{

  public static void main(String args[]){
    nandedcity nc = new nandedcity();
    nc.Abhijeet();
    nc.Abhishek();
    nc.asawari();
    System.out.println(" now we are calling static method without object");
    System.out.println(" by using classname.staticmethodname");
    nandedcity.asawari();
  }
}

/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ javac pr4.java
In Abhijeet Method
Lives In Lalit
mall = 1
gym = 1
garden = 1
In abhishek method
Lives in Sargam
mall = 1
gym = 1
garden = 1
I am buldind in nanded city
mall = 1
gym = 1
now we are calling static method without object
by using classname.staticmethodname
I am buldind in nanded city
mall = 1
gym = 1
*/
