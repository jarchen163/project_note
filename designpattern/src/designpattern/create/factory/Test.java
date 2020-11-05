package designpattern.create.factory;
/**
 * 只是一个简单的工厂模式的测试例子
 * @author  陈雨龙
 * @email   jar_chen@163.com
 * @devtime 上午10:11:10
 *
 */
public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		 new JavaVideoFactory().getVideo().play();
				
				
	}
}
