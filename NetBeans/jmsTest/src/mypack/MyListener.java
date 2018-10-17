package mypack;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyListener implements MessageListener {

	public void onMessage(Message msg) {
		
        TextMessage m=(TextMessage)msg;
         try{
        	 System.out.println("Message received: "+m.getText());
        	
         }catch(JMSException e)
         {
        	e.getMessage();
      	 
         }
	}

}

