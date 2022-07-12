class T20{
  static String capt = "Virat kohli";//static variable
         int toss=0;//instance variable


static void list(){

  System.out.println("Players list");//static method
  System.out.println(capt);
  T20 obj=new T20();
  System.out.println(obj.toss);
  
}
void BatorBowl(){

  System.out.println("Decision");//instance method
  System.out.println(capt);
  System.out.println(toss);

}

public static void main(String[] args){
   list();
   T20 firstmatch =new T20();
   firstmatch.BatorBowl();
 }
}



