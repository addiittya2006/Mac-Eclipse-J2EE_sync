package mypack;

import javax.jms.*;

import javax.naming.InitialContext;
public class MyReceiver {

	public static void main(String[] args) {
		try
		{
			InitialContext ctx=new InitialContext();
			TopicConnectionFactory f=(TopicConnectionFactory)ctx.lookup("myTopicFactory");
			TopicConnection con=f.createTopicConnection();
			con.start();
			TopicSession ses=con.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
			Topic q=(Topic)ctx.lookup("myTopic");
			TopicSubscriber receiver=ses.createSubscriber(q);
			MyListener listener=new MyListener();
			receiver.setMessageListener(listener);
			System.out.println("Receiver is ready, waiting for messages...");
			System.out.println("press Ctrl+c to shutdown...");
			while(true)
			{
				
				Thread.sleep(1000);
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
	

	}

}
