
package polargenerator;

public class Polargenerator {
boolean nincsTárolt = true;
double tárolt;

    public Polargenerator(){
    nincsTárolt = true;
    }
   public double kovetkezo(){
   if(nincsTárolt) {
            
            double u1, u2, v1, v2, w;
            do {
                u1 = Math.random();
                u2 = Math.random();
                
                v1 = 2*u1 - 1;
                v2 = 2*u2 - 1;
                
                w = v1*v1 + v2*v2;
                
            } while(w > 1);
            
            double r = Math.sqrt((-2*Math.log(w))/w);
            
            tárolt = r*v2;
            nincsTárolt = !nincsTárolt;
            
            return r*v1;
            
        } else {
            nincsTárolt = !nincsTárolt;
            return tárolt;
        }
   
   }
    
    public static void main(String[] args) {
       Polargenerator g = new Polargenerator();
        for(int  i=0; i<6;i++)
            System.out.println(g.kovetkezo());
           }
    
}
