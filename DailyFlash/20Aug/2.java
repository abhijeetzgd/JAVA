class Demo{

  public static void main(String []args){

    float principle = 4000f;
    float intrest = 4.5f;
    float time = 3f;
    float finalAmount=1.09f;

    finalAmount = principle*intrest*time*0.01f;

    System.out.println("Total finalAmountto be paid "+finalAmount);

  }
}
