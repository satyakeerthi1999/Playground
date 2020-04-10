#include <iostream>
#include <bits/stdc++.h> 

int main()
{
    int a,b,c ;
    std::cin>>a>>b>>c ;
    int t = pow(a,b) ;
    if(t >= c)
      std::cout<<"Doctor, you can proceed with your experiment.";
    else
      std::cout<<"Sorry Doctor! You need more bacteria." ;
}
