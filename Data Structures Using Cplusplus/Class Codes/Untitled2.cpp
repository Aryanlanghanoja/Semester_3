#include<iostream>
using namespace std;

int main()
{
	int n,r,nfact=1,nrfact=1,rfact=1;
	
	cout << "Enter The Value Like N:- " ;
	cin >> n ;
	
	cout << "Enter The Value Like R:- " ;
	cin >> r ;
	
	for(int i=1;i<=n;i++)
	{
		nfact = nfact*i;
	}
	
	for(int i=1;i<=(n-r);i++)
	{
		nrfact = nrfact*i;
	}
	
	for(int i=1;i<=r;i++)
	{
		rfact = rfact*i;
	}
	
	int ans = nfact/(rfact*nrfact) ;
	
	cout << n << " C " << r << " = " << ans ;
	return 0;
}