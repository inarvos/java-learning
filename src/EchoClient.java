import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class EchoClient {
	
	public static void main(String... args) throws IOException {
		
		InetAddress inetAddress = Inet4Address.getLocalHost();
		Socket socket = new Socket(inetAddress, EchoServer.PORT);
		
		SocketAddress endpoint = InetSocketAddress.createUnresolved(inetAddress.getHostAddress(), EchoServer.PORT);
		
		socket.connect(endpoint);		

		if (socket.isConnected()) {
			OutputStream os = socket.getOutputStream();
			
			PrintStream stream = new PrintStream(os);
			
			stream.println("close\r\n");
			
			stream.close();
			
		}
		

		socket.close();
		
	}

}
