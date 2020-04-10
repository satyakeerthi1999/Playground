#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
    int temp = n,t1=n;
    int x,t = 0;
    while(n!=0)
    {
      x = n%10;
      t=t+1;
      n=n/10;
    }
    int s=0;
    while(temp!=0)
    {
       int y = temp%10;
       s = s+power(y,t);
      temp = temp/10;
    }
    if(s==t1)
      return 1;
    else
      return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}