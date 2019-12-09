package p1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<String> nameList1 = new ArrayList<String>();
		
		//created a server socket to connect to
		Socket socket = new Socket("localhost",9000);
		
		ObjectOutputStream outputToServer = new ObjectOutputStream(socket.getOutputStream());
		
		ObjectInputStream inputFromServer = new ObjectInputStream(socket.getInputStream());

		nameList1 = (ArrayList)inputFromServer.readObject();
		nameList1.add("Carl");
		outputToServer.writeObject(nameList1);
		System.out.println("the edited name list was sent to the server");
	}

}
