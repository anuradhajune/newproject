package org.phone;

public class Phone {
	private void phoneInfo() {
System.out.println("Brand : Nokia" );
	}
private void phoneInfo(long imei,String make) {
System.out.println("IMEI :"+ imei);
System.out.println("Made in "+ make);
}
private void phoneInfo(String email, long phno) {
System.out.println("Email :"+ email);
System.out.println("Phonenumber:"+ phno);

}
public static void main(String[] args) {
	Phone p=new Phone();
	p.phoneInfo();
	p.phoneInfo(123456789456l, "India");
	p.phoneInfo("nokia@gmail.com", 8945632145l);
	System.out.println("checking");
	System.out.println("new changes");
}

}
