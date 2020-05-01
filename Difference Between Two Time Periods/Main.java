#include<iostream>
using namespace std;
struct time{ int h, m, s; };
int main()
{
  //Type your code here.
  struct time a, b, c;
  std::cin >> a.h;
  std::cin >> a.m;
  std::cin >> a.s;
  std::cin >> b.h;
  std::cin >> b.m;
  std::cin >> b.s;
  c.h = a.h - b.h;
  c.m = a.m - b.m;
  c.s = a.s - b.s;
  
  if (c.s < 0) {
    c.m--;
    c.s += 60;
  }
  if (c.m < 0) {
    c.h--;
    c.m += 60;
  }
  
  std::cout << c.h << ":" << c.m << ":" << c.s;
}