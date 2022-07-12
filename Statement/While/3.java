class ForWhile {

  public static void main(String []args){

    /*for(initalization;condition;inc/dnc){
      statement;
    }*/

    int num = 247;
    int rem = 0;
    int sum = 0;

    for(;num != 0;num = num /10){
      rem = num % 10;
      sum = sum + rem;
    }
System .out .println(sum);
  }
}
