
void getBed(){

  System.out.println("Normal Bed");
}

void getBed(String sp){

  System.out.println("ICU Bed");
}


}

class Patient{

    public static void main(String []args){
      Hospital h = new Hospital();
      h.getBed();//normal Bed
      h.getBed("ICU");//ICU Bed
    }
}
