package designpattern.create.factory;

public class JavaVideoFactory implements VideoFactor {

	@Override
	public Video getVideo() {
		// TODO Auto-generated method stub
		return new JavaVideo();
	}

}
