package q1;

public abstract class Note
{
   private String message;
   
   public Note(String message)
   {
      this.message =message;
   }
   public String getMessage()
   {
      return message;
   }
   public abstract Note copy();
   
   public String toString()
   {
      return "Message " + message;
   }
}