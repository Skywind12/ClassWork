package p1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<String> nameList1 = new ArrayList<String>();
		nameList1.add("Adam");
		nameList1.add("Bill");
		nameList1.add("Kathy");
		nameList1.add("Joe");

		ServerSocket listener = new ServerSocket(9000);
		System.out.println("waiting from client connection");
		Socket socket = listener.accept(); // accept request
		//established connection to the client ready to send data
		ObjectOutputStream outputToClient = 
				new ObjectOutputStream(socket.getOutputStream());
		//established connection to the client ready to receive data
		ObjectInputStream inputFromClient = 
				new ObjectInputStream(socket.getInputStream());
	
		System.out.println("sending out an object");
		outputToClient.writeObject(nameList1);
		outputToClient.flush();
		ArrayList<String> nameList2 = (ArrayList<String>)inputFromClient.readObject();
		System.out.println(nameList2);
	}

}
