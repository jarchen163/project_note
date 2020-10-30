package rabbitmqid.exchange;


import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

	public static void main(String[] args) {
		ConnectionFactory connectionFactor = new ConnectionFactory();
		/**
		 * 
		 */
		connectionFactor.setHost("192.168.0.93");
		connectionFactor.setPort(5672);
		connectionFactor.setUsername("root");
		connectionFactor.setPassword("123456");
		
		Connection conn = null;
		Channel channel = null;
		try {
			conn = (Connection) connectionFactor.newConnection();
			channel = conn.createChannel();
			
			//channel.queueDeclare("testqueue2", true, false, false, null);
			String message = "d发送的消息";
			channel.basicPublish("", "testqueue2", null, message.getBytes("utf-8"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				channel.close();
				conn.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
