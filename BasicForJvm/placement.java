class Capgimini{

    static int noOfEmployee = 200000;
    int projectCount=200;

    void displayProject(){

        System.out.println("Capgimini project count = "+projectCount);
    }

    static void empInfo(){

      System.out.println("Capgimini totel emp count = "+noOfEmployee);
    }

}

class Tcs{

    static int noOfEmployee = 300000;
    int projectCount=500;

    void displayProject(){

        System.out.println("Tcs project count = "+projectCount);
    }

    static void empInfo(){

      System.out.println("Tcs totel emp count = "+noOfEmployee);
    }
}

class Company{
    public static void main(String args[]){
        Capgimini pune = new Capgimini();
        pune.projectCount=130;
        pune.empInfo();
        pune.displayProject();

        Capgimini chennai = new Capgimini();
        chennai.projectCount=70;
        chennai.empInfo();
        chennai.displayProject();

        Tcs mumbai = new Tcs();
        mumbai.projectCount=270;
        mumbai.empInfo();
        mumbai.displayProject();

        Tcs banglore = new Tcs();
        banglore.projectCount=230;
        banglore.empInfo();
        banglore.displayProject();


  }
}
