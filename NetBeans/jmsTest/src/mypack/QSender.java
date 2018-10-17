package mypack;

import javax.jms.*;
import javax.naming.InitialContext;
import java.util.Scanner;

public class QSender {


	public static void main(String[] args) {
		try
		{
			InitialContext ctx=new InitialContext();
			QueueConnectionFactory f=(QueueConnectionFactory) ctx.lookup("myQueueFactory");
			QueueConnection con=f.createQueueConnection();
			con.start();
			QueueSession session=con.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
			Queue q=(Queue)ctx.lookup("myQueue");
			QueueSender sender=session.createSender(q);
			TextMessage msg=session.createTextMessage();
			Scanner in=new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter message, end to terminate...");
				String str=in.nextLine();
				if (str.equals("end"))
					break;
				msg.setText(str);
				sender.send(msg);
				System.out.println("successfully sent.");
			}
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);

		}
	}

}
