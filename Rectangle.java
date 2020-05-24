public class Rectangle extends Figure{
  
 
 
    public Rectangle (){
    }

   //Surchage

    public Rectangle (double longueur){
       this.longueur=longueur;
   }

    public Rectangle (double largeur){
       this.largeur=largeur;
   }

   
 
    @Override
      public double demiPerimetre(){  
         return this.longueur + this.largeur;
    } 
    
    @Override   
      public double surface(){  
         return this.longueur * this.largeur;
      } 

    @Override
      public double diagonale(){  
        return Math.sqrt (longueur* longueur + largeur * largeur);
      }  

}