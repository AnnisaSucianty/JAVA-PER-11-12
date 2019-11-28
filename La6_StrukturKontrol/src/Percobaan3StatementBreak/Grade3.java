package Percobaan3StatementBreak;

public class Grade3
{
    public static void main(String[] args )
    {
        String names[] = {"Beah", "Bianca", "Lance", "Belle",
            "Nico", "Yza", "Gem", "Ethan"};
        
        String          searchName = "Yza";
        boolean         foundName  = false;
        
        for( int i=0; i< names.length; i++ ){
            if( names[i].equals( searchName )){
                foundName = true;
            }
        }
        if( foundName ){
            System.out.println( searchName + " found!" );
        }
        else{
            System.out.println( searchName + " not found.");
        }
    }
}
    
