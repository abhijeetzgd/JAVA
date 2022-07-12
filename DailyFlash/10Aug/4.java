class Demo {

  public static void main(String []args){

      for(int i=1 ;i<=10; i++){
        int fact = 1;
        System.out.print("factorial of"+i);
        for(int j=1; j<=i; j++){

          fact = fact * j;

        }
        System.out.println(" : "+fact);
        }
}
}
