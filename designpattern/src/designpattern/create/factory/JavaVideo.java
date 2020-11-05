package designpattern.create.factory;
/**
 * 商品实现
 * @author  陈雨龙
 * @email   jar_chen@163.com
 * @devtime 上午11:35:41
 *
 */
public class JavaVideo implements Video {

	@Override
	public void play() {
		System.out.println("观看java视频");

	}

}
