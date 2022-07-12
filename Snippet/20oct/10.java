class Animal{

  String  Animal;
  Animal (String Animal){
    this.Animal = Animal;
  }
}

class c2w{

  public static void main(String []args){

    Animal arr[] = new Animal("Tiger"),new Animal("Lion");

    System.out.println(arr[0]);
  }
}
