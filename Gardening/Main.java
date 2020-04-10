#include<iostream>
using namespace std;
int main()
{
  //Type your code here.int a,b;
  int a,b,c;
  cin>>a>>b>>c;
  if((c<=2*a && c>a) ||(c<=(b-1)*a && c>(b-2)*a))
    cout<<"It is a mango tree";
  else cout<<"It is not a mango tree";
}
