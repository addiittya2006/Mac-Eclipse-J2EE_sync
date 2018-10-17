package mypack;
import javax.ejb.*;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import java.sql.*;

@MessageDriven(name="myMDB",activationConfig={
				@ActivationConfigProperty(
				propertyName="connectionFactoryJndiName",
				propertyValue="myTopicFactory"
				),
				@ActivationConfigProperty(
				propertyName="destinationType",
				propertyValue="javax.jms.Topic"),
				@ActivationConfigProperty(
				propertyName="destinationName",
				propertyValue="myTopic")},mappedName="myTopic")
	
/*

@MessageDriven(name="myMDB",activationConfig={
@ActivationConfigProperty(
propertyName="connectionFactoryJndiName",
propertyValue="myQueueFactory"
),
@ActivationConfigProperty(
propertyName="destinationType",
propertyValue="javax.jms.Queue"),
@ActivationConfigProperty(
propertyName="destinationName",
propertyValue="myQueue")},mappedName="myQueue")

*/
				
public class MyMessageBean implements MessageListener {

	public void onMessage(Message m) {
		TextMessage msg=(TextMessage)m;
		try{		
			saveMessage(msg.getText());
	
		}catch(Exception e)
		{
			
		e.printStackTrace();	
		}

	}
public void saveMessage(String msg)
{
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		PreparedStatement stmt=con.prepareStatement("insert into msginfo values(?)");
	stmt.setString(1,msg);
	stmt.executeUpdate();
	con.close();
	}catch(Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
		
	}
}
}
