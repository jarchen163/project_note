package designpattern.create.factory.simple;
/**
 * 
 * @author  陈雨龙
 * @email   jar_chen@163.com
 * @devtime 上午10:07:15
 *
 */
public class VideoFactor {
	
	/**
	 * 获取产品的方法一：
	 * 字符串匹配法
	 * @param name
	 * @return
	 */
	public static Video getVideo(String name) {
		if(name.equals("java")) {
			return new JavaVideo();
		}else if(name.equals("pythony")) {
			return new PythonyVideo();
		}
		return null;
	}
	/**
	 * 通过class的类加载机制完成代理
	 * @param classPath
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static Video getClassVideo(String classPath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName(classPath);
		return (Video) clazz.newInstance();
		
	}

}
