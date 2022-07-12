#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int a,b;
    scanf("%d",&a);
    scanf("%d",&b);
    if(a>b || a == b){

        printf("INVALID RANGE");
        return 0;
    }else{
        int sum1=0,sum2=0,cnt=0;
    for(int i=a;i<=b;i++){

        if(i%2==0){
          sum1=sum1+i;

        }
        else{
           sum2=sum2+i;

        }

    }
        if(sum1>sum2){

            for(int i=a;i<=b;i++){
                if(i%2==0){
                    if(cnt==5){
                        printf("\n");
                        cnt=0;
                    }
                    printf("%d ",i);
                    cnt++;

                 }
            }

        }
       else{
           for(int i=a;i<=b;i++){
                if(i%2!=0){
                   if(cnt==5){
                        printf("\n");
                        cnt=0;
                    }
                    printf("%d ",i);
                    cnt++;

                }

           }
       }
    }
    return 0;

}
