
package week2.homework;

public enum YesNo 
{
    Yes(1),No(0);
    
    private int score;

    private YesNo(int score) 
    {
        this.score = score;
    }

    public int getScore() 
    {
        return score;
    }
    
}
