class Demo{

  public static void main(String []args){

    int year = 2100;


      if(year % 100 == 0 && year % 400 ==0)
        System.out.println("It is leap year");
      else if(year % 4 == 0)
        System.out.println("It is leap year");
      else
        System.out.println("It is Not leap year");

  }
}
