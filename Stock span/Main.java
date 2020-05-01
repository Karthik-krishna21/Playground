#include<iostream>
using namespace std;
void stockSpan(int,int*);
int main()
{
  int days,sum=2;
  cin>>days;
  int a[days];
  for(int i=0;i<days;i++)
    cin>>a[i];
 cout<<"1\n";
  for (int i = 1; i < days; i++)  
    {  
       if(!i)
         cout<<"1\n";
       else if(a[i]>a[i-1])
       {
         cout<<sum<<"\n";
         sum +=2;
       }
       else
         cout<<"1\n";
    }  
}