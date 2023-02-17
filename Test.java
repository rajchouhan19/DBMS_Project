import java.util.*;
class  Test{
public static void main(String args[]){
int n=223, r,sum=0;
int temp=223;
while(n!=0)
{
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(sum==temp)
System.out.println("Armstrong Number");
else
System.out.println("non-armstrong");
}}