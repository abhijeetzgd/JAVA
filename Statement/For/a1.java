class NestedSwitch {

  public static void main(String [] args){

    int floor = 2;

    switch (floor){
      case 1:
      System.out.println("First floor....");

        char ch = 'f';                //s for shopping,F for food

        switch(ch){
          case 'S':
          case 's':
            System.out.println("Shopping....");
          break;

          case 'F':
          case 'f':
          System.out.println("Foodcourt....");
          break;

          default:
            System.out.println("Service not Available");
}


      break;

      case 2:
      System.out.println("Second floor....");


        char ch1 = 'M';                //M for Movie,P for Playstation

        switch(ch1){
          case 'M':
          case 'm':
            System.out.println("Dill bechara....");
            break;

          case 'P':
          case 'p':
          System.out.println("Foodball....");
          break;

          default:
            System.out.println("Service not Available");
}
      break;

      default:
      System.out.println("No accesss of this floor...");

      break;
    }
  }
}
