package mypack;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import javax.naming.*;
	import javax.jms.*;
	public class MySender {
	
		public static void main(String[] args) {
			try
			{
				InitialContext ctx=new InitialContext();
				TopicConnectionFactory f=(TopicConnectionFactory)ctx.lookup("myTopicFactory");
				TopicConnection con=f.createTopicConnection();
				con.start();
				TopicSession ses=con.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
				Topic q=(Topic)ctx.lookup("myTopic");
				TopicPublisher sender=ses.createPublisher(q);
				TextMessage msg=ses.createTextMessage();
				BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
				while(true)
				{
					System.out.println("Enter Msg, end to terminate:");
					String s=b.readLine();
					if (s.equals("end"))
						break;
					msg.setText(s);
					sender.publish(msg);
					System.out.println("Message successfully sent.");
					
				}
				con.close();
			}catch(Exception e)
			{
				System.out.println(e);
				System.out.print("errrrrrrrrroooooooorrrrr");
			}

		}

	}

