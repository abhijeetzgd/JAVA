class kutumb{
 //Instance variable 
  int mob=1;
  int laptop=1;
  //static variable

 void display(){

 System.out.println("In display");//instance method

}
 static void statdisplay(){

 System.out.println("In statdisplay");//static method

}

public static void main(String[] args){

  kutumb obj1=new kutumb();
  obj1.display();
  obj1.statdisplay();

  kutumb obj2=new kutumb();
  obj2.display();
  obj2.statdisplay();
 }
}
