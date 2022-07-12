class T20{
  static String capt = "Virat kohli";//static variable
         int toss=0;//instance variable


static void list(){

  System.out.println("Players list");//static method

}
void BatorBowl(){

  System.out.println("Decision");//instance method
}

public static void main(String[] args){

   T20 firstmatch= new T20();
   firstmatch.list();
   firstmatch.BatorBowl();

  }
}



