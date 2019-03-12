package tst.project.test;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Send {

    private final static String QUEUE_NAME = "hello4";

    public static void main(String[] args) throws Exception {
    	 Connection connection = ConnectionUtil.getConnection();
         Channel channel = connection.createChannel();
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            
            for (int i = 0; i < 50; i++) {
                String message = "gx11" + i;
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
                System.out.println("send" + message + "'");

                Thread.sleep(i * 100);
            }
            channel.close();
            connection.close();
           
    }
}