class Girl{

  static int status = 1;//1 represent single
  static int beauty = 1;
  static String name="#&^!$@";
  int brothers=0;
  int sisters=0;

  static void hobby()  {
    System.out.println("Like to dance ");
    System.out.println("Pet lover,LOL ;) ");
  }
  void profession() {
    System.out.println("Coding...");
  }

  void patavne(){
    System.out.println("Sakt Mulanna ,pighalavne !");
  }
}

class Boy{

public static void main(String [] args){
  Girl item=new Girl();
  Girl.hobby();
  item.profession();
  item.patavne();
}

}
