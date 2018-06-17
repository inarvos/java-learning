import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	
	public static final String IP = "127.0.0.1";
	public static final int PORT = 12345;

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(PORT);
		
		Socket socket = null;
		
		while((socket = ss.accept()) != null) {
			
			InputStream inputStream = socket.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			
			String message = br.readLine();
			
			if ("close".equalsIgnoreCase(message)) {
				break;
			} else {
				System.out.println(message);
			}
			
			br.close();
			
			if (inputStream != null) {
				inputStream.close();	
			}
		}
		
		ss.close();

	}

}
