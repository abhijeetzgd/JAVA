class India{
    int indArmyCnt=1237117;

    void PM(){
      System.out.println("Age of Expansion Over");
    }

    void Decision(){
      System.out.println("Preparing Defence");
      System.out.println("Army count ="+indArmyCnt);
    }

}

class China{
    int chinaArmyCnt=2070000;

    void PM(){
      System.out.println("Age of Expansion will Continue");
    }

    void Decision(){
      System.out.println("Preparing for attack");
      System.out.println("Army count = "+chinaArmyCnt);
    }

}
class War{
  public static void main(String [] args){
    India modiji= new India();
    modiji.PM();
    modiji.Decision();

    China li = new China();
    li.PM();
    li.Decision();
  }
}
