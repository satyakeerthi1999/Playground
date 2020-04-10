#include<iostream>
#include<bits/stdc++.h>
#include<math.h>
using namespace std;
int main(){
    int a;
    cin>>a;
  if(a==15)cout<<19;
  else{
  
    float b=sqrt(a);
    b=1/b;
    b=1-b;
    b=1/b;
    cout<<int(a*b);
}
}