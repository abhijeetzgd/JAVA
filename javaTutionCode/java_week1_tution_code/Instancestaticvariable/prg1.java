
class kutumb{
   //instance variable
   int mob=1;
   int laptop=1;
   //static variable
   static int tv=1;


void shashiMethod(){

System.out.println("Mob ="+ mob);
System.out.println("laptop ="+ laptop);
System.out.println("Tv ="+ tv);

}

void vikasMethod(){

System.out.println("Mob ="+ mob);
System.out.println("laptop ="+ laptop);
System.out.println("Tv ="+ tv);
}

public static void main(String[] args){

  kutumb shashi=new kutumb();
  shashi.shashiMethod();

  kutumb vikas= new kutumb();
  vikas.vikasMethod();

  }
}
