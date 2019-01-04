package prob05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add( new User( "john", "1234") );
		
		System.out.println("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();
		
		/*
		 *  로그인 처리 부분을 완성 합니다.
		 */
		try {
			login(joinUsers, new User(id, password));
		} catch (UserNotFoundException e) {
			System.out.println(e);
			return;
		} catch (PasswordDismatchException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return;
		}
		System.out.println("로그인 성공");
		

	}
	// return 값을 받아서 처리하는 것이 정석 이것은 exception 연습하기위한 코드
	public static void login(List<User> users, User user ) throws UserNotFoundException, PasswordDismatchException {
		if( !users.contains(user) ){
			throw new UserNotFoundException();
		}
		
		User savedUser = users.get( users.indexOf( user ) );
		
		if( !savedUser.getPassword().equals( user.getPassword()) ){
			throw new PasswordDismatchException();
		}
	}
}
