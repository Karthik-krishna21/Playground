#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
  char str[100];
  int c=0, l, i;
  std::cin.getline (str, 100);
  l=strlen(str);
  for (i=0; i<l; i++)
    if (str[i] == ' ')
      c++;
  c<10 ? std::cout << "Caption eligible for the contest" : std::cout << "Caption not eligible for the contest";
}