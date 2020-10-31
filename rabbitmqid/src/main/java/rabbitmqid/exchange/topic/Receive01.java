package rabbitmqid.exchange.topic;



import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Receive01 {
    public static void main(String[] args) {
        ConnectionFactory factory=new ConnectionFactory();
        factory.setHost("192.168.115.130");
        factory.setPort(5672);
        factory.setUsername("root");
        factory.setPassword("root");
        Connection connection=null;
        Channel channel=null;
        try {
            connection=factory.newConnection();
            channel=connection.createChannel();
            /**
             * Topic ���͵Ľ�����Ҳ����Ϣһ�Զ��һ�ֽ��������ͣ�����fanout����ʵ��һ����Ϣͬʱ���͸��������
             * fanout���ʺ���ʹ����һ�����ܲ�ͬ�Ľ�������ȡ���ݣ������ֻ�App�е���Ϣ���ͣ�һ��App���ܻỹ�к�
             * ����û������а�װȻ�����Ƕ�������һ������Ķ������������Լ�������
             * Topic���ʺϲ�ͬ�Ĺ���ģ��������ͬһ����Ϣ�������̳��µ��ɹ��Ժ���Ҫ������Ϣ�������С�����RoutingKey
             * Ϊ ��order.success,����ϵͳ��������order.* ��Ʊϵͳ����order.*
             *
             * Topic����ʹ������Ķ�����Ҳ����ʹ��һ����ȷ�Ķ��������������Ӧ���ںͶ����йصĹ����У��������и�
             * ��ȡ�Ķ���������Ҫ��Ϊ�־û��Ķ���
             */
            channel.queueDeclare("topicQueue01",true,false,false,null);
            channel.exchangeDeclare("topicExchange","topic",true);
            channel.queueBind("topicQueue01","topicExchange","aa");
            channel.basicConsume("topicQueue01",true,"",new DefaultConsumer(channel){
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message=new String(body);
                    System.out.println("Receive01������aa ---"+message);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}