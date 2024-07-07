package serverclient;
import java.net.InetAddress;

public class TestReachablity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String hostname="www.google.com";
			InetAddress address= InetAddress.getByName(hostname);
			if(address.isReachable(5000)) {
				System.out.println("Host"+hostname+"is reachable");
			}else {
				System.out.println("Host"+hostname+"is not reachable");
				
			}
		}catch(Exception e) {
				System.out.println("Exception"+e.getMessage());
			}
		}
	}


