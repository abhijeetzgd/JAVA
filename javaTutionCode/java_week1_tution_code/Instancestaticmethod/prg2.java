
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

public static void main(String[] args){

  kutumb obj1=new kutumb();
  obj1.display();

  kutumb.statdisplay();//static method call using callname
  statdisplay();//dirct call with same class
 }
}
