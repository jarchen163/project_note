package designpattern.create.factory.simple;
/**
 * 
 * @author  ������
 * @email   jar_chen@163.com
 * @devtime ����10:07:15
 *
 */
public class VideoFactor {
	
	/**
	 * ��ȡ��Ʒ�ķ���һ��
	 * �ַ���ƥ�䷨
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
	 * ͨ��class������ػ�����ɴ���
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
