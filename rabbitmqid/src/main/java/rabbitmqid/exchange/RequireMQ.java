package rabbitmqid.exchange;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.AMQP.BasicProperties;

public class RequireMQ {
	public static void main(String[] args) {
		ConnectionFactory connectionFactor = new ConnectionFactory();
		/**
		 * 杩炴帴閰嶇疆淇℃伅
		 */
		connectionFactor.setHost("192.168.0.93");
		connectionFactor.setPort(5672);
		connectionFactor.setUsername("root");
		connectionFactor.setPassword("123456");
		
		
		Connection con = null;
		Channel channel = null;
		
		try {
			con = connectionFactor.newConnection();
			channel = con.createChannel();
			channel.queueDeclare("testqueue2", true, false, false, null);
			
			//鎺ユ敹娑堟伅
			channel.basicConsume("testqueue2", true, new DefaultConsumer(channel) {
				//娑堟伅鐨勬帴鏀�
				@Override
				public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
						byte[] body) throws IOException {
					String message = new String(body,"utf-8");
					System.out.println(message);
				}
				
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
