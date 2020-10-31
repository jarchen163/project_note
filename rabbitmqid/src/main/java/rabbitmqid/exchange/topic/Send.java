package rabbitmqid.exchange.topic;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {
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
             * ����ʹ��Fanout���͵Ľ������������Ϣ�Ľ��շ����ܻ��ж����˲���������Ϣ����ʱ����������
             * �Լ��󶨽��������������������д������в��󶨽�����
             * ���Ƿ�����Ϣʱ����Ӧ��ȷ��������ʱ����
             */
            channel.exchangeDeclare("topicExchange","topic",true);
//

            String message="topic�Ĳ�����Ϣ��";
            /**
             * ������Ϣ��ָ���Ķ���
             * ���� 1 Ϊ����������
             * ���� 2 Ϊ��Ϣ��RoutingKey ��������Ϣ��RoutingKey��ĳ�������뽻�����󶨵�RoutingKeyһ����ô
             *       �����Ϣ�ͻᷢ�͵�ָ���Ķ�����
             * ע�⣺
             *   1��������Ϣʱ����ȷ���������Ѿ���������ȷ���Ѿ���ȷ�İ󶨵���ĳ������
             */
            channel.basicPublish("topicExchange","aa.bb.cc",null,message.getBytes("utf-8"));
            System.out.println("��Ϣ���ͳɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            if(channel!=null){
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

