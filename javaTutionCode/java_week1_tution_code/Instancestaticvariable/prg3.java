class Home{
    //instance variable
    int mob=1;
    //static variable
    static int tv=1;

void abhijeetmethod(){

     System.out.println("MOB = "+ mob);
     System.out.println("TV = "+ tv);
}
void sanjanamethod(){

     System.out.println("MOB = "+ mob);
     System.out.println("TV = "+ tv);
}
public static void main(String[] args){
     Home sanjana=new Home();
     sanjana.tv=0;

     Home abhijeet=new Home();
     abhijeet.mob=0;
     abhijeet.abhijeetmethod();

     sanjana.sanjanamethod();
}


}
