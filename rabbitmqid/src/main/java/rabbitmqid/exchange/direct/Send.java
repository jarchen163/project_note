package rabbitmqid.exchange.direct;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {
    public static void main(String[] args) {
        ConnectionFactory factory=new ConnectionFactory();
        factory.setHost("192.168.0.93");
        factory.setPort(5672);
        factory.setUsername("root");
        factory.setPassword("123456");

        Connection connection=null;
        Channel channel=null;

        try {
            connection=factory.newConnection();
            channel=connection.createChannel();

            channel.queueDeclare("myDirectQueue",true,false,false,null);
            /**
             * ����һ��������
             * ���� 1 Ϊ������������ȡֵ����
             * ���� 2 Ϊ������������ ȡֵΪ direct��fanout��topic��headers
             * ���� 3 Ϊ�Ƿ�Ϊ�־û�������
             * ע�⣺
             *    1������������ʱ������������Ӧ�������������������������������������������
             *    2����������ǿ��п��޵ĵ�����ʹ��ǰ����Ҫȷ�����������������
             */
            channel.exchangeDeclare("directExchange","direct",true);
            /**
             * �����а󶨵�������
             * ���� 1 Ϊ���е�����
             * ���� 2 Ϊ����������
             * ���� 3 Ϊ��Ϣ��RoutingKey ������BindingKey��
             * ע�⣺
             *   1���ڽ��ж��кͽ�������ʱ����Ҫȷ���������Ͷ����Ѿ��ɹ�������
             */
            channel.queueBind("myDirectQueue","directExchange","directRoutingKey");
            String message="1direct�Ĳ�����Ϣ��";
            /**
             * ������Ϣ��ָ���Ķ���
             * ���� 1 Ϊ����������
             * ���� 2 Ϊ��Ϣ��RoutingKey ��������Ϣ��RoutingKey��ĳ�������뽻�����󶨵�RoutingKeyһ����ô
             *       �����Ϣ�ͻᷢ�͵�ָ���Ķ�����
             * ע�⣺
             *   1��������Ϣʱ����ȷ���������Ѿ���������ȷ���Ѿ���ȷ�İ󶨵���ĳ������
             */
            channel.basicPublish("directExchange","directRoutingKey",null,message.getBytes("utf-8"));
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
