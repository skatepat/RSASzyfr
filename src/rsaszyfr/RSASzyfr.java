/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsaszyfr;



public class RSASzyfr {

    private static void czekaj()
{
  char c[1];
  System.out.println("Podaj dane");
  cin.getline(c,1);
  cin.getline(c,1);	
}
    private static int nwd(int a, int b) {
{
            int t, nwd;
            while (b!=0)
        {
            t=b;
            b=a%b;
            a=t;
        }   
        nwd=a;
        return nwd;
        }    
    }

    private static int odwr_mod(int a, int n) {
        int a0,n0,p0,p1,q,r,t,odwr_mod;
            p0=0; 
            p1=1; 
            a0=a; 
            n0=n;
            q=n0/a0;
            r=n0%a0;
            while (r > 0) 
                t=p0-q*p1;
                if (t>=0)
                    t=t%n;
                else
                {
                t=n-((-t)%n);
                p0=p1; 
                p1=t;
                n0=a0; 
                a0=r;
                q=n0/a0;
                r=n0%a0;
                }
                odwr_mod=p1;
                return odwr_mod;
        
    }
     
        
    public static void main(String[] args) {
        
       int p,q,fi,n,e,d; 
       int[] pierwsze = {11,13,17,19,23,29,31,37,41,43};  
       do
       {
       p=pierwsze[1];
       q=pierwsze[2];
       }
       while(p!=q);
       
       fi=(p-1)*(q-1);
       n=p*q;
       
       for(e = 3; nwd(e,fi) != 1; e += 2);
         d = odwr_mod(e,fi);
         
       System.out.println("KLUCZ PUBLICZNY");
       System.out.println("wykladnik e = "+ e);   
       System.out.println("modul n = "+n);
       System.out.println("KLUCZ PRYWATNY");
       System.out.println("wykladnik d = "+d);
       
       
       
       
        
    }
    
}
