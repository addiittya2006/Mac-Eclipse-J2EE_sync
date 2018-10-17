package mypack;

import javax.jms.*;
import javax.naming.InitialContext;

public class QReceiver {

    public static void main(String[] args) {
        try
        {
            InitialContext ctx = new InitialContext();
            QueueConnectionFactory f=(QueueConnectionFactory) ctx.lookup("myQueueFactory");
            QueueConnection con=f.createQueueConnection();
            con.start();
            QueueSession session=con.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
            Queue q=(Queue)ctx.lookup("myQueue");
            QueueReceiver receiver=session.createReceiver(q);
            MessageListener listener=new MyListener();
            receiver.setMessageListener(listener);
            System.out.println("Enter ^C to terminate...");
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
