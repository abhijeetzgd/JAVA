
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
  shashi.mob=0;// instance variable can change only shashi method
  shashi.tv=0;//static variable can change both shashi method and vikas method
  shashi.shashiMethod();

  kutumb vikas= new kutumb();
  vikas.vikasMethod();

  }
}

/*
//using vikasmethod changes

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
  kutumb vikas= new kutumb();
  vikas.tv=0;////static variable can change both shashi method and vikas method

  kutumb shashi=new kutumb();
  shashi.mob=0;// instance variable can change only shashi method
  shashi.shashiMethod();

  vikas.vikasMethod();

  }
}

*/
