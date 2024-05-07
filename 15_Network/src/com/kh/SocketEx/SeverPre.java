package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 채팅 시작 주최자
// port 2자리 3자리 4자리 컴퓨터에서 약속으로 지정한 숫자
public class SeverPre {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12370);
			
			Socket clientSocket = server.accept();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			String m ;//= in.readLine();
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				
				out.println("ccccccccccccc");
				
			}
			
			clientSocket.close();
			server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
