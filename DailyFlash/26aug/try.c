#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n1,n2,c1,c2,s1,s2,avg;
    scanf("%d %d",&n1,&n2);
    s1 = n1*n1;
    s2 = n2*n2;
    c1 = n1*n1*n1;
    c2 = n2*n2*n2;

    if(s1>s2>c1>c2){
     avg=(s2+c1)/2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                printf("%d ",avg);
                avg++;
            }printf("\n");
        }
        return 0;
    }else if(s1>s2>c2>c1){
        avg=(s2+c2)/2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                printf("%d ",avg);
                avg++;
            }printf("\n");
        }return 0;
    }else if(c1>c2>s2>s1){
        avg=(s2+c2)/2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                printf("%d ",avg);
                avg++;
            }printf("\n");
        }return 0;
    }else if(c1>c2>s2>s2){
        avg=(s2+c2)/2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                printf("%d ",avg);
                avg++;
            }printf("\n");
        }return 0;
    }else if(c1>s1>s2>c2){
        avg=(s2+s2)/2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                printf("%d ",avg);
                avg++;
            }printf("\n");
        }return 0;
    }else if(c2>s1>s2>c1){
        avg=(s1+s2)/2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                printf("%d ",avg);
                avg++;
            }printf("\n");
        }return 0;
    }





    return 0;
}
