#include<iostream>
#include <algorithm> 
#include <bits/stdc++.h> 
using namespace std;
int main()
{
int a;string c;
getline(cin,c);
cin>>a;
if(c=="rear" && a==1)cout<<"Right Handed";  
else if(c=="front")cout<<((a==1)?"Left Handed":"Right Handed");
else cout<<((a==2)?"Right Handed":"Left Handed");
}