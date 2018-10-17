package mypack;

import javax.jms.*;
import javax.jms.MessageListener;

public class MyListener implements MessageListener {

	public void onMessage(Message msg) {
		
        TextMessage m=(TextMessage)msg;
         try{
        	 System.out.println("following msgggggggg  received: "+m.getText());
        	
         }catch(JMSException e)
         {
        	e.getMessage();
      	 
         }
	}

}

