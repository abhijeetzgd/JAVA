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
   System.out.println(capt);
   
   T20 firstmatch= new T20();
   System.out.println(firstmatch.toss);

  }
}



