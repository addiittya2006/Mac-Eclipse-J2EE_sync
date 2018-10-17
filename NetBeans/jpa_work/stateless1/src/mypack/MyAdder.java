package mypack;
import javax.ejb.*;
@Remote
public interface MyAdder 
{
    int sum( int x ,int  y );
}
