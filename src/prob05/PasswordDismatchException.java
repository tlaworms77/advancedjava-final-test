package prob05;

public class PasswordDismatchException extends Exception {
	@Override
	public String toString() {
		return "비밀번호가 틀렸습니다.";
	}
}
