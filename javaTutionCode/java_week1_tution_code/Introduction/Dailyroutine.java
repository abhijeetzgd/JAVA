/*
//with object //
class Routine{
   void cricketkheluya(){
   
    System.out.println("playing cricket");
   
}  
public static void main(String[] args){
   System.out.println("sweet home");
   Routine play=new Routine();
   play.cricketkheluya();   
}
}
*/


// without object cretation
class Routine{
  static void cricketkheluya(){
   
    System.out.println("playing cricket");
   
}  
static public void main(String[] tus){//public and static che location change kar shakto
   System.out.println("sweet home");
   cricketkheluya();   
}
}
