class Demo{

  public static void main(String []args){
    int age = 34;
    char sex = 'f';

    if(sex == 'f' ){

  System.out.println("Employee will work in Urban area " );
} else if(sex == 'm' && age>=20 && age<=40){

  System.out.println("Employee will work in any area " );
}else if(( sex=='m' && age >=40 && age <=60)){

  System.out.println("Employee will work in urban area" );

}else {

  System.out.println("Age error\n" );
}

  }
}
