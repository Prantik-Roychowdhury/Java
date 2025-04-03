package ExceptionHandling;

public class InvalidPinExceltion extends RuntimeException
{
    private String message;
    public InvalidPinExceltion(String message)
    {
        this.message = message;
    }
    public String getMessage()
    {
        return message;
    }
}
