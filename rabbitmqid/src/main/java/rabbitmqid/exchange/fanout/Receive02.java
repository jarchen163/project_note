package rabbitmqid.exchange.fanout;


import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Receive02 {
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
             * ����Fanout���͵Ľ���������Ϣʱ�����ڹ㲥��ģʽ��������Ҫ��RoutingKey
             * ���ֿ��ܻ��кܶ����������������������е����ݣ�������Ǵ�������ʱҪ����
             * һ������Ķ�������
             *
             * û�в�����queueDeclare�����ᴴ��һ������Ϊ�����һ������
             * ������е�����ʱ�ǳ־û�
             * ������ģ�ͬʱ���ֻ������һ�������߼�����ǰ���У�
             * �Զ�ɾ���� ��û���κ������߼�������ʱ������л��Զ�ɾ��
             *
             * getQueue() �������ڻ�ȡ�������Ķ�����
             */
            String queueName= channel.queueDeclare().getQueue();
            channel.exchangeDeclare("fanoutExchange","fanout",true);
            //���������Ķ��а󶨵��������У� ������fanout���͵Ľ�������˲���ָ��RoutingKey���а�
            channel.queueBind(queueName,"fanoutExchange","");
            /**
             * ����ĳ�����в���ȡ�����е�����
             * ע�⣺
             *   ��ǰ�������Ķ��б����Ѿ����ڲ���ȷ�İ󶨵���ĳ����������
             */
            channel.basicConsume(queueName,true,"",new DefaultConsumer(channel){
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message=new String(body);
                    System.out.println("Receive02������ ---"+message);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
