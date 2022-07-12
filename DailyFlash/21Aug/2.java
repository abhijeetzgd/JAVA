class Demo{
public static void main(String [ ]args){

  float unit=50f,rate=0f,price=0f;


  if(unit <= 50){
    rate = 0.50f;
    price = rate * unit;
    System.out.println("Price for unit is "+price );
  } else if(unit >= 50 && unit <=150){
    rate = 0.50f;
    price = rate * 50f;
    price = price + (unit - 50f)*0.75f;
    System.out.println("Price for unit is "+price );

  } else if(unit >= 150 && unit <=250){
    rate = 0.50f;
    price = rate * 50f;
    price = price + 100f * 0.75f+(unit - 150f)*1.2f;
    System.out.println("Price for unit is "+price );

  }else{

    price = unit * 1.5f;
    System.out.println("Price for unit is "+price );


  }

}
}
