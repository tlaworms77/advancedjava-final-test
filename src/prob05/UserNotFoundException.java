package prob05;

public class UserNotFoundException extends Exception {
	@Override
	public String toString() {
		return "사용자를 찾을 수 없습니다.";
	}
}
