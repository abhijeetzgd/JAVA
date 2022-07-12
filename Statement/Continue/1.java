class ContinueDemo {

  public static void main(String [] args){

    for(int i=1;i<51;i++){

      if(i % 5==0 && i%7 ==0){
        continue;
      } else {
        System.out.println(i);
      }
    }
  }
}
