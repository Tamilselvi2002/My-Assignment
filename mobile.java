package week1.day1;

public class mobile {
public void SendMessage() {
	System.out.println("send message");
}
public void shareDocument() {
	System.out.println("share document");
}
public void makeCall() {
	System.out.println("make call");
}
public static void main(String[] args) {
	mobile redmi=new mobile();
	redmi.SendMessage();
	redmi.shareDocument();
	redmi.makeCall();
}
}
