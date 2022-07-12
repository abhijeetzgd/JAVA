//with two classes
class kutumb{
 //Instance variable
  int mob=1;
  int laptop=1;

 void display(){

 System.out.println("In display");//instance method

}
 static void statdisplay(){

 System.out.println("In statdisplay");//static method

 }
}


class staticdemo{
public static void main(String[] args){

  kutumb obj1=new kutumb();
  obj1.display();
  obj1.statdisplay();

  kutumb.statdisplay();
  //statdisplay();//it gives error because two classes cannot be call directly
}
}
