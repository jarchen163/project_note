package designpattern.create.factory.simple;
/**
 * ֻ��һ���򵥵Ĺ���ģʽ�Ĳ�������
 * @author  ������
 * @email   jar_chen@163.com
 * @devtime ����10:11:10
 *
 */
public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Video javaVideo = VideoFactor.getVideo("java");
		javaVideo.play();
		Video pythony = VideoFactor.getVideo("pythony");
		pythony.play();
		//��������ػ���ʵ��
		Video javaVideo1 = VideoFactor.getClassVideo("designpattern.create.factory.simple.JavaVideo");
		javaVideo1.play();
				
				
	}
}
