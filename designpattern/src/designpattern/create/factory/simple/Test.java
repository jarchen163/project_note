package designpattern.create.factory.simple;
/**
 * 只是一个简单的工厂模式的测试例子
 * @author  陈雨龙
 * @email   jar_chen@163.com
 * @devtime 上午10:11:10
 *
 */
public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Video javaVideo = VideoFactor.getVideo("java");
		javaVideo.play();
		Video pythony = VideoFactor.getVideo("pythony");
		pythony.play();
		//采用类加载机制实现
		Video javaVideo1 = VideoFactor.getClassVideo("designpattern.create.factory.simple.JavaVideo");
		javaVideo1.play();
				
				
	}
}
