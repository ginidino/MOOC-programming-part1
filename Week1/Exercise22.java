package WEEK1;

import java.util.Scanner;
import java.io.*;

// Password
// asks the user for a password
// 22.1 Asking for the password
// 22.2 Asking for the password until the user gives the correct one (using while loop)
// 22.3 Add your own secret message to the program and show it to the user when the password is correct
public class Exercise22 {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		String password = "carrot";
		//22.2
		while(true) {
			System.out.print("Type the password: ");
			String readPassword = reader.nextLine();
			//22.1
			if(readPassword.equals(password)) {
				System.out.println("Right!");
				break;
			} else {
				System.out.println("Wrong!");
			}
		}
		//22.3 
		System.out.println("The secret is: jryy qbar!");
		System.out.println("Type a secret code ");
		System.out.print(secret());
	}

	public static StringBuilder secret() throws IOException {
		// reference: https://velog.io/@kimmjieun/%EB%B0%B1%EC%A4%80-11655%EB%B2%88-ROT13-Java-%EC%9E%90%EB%B0%94
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] rot13 = br.readLine().toCharArray();
        for (int i = 0; i < rot13.length; i++) {
            if (rot13[i] >= 'A' && rot13[i] <= 'Z') {
                if (rot13[i] >= 'N') {
                    rot13[i] -= 13;
                } else {
                    rot13[i] += 13;
                }
            } else if (rot13[i] >= 'a' && rot13[i] <= 'z') {
                if (rot13[i] >= 'n') {
                    rot13[i] -= 13;
                } else {
                    rot13[i] += 13;
                }
            }
        }

        for (char i : rot13)
            sb.append(i);
		return sb;
	} 
}
