class SwitchDemo{

  public static void main( String [] args){

    float x=30.5f; //byte has range -32768 to 32767

    switch(x){                      //byte,short,int,char yahi chalegea baki nai

      case 100:
        System.out.println("First case");
        break;


      case 20:
        System.out.println("Second case");
        break;


      case 30:
        System.out.println("Third case");
        break;
    }
  }
}
/*
4.java:5: error: incompatible types: possible lossy conversion from int to byte
    byte x=128; //byte has range -128 to 127
           ^
4.java:19: error: incompatible types: possible lossy conversion from int to byte
      case 300:
           ^
2 errors
*/
