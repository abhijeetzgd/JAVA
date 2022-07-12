class Admission{

  Admission(String field){
    if(field == "Medical"){
      neet();
    }else{
      jee();
    }
  }

  void neet(){

    class Gov{

      void collage(){
        System.out.println("Aiims");
      }
    }

    class Pri{


            void collage(){
              System.out.println("Bharti");
            }

    }

    Gov gvt = new Gov();
    gvt.collage(); //Aiims
  }

  void jee(){

    class Gov{

            void collage(){
              System.out.println("coep/IIT");
            }
    }

    class Pri{

            void collage(){
              System.out.println("Sinhagd/jspm");
            }
    }

      Pri pvt = new Pri();
      pvt.collage(); //Sinhagd/jspm
    }
}

class Decision{

  public static void main(String []args){

    Admission adm = new Admission("Medical");
    Admission adn = new Admission("Engineer");


  }
}
