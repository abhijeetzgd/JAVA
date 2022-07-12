interface RBI{

  void loanType();
  void ROI();
}

class SBI implements RBI{
  public void loanType(){

    System.out.println("HomeLoan");
  }

  public void ROI(){
    System.out.println("8.98");

  }
}

class user{
  public static void main(String []args){
    SBI s = new SBI();
    s.loanType();
    s.ROI();
  }
}
