class Demo {

  public static void main(String [] args){
    char ch = '*';

    if((ch <= 90 && ch >=65)||(ch <=122 && ch >=97) ){

      if(ch <=57 || ch >=48){
        System.out.println("Entred character is digit");

      }
      if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        System.out.println("Entred character is Vovel");
      else
        System.out.println("Entred character is Consonent");

    } else {

      System.out.println("Entred character is special character");

    }

  }



}
