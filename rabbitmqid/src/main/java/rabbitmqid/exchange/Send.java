package rabbitmqid.exchange;


import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

	public static void main(String[] args) {
		//鍒涘缓杩炴帴宸ュ巶
		ConnectionFactory connectionFactor = new ConnectionFactory();
		/**
		 * 杩炴帴閰嶇疆淇℃伅
		 */
		connectionFactor.setHost("192.168.0.93");
		connectionFactor.setPort(5672);
		connectionFactor.setUsername("root");
		connectionFactor.setPassword("123456");
		
		Connection conn = null;//瀹氫箟杩炴帴
		Channel channel = null;//瀹氫箟淇￠亾
		try {
			conn = (Connection) connectionFactor.newConnection();
			channel = conn.createChannel();
			
			//澹版槑涓�涓槦鍒�
			//channel.queueDeclare("testqueue2", true, false, false, null);
			String message = "df鎴戠殑绗竴涓秷鎭�2f22";
			//鍙戦�佹秷鎭埌mq
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
