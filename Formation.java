//java.lang
//System.out =>Ecran
//System.in =>Clavier
import java.util.Scanner;
public class Formation {
        //Declaration de variables => portée de classe
       public static void main(String args[]){
               /*
                System.out.println("Bonjour à Tous"); 
               System.out.println("les etudiants de la GLRS et MAE "); 
               //Scanner clavier pour lire les données tapeés au clavier
               Scanner clavier=new Scanner(System.in);
               System.out.println("Veuillez saisir un Mot");
               //Lire une donnée de type chaine 
               String prenom=clavier.next();
               System.out.println("Bonjour "+prenom); 
               
               //type primitifs ou de données  => int ,    float, double, char,      boolean 
               //classes wappers ou Enveloppes => Integer, Float, Double, Character, Boolean
               
               System.out.println("Veuillez saisir un entier");
               int x=clavier.nextInt();
               System.out.println("Le nombre est "+x); 
          
                
                 //Surcharge
                Rectangle r=new Rectangle();
                r.setLongueur(10);
                r.setLargeur(5);
                System.out.println("La Longueur est "+                   r.getLongueur());
                System.out.println("La Largeur est "+                    r.getLargeur());
                 System.out.println("Le Demi Perimetre est "+            r.demiPerimetre());
                 System.out.println("Le Perimetre est "+                 r.perimetre());
            System.out.println("La Surface est "+                        r.surface());
            System.out.println("La Diagonale est "+                      r.diagonale());
   */
int choix;
Rectangle rectangle=new Rectangle();
do{
              System.out.println("1- Ajout Rectangle");
              System.out.println("2- Lister Rectangle");
              System.out.println("3- Quitter");
              System.out.println("Faites votre choix");
              Scanner clavier=new Scanner(System.in);
              choix=clavier.nextInt();
            /* 
              if(choix==1){
               }
               if(choix==2){
              }
            */
         
           switch(choix){
            case 1:
              System.out.println("Veuillez saisir la Longeur");
                   double longueur=clavier.nextDouble();
              System.out.println("Veuillez saisir la Largeur");
                   double largeur=clavier.nextDouble();
                   rectangle.setLongueur(longueur);
                   rectangle.setLargeur(largeur);
             break;
            case 2:
                 System.out.println("La Longueur est "+rectangle.getLongueur());
                 System.out.println("La Largeur est "+rectangle.getLargeur());
                 System.out.println("Le Demi Perimetre est "+rectangle.demiPerimetre());
                 System.out.println("Le Perimetre est "+ rectangle.perimetre());
                 System.out.println("La Surface est "+ rectangle.surface());
                 System.out.println("La Diagonale est "+rectangle.diagonale());
             break;
           }

     } while(choix!=4);


                  
       }

}

/*Portée block
 {
    int var1=2;
    {
       int var2;
      //Possible
       int s=var1+var2;
    }
      //Impossible
       int s=var1+var2;//var2 n'existe pas dans ce bloc
 }
*/