import java.util.Scanner;
import java.util.Random;

class Menu {
	protected String name;
	protected long contact = 6366569607L;
	protected String ReciverAddress;
	private String email;
	private String address;
	private String password = "123";
	protected int CVV;
	protected Long DebitCardNo=123456789L;
	public String ExpiryDate;
	public int Quantity;
	public int OTP;
	static double totalBill;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your contact number");
		contact = sc.nextLong();
		if (contact > 999999999 && contact < 10000000000L) {
			System.out.println("Contact number is valid");
		} else {
			System.err.println("Please enter 10 digit!! Try Again");
			setContact();
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public int CVV() {
		return CVV;
	}

	public void setCVV(int CVV) {
		this.CVV = CVV;
	}
	public Long getDebitCardNo() {
		return DebitCardNo;
	}

	public void setDebitCardNo(Long DebitCardNo) {
		this.DebitCardNo = DebitCardNo;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(String ExpiryDate) {
		this.ExpiryDate= ExpiryDate;
	}

	public void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();
		setContact();
		System.out.println("Enter your email");
		email = sc.nextLine();
		System.out.println("Enter your address");
		address = sc.nextLine();
		System.out.println("Enter strong password");
		password = sc.nextLine();
		System.out.println("Signup Successfull");
		System.out.println("Please Proceed for Login");
		login();
	}
	
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 to use contact for login");
		System.out.println("Press 2 to use email for login");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Enter the contact");
			long contact = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter the password");
			String pass = sc.nextLine();
			if (this.contact == contact && this.password.equals(pass)) {
				System.out.println("Login Successful");
			} else {
				System.err.println("User Credentials Incorrect");
				login();
			}

		} else if (n == 2) {
			System.out.println("Enter the Email");
			sc.nextLine();
			String email = sc.nextLine();
			System.out.println("Enter the password");
			String pass = sc.nextLine();
			if (this.email.equals(email) && this.password.equals(pass)) {
				System.out.println("Login Successful");
			} else {
				System.err.println("User Credentials Incorrect");
				login();
			}
		} else {
			System.err.println("Wrong Choice!!! Please try again");
			login();
		}
	}

public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Available Products");
		System.out.println("Press 1 for Mobiles ");
		System.out.println("Press 2 for Electronics");
		System.out.println("Press 3 for TV & Appliances");
		System.out.println("Press 4 for Homes and Kitchen");
		System.out.println("Press 5 for Exit");
		System.out.println("**********************************************************");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			Mobile s = new Mobile();
			s.MobileMenu();
			break;
		case 2: 
			Electronics el=new Electronics();
			el.ElectronicsMenues();
			break;
		case 3: 
			Tv_Appliances tv=new Tv_Appliances();
			tv.Tv_AppliancesBrands();
			break;
		case 4: 
			Homes_Kitchen hom=new Homes_Kitchen();
			hom.Homes_KitcheBrands();
			break;
		case 5:
			System.out.println("*******************************************************");
			System.out.println("*************** Thank You for visiting ****************");
			System.out.println("*******************************************************");
			System.exit(0);
			break;
		default:
			System.err.println("Try Again!!!");
			menu();
			break;
		}
	}
}
class Mobile extends Menu {
	public void MobileMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Avaialble Brands");
		System.out.println("Press 1 for I Phone");
		System.out.println("Press 2 for Samsung");
		System.out.println("Press 3 for Poco");
		System.out.println("Press 4 for Vivo");
		System.out.println("Press 5 for Realme");
		System.out.println("***********************************************************");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			Iphone vs = new Iphone();
			vs.IphoneMobile();
			break;
		case 2: //
			SamsungPhone ref=new SamsungPhone();
			ref.Samsung();
			break;
		case 3:
			POCO ref1= new POCO();
			ref1.POCOPhones();
			break;
		case 4:
			Vivo ref2=new Vivo();
			ref2.VivoPhones();
			break;
		case 5:
			Realme ref3=new Realme();
			ref3.RealmePhones();
			break;
		default:
			System.err.println("Please Try Again!!!");
			MobileMenu();
			break;
		}
	}
}
class Iphone extends Mobile {
	public void IphoneMobile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for I Phone 11 Proc Max");
		System.out.println("Press 2 for I Phone 12 Proc Max");
		System.out.println("Press 3 for I Phone 13 Proc Max");
		System.out.println("Press 4 for I Phone 14 Proc Max");
		System.out.println("Press 5 for I Phone 15 Proc Max");
		System.out.println("Press 6 to go back");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Ipnone11();
			break;
		case 2:
			Iphone12();
			break;
		case 3:
			Iphone13();
			break;
		case 4:
			Iphone14();
			break;
		case 5:
			Iphone15();
			break;
		case 6:
			break;
		default:
			System.err.println("Please choose correct option");
			IphoneMobile();
			break;
		}
	}
// Iphone 11
	public void Ipnone11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for I Phone 11");
		System.out.println("Press 2 for I Phone 11 Pro");
		System.out.println("Press 3 for I Phone 11 Pro Max");
		System.out.println("Press 4 for go Back..");
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 11 ");
			System.out.println("Price : ₹48999");
			System.out.println("Color : Gray");
			System.out.println("RAM : 8GB");
			System.out.println("Choose Y to order or N to go back");
			System.out.println("**********************************************************");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 48999;
	
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					Ipnone11();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Ipnone11();
			} else {
				System.err.println("Please choose correct option");
				Ipnone11();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 11 Pro");
			System.out.println("Price : ₹88999");
			System.out.println("Color : Silver");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 88999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Ipnone11();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Ipnone11();
			} else {
				System.err.println("Please choose correct option");
				Ipnone11();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 11 Pro Max ");
			System.out.println("Price : ₹95999");
			System.out.println("Color : Gold");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 95999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Ipnone11();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Ipnone11();
			} else {
				System.err.println("Please choose correct option");
				Ipnone11();
			}
			break;
		case 4:
			IphoneMobile();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Ipnone11();
		}

	}
	
	
	
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}

//iphone12
	public void Iphone12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for I Phone 12");
		System.out.println("Press 2 for I Phone 12 Pro");
		System.out.println("Press 3 for I Phone 12 Pro Max");
		System.out.println("Press 4 for go Back..");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 12 ");
			System.out.println("Price : ₹50999");
			System.out.println("Color : Gray");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 50999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone12();
					break;
				case 2:
					menu();
					break;
				case 3:
					System.out.println("Please pay the amount");
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone12();
			} else {
				System.err.println("Please choose correct option");
				Iphone12();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 12 Pro");
			System.out.println("Price : ₹107999");
			System.out.println("Color : Silver");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 107999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone12();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone12();
			} else {
				System.err.println("Please choose correct option");
				Iphone12();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 12 Pro Max ");
			System.out.println("Price : ₹153999");
			System.out.println("Color : Gold");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 1539991;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone12();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone12();
			} else {
				System.err.println("Please choose correct option");
				Iphone12();
			}
			break;
		case 4:
			IphoneMobile();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Iphone12();
		}	
	}
	public void Iphone13() {
		System.out.println("**********************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for I Phone 13");
		System.out.println("Press 2 for I Phone 13 Pro");
		System.out.println("Press 3 for I Phone 13 Pro Max");
		System.out.println("Press 4 for go Back..");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 13 ");
			System.out.println("Price : ₹60999");
			System.out.println("Color : Gray");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 60999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone13();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone13();
			} else {
				System.err.println("Please choose correct option");
				Iphone13();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 13 Pro");
			System.out.println("Price : ₹149999");
			System.out.println("Color : Silver");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 149999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone13();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone13();
			} else {
				System.err.println("Please choose correct option");
				Iphone13();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 13 Pro Max ");
			System.out.println("Price : ₹179999");
			System.out.println("Color : Gold");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 1799991;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone13();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone13();
			} else {
				System.err.println("Please choose correct option");
				Iphone13();
			}
			break;
		case 4:
			IphoneMobile();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Iphone13();
		}	
		
	}
	public void Iphone14() {
		System.out.println("**********************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for I Phone 14");
		System.out.println("Press 2 for I Phone 14 Pro");
		System.out.println("Press 3 for I Phone 14 Pro Max");
		System.out.println("Press 4 for go Back..");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 14 ");
			System.out.println("Price : ₹79999");
			System.out.println("Color : Gray");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 79999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone14();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone14();
			} else {
				System.err.println("Please choose correct option");
				Iphone14();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 14 Pro");
			System.out.println("Price : ₹139999");
			System.out.println("Color : Silver");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 139999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone14();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone14();
			} else {
				System.err.println("Please choose correct option");
				Iphone14();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 14 Pro Max ");
			System.out.println("Price : ₹189999");
			System.out.println("Color : Gold");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 1899991;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone14();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone14();
			} else {
				System.err.println("Please choose correct option");
				Iphone14();
			}
			break;
		case 4:
			IphoneMobile();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Iphone14();
		}	
		

	}
	public void Iphone15() {
		System.out.println("**********************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for I Phone 15");
		System.out.println("Press 2 for I Phone 15 Pro");
		System.out.println("Press 3 for I Phone 15 Pro Max");
		System.out.println("Press 4 for go Back..");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Price of I Phone 15 ");
			System.out.println("Price : ₹79999");
			System.out.println("Color : Gray");
			System.out.println("RAM : 8GB");
			System.out.println("Choose Y to order or N to go back");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 79999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				sc.nextLine();
				switch (n) {
				case 1:
					Iphone15();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone15();
			} else {
				System.err.println("Please choose correct option");
				Iphone15();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 15 Pro");
			System.out.println("Price : ₹139999");
			System.out.println("Color : Silver");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 139999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone15();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone15();
			} else {
				System.err.println("Please choose correct option");
				Iphone15();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Price of I Phone 15 Pro Max ");
			System.out.println("Price : ₹199999");
			System.out.println("Color : Gold");
			System.out.println("RAM : 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 1999991;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Iphone15();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Iphone15();
			} else {
				System.err.println("Please choose correct option");
				Iphone15();
			}
			break;
		case 4:
			IphoneMobile();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Iphone15();
		}
	}
	
}

class SamsungPhone extends Mobile

{
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public  void Samsung() {
		System.out.println("**********************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Samsung Galaxy M51");
		System.out.println("Press 2 for Samsung Galaxy S20 FE");
		System.out.println("Press 3 for Samsung Galaxy S20 Plus");
		System.out.println("Press 4 for Samsung Galaxy Note 20 Ultra");
		System.out.println("Press 5 for Samsung Galaxy Note 20 Ultra 5G");
		System.out.println("Press 6 to go back");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Press 1 for Samsung Galaxy M51");
			System.out.println("Price : 28999");
			System.out.println("Color : Silver");
			System.out.println("RAM | 4GB ");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 28999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Samsung();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Samsung();
			} else {
				System.err.println("Please choose correct option");
				Samsung();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Press 2 for Samsung Galaxy S20 FE");
			System.out.println("Color : Silver");
			System.out.println("Price :279000");
			System.out.println("RAM |8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 27900;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Samsung();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Samsung();
			} else {
				System.err.println("Please choose correct option");
				Samsung();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Press 3 for Samsung Galaxy S20 Plus");
			System.out.println("Color : Silver");
			System.out.println("Price : 57999");
			System.out.println("RAm | 8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 200;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Samsung();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Samsung();
			} else {
				System.err.println("Please choose correct option");
				Samsung();
			}
			break;
		case 4:
			System.out.println("**********************************************************");
			System.out.println("Press 4 for Samsung Galaxy Note 20 Ultra");
			System.out.println("Price :104999");
			System.out.println("RAm |");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 200;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Samsung();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Samsung();
			} else {
				System.err.println("Please choose correct option");
				Samsung();
			}
			break;
		case 5:
			System.out.println("**********************************************************");
			System.out.println("Press 5 for Samsung Galaxy Note 20 Ultra 5G");
			System.out.println("Color : Silver");
			System.out.println("Price :166666");
			System.out.println("RAm |8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 200;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Samsung();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Samsung();
			} else {
				System.err.println("Please choose correct option");
				Samsung();
			}
			break;
			
		case 6:
			Samsung();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Samsung();
		}
	}
}
class POCO extends Mobile{
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public  void POCOPhones() {
		System.out.println("**********************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for POCO M6 Pro 5G");
		System.out.println("Press 2 for POCO F5 5G");
		System.out.println("Press 3 for POCO X4 Pro 5G");
		System.out.println("Press 4 for POCO F3 GT ");
		System.out.println("Press 5 for POCO F4 5G");
		System.out.println("Press 6 to go back");
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Press 1 for POCO M6 Pro 5G");
			System.out.println("Price : 12999");
			System.out.println("Color :Black");
			System.out.println("RAM | 8GB ");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 12999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					POCOPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				POCOPhones();
			} else {
				System.err.println("Please choose correct option");
				POCOPhones();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Press 2 for POCO F5 5G");
			System.out.println("Color : Silver");
			System.out.println("Price :22999");
			System.out.println("RAM |4GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 22999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					POCOPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				POCOPhones();
			} else {
				System.err.println("Please choose correct option");
				POCOPhones();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Press 3 for POCO X4 Pro 5G");
			System.out.println("Color :Black");
			System.out.println("Price :18499");
			System.out.println("RAM |4GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 18499;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					POCOPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				POCOPhones();
			} else {
				System.err.println("Please choose correct option");
				POCOPhones();
			}
			break;
		case 4:
			System.out.println("**********************************************************");
			System.out.println("Press 4 for POCO F3 GT ");
			System.out.println("Color : Silver");
			System.out.println("Price :28499");
			System.out.println("RAM |");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 28499;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					POCOPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				POCOPhones();
			} else {
				System.err.println("Please choose correct option");
				POCOPhones();
			}
			break;
		case 5:
			System.out.println("**********************************************************");
			System.out.println("Press 5 for POCO F4 5G");
			System.out.println("Color : Gold");
			System.out.println("Price :27999");
			System.out.println("RAm |6GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 27999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					POCOPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				POCOPhones();
			} else {
				System.err.println("Please choose correct option");
				POCOPhones();
			}
			break;
			
		case 6:
			POCOPhones();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			POCOPhones();
		}
	}
	
}

class Vivo extends Menu{
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public void VivoPhones() {
		System.out.println("**********************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Vivo Y200");
		System.out.println("Press 2 for Vovo V29 Pro");
		System.out.println("Press 3 for Vivo  V29");
		System.out.println("Press 4 for Vivo V27 Pro ");
		System.out.println("Press 5 for Vivo X80 Pro");
		System.out.println("Press 6 to go back");
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Press 1 for Vivo Y200");
			System.out.println("Price : 21999");
			System.out.println("Color :Black");
			System.out.println("RAM | 8GB ");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 21999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					VivoPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				VivoPhones();
			} else {
				System.err.println("Please choose correct option");
				VivoPhones();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Press 2 for Vovo V29 Pro");
			System.out.println("Color : Silver");
			System.out.println("Price :39999");
			System.out.println("RAM |8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 39999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					VivoPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				VivoPhones();
			} else {
				System.err.println("Please choose correct option");
				VivoPhones();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Press 3 for Vivo  V29");
			System.out.println("Color :Black");
			System.out.println("Price :32499");
			System.out.println("RAM |4GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 32499;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					VivoPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				VivoPhones();
			} else {
				System.err.println("Please choose correct option");
				VivoPhones();
			}
			break;
		case 4:
			System.out.println("**********************************************************");
			System.out.println("Press 4 for Vivo V27 Pro ");
			System.out.println("Color : Silver");
			System.out.println("Price :37999");
			System.out.println("RAM |");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 28499;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					VivoPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				VivoPhones();
			} else {
				System.err.println("Please choose correct option");
				VivoPhones();
			}
			break;
		case 5:
			System.out.println("**********************************************************");
			System.out.println("Press 5 for Vivo X80 Pro");
			System.out.println("Color : Gold");
			System.out.println("Price :57999");
			System.out.println("RAm |6GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 57999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					VivoPhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				VivoPhones();
			} else {
				System.err.println("Please choose correct option");
				VivoPhones();
			}
			break;
			
		case 6:
			VivoPhones();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			VivoPhones();
		}
	}	
}
class Realme extends Menu{
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public void RealmePhones() {
		System.out.println("**********************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Realme 11 5G");
		System.out.println("Press 2 for Realme 11 Pro");
		System.out.println("Press 3 for Realme GT Neo 3T");
		System.out.println("Press 4 for Realme GT Neo(150W) ");
		System.out.println("Press 5 for Realme 9 Pro+ 5G");
		System.out.println("Press 6 to go back");
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Press 1 for Vivo Y200");
			System.out.println("Price : 18999");
			System.out.println("Color :Black");
			System.out.println("RAM | 8GB ");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 18999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					RealmePhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				RealmePhones();
			} else {
				System.err.println("Please choose correct option");
				RealmePhones();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Press 2 for Realme 11 Pro");
			System.out.println("Color : Silver");
			System.out.println("Price :27999");
			System.out.println("RAM |8GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 27999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					RealmePhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				RealmePhones();
			} else {
				System.err.println("Please choose correct option");
				RealmePhones();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Press 3 for Realme GT Neo 3T");
			System.out.println("Color :Black");
			System.out.println("Price :34999");
			System.out.println("RAM |4GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 34999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					RealmePhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				RealmePhones();
			} else {
				System.err.println("Please choose correct option");
				RealmePhones();
			}
			break;
		case 4:
			System.out.println("**********************************************************");
			System.out.println("Press 4 for Realme GT Neo(150W) ");
			System.out.println("Color : Silver");
			System.out.println("Price :26699");
			System.out.println("RAM |");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 26699;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					RealmePhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				RealmePhones();
			} else {
				System.err.println("Please choose correct option");
				RealmePhones();
			}
			break;
		case 5:
			System.out.println("**********************************************************");
			System.out.println("Press 5 for Realme 9 Pro+ 5G");
			System.out.println("Color : Gold");
			System.out.println("Price :23999");
			System.out.println("RAm |6GB");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 23999;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					RealmePhones();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				RealmePhones();
			} else {
				System.err.println("Please choose correct option");
				RealmePhones();
			}
			break;
			
		case 6:
			RealmePhones();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			RealmePhones();
		}
	}	
		
}
	

	
class Electronics extends Menu {
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public void ElectronicsMenues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Avaialble Electronics Product");
		System.out.println("Press 1 for Laptops");
		System.out.println("Press 2 for Headphones");
		System.out.println("Press 3 for Camera");
		System.out.println("***********************************************************");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			laptop lap = new laptop();
			lap.LaptopBrands();
			break;
		case 2: //
			Headphones ref=new Headphones();
			ref.HeadphonesBrands();
			break;
		case 3:
			Camera ref1= new Camera();
			ref1.CameraBrands();
			break;
		default:
			System.err.println("Please Try Again!!!");
			ElectronicsMenues();
			break;

		}
	}
		
}
class laptop extends Menu {
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public void LaptopBrands() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Asus Laptops ");
		System.out.println("Press 2 for Dell Laptops");
		System.out.println("Press 3 for Lenovo Laptops");
		System.out.println("Press 4 for Apple Laptops");
		System.out.println("Press 5 for HP Laptops");
		System.out.println("Press 6 to go back");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Asus();
			break;
		case 2:
			Dell();
			break;
		case 3:
			Lenovo();
			break;
		case 4:
			Apple();
			break;
		case 5:
			HP();
			break;
		case 6:
			break;
		default:
			System.err.println("Please choose correct option");
			LaptopBrands();
			break;
		}
	}
//asus Laptops
	public void Asus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Asus TUF Gaming F15");
		System.out.println("Press 2 for Asus Vivobook 16");
		System.out.println("Press 3 for Asus Vivobook 15X OLED");
		System.out.println("Press 4 for Asus Vivobook S 15 OLED");
		System.out.println("Press 5 for Asus Zenbook 14 OLED");
		System.out.println("Press 6 to go back");
		
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Model : Asus TUF Gaming F15");
			System.out.println("Price : 73,990");
			System.out.println("Display : 15.60 inch");
			System.out.println("Display Resolution 1920x1200 Pixels");
			System.out.println("Processor : Core i5");
			System.out.println("RAM :8GB");
			System.out.println("OS : Window 11");
			System.out.println("SSD :512GB");
			System.out.println("Graphics :Intel Iris Xe");
			System.out.println("Weinght :1.17Kg");
			System.out.println("Choose Y to order or N to go back");
			System.out.println("**********************************************************");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 73990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					Asus();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Asus();
			} else {
				System.err.println("Please choose correct option");
				Asus();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Model: Asus Vivobook 16");
			System.out.println("Price : 65990");
			System.out.println("Display : 16.00 inch");
			System.out.println("Display Resolution 1200x1200 Pixels");
			System.out.println("Processor : Core i5");
			System.out.println("RAM :8GB");
			System.out.println("OS : Window 11");
			System.out.println("SSD :512GB");
			System.out.println("Graphics : Intel Iris Xe");
			System.out.println("Weinght :1.85Kg");
			
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 65990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Asus();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Asus();
			} else {
				System.err.println("Please choose correct option");
				Asus();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Mode: Asus Vivobook 15X OLED");
			System.out.println("Price: 66990");
			System.out.println("Display: 16.00 inch");
			System.out.println("Display Resolution 1600x1020 Pixels");
			System.out.println("Processor : Core i5");
			System.out.println("RAM:8GB");
			System.out.println("OS: Window 11");
			System.out.println("Touch Screen: Yes");
			System.out.println("SSD:1TB");
			System.out.println("Graphics: Intel Iris Xe");
			System.out.println("Weinght:1.60Kg");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 66990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Asus();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Asus();
			} else {
				System.err.println("Please choose correct option");
				Asus();
			}
			break;
		case 4:
			System.out.println("**********************************************************");
			System.out.println("Model : Vivobook S 15 OLED");
			System.out.println("Price : 83990");
			System.out.println("Display : 18.00 inch");
			System.out.println("Display Resolution 1600x2560 Pixels");
			System.out.println("Processor : Core i9");
			System.out.println("RAM :4TB");
			System.out.println("OS : Window 11");
			System.out.println("SSD :512GB");
			System.out.println("Hard Disk : No");
			System.out.println("Graphics: Nvidia GeForce RTX 4090");
			System.out.println("Weinght :1.70Kg");
			
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 83990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Asus();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Asus();
			} else {
				System.err.println("Please choose correct option");
				Asus();
			}
			break;
		case 5:
			System.out.println("**********************************************************");
			System.out.println("Model:  Asus Zenbook 14 OLED");
			System.out.println("Price : 97990");
			System.out.println("Display : 14.00 inch");
			System.out.println("Display Resolution 1800x2880 Pixels");
			System.out.println("Touch Screen : Yes");
			System.out.println("Processor : Core i3");
			System.out.println("RAM :16GB");
			System.out.println("OS : Window 11");
			System.out.println("SSD :1TB");
			System.out.println("Graphics : Nvidia GeForce RTX 4090");
			System.out.println("Weinght :1.39Kg");
			
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 97990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Asus();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Asus();
			} else {
				System.err.println("Please choose correct option");
				Asus();
			}
			break;
		case 6:
			Asus();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Asus();
		}
	}
// Dell Laptops 
	public void Dell() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 Dell XPS 17");
		System.out.println("Press 2 for Dell Inspiron 16");
		System.out.println("Press 3 for Dell Alienware x16 R1");
		System.out.println("Press 4 for Dell Alienware m18");
		System.out.println("Press 5 for Dell G15 R7");
		System.out.println("Press 6 to go back");;
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Model Dell XPS 17");
			System.out.println("Price : 29,99,90");
			System.out.println("Display : 17.00 inch");
			System.out.println("Display Resolution 1920x1200 Pixels");
			System.out.println("Processor : Core i5");
			System.out.println("RAM :8GB");
			System.out.println("OS : Window 11");
			System.out.println("SSD :512GB");
			System.out.println("Graphics : Nvidia");
			System.out.println("Weinght :2.17Kg");
			System.out.println("Choose Y to order or N to go back");
			System.out.println("**********************************************************");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 299990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					Dell();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Dell();
			} else {
				System.err.println("Please choose correct option");
				Dell();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Model: Dell Inspiron 16");
			System.out.println("Price : 779990");
			System.out.println("Display : 17.00 inch");
			System.out.println("Display Resolution 1200x1920 Pixels");
			System.out.println("Processor : Core i3");
			System.out.println("RAM :16GB");
			System.out.println("OS : Window 11");
			System.out.println("SSD :512GB");
			System.out.println("Graphics : Nvidia");
			System.out.println("Weinght :1.85Kg");
			
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 779990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Dell();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Dell();
			} else {
				System.err.println("Please choose correct option");
				Dell();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Mode: Dell Alienware x16 R1");
			System.out.println("Price: 379990");
			System.out.println("Display: 16.00 inch");
			System.out.println("Display Resolution 1600x1920 Pixels");
			System.out.println("Processor : Core i9");
			System.out.println("RAM:16GB");
			System.out.println("OS: Window 11");
			System.out.println("SSD:512GB");
			System.out.println("Graphics: Nvidia GeForce RTX 4090");
			System.out.println("Weinght:2.72Kg");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 379990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Dell();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Dell();
			} else {
				System.err.println("Please choose correct option");
				Dell();
			}
			break;
		case 4:
			System.out.println("**********************************************************");
			System.out.println("Model : Dell Alienware m18");
			System.out.println("Price : 359990");
			System.out.println("Display : 18.00 inch");
			System.out.println("Display Resolution 1600x2560 Pixels");
			System.out.println("Processor : Core i9");
			System.out.println("RAM :4TB");
			System.out.println("OS : Window 11");
			System.out.println("SSD :512GB");
			System.out.println("Graphics: Nvidia GeForce RTX 4090");
			System.out.println("Weinght :4.04Kg");
			
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 359990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Dell();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Dell();
			} else {
				System.err.println("Please choose correct option");
				Dell();
			}
			break;
		case 5:
			System.out.println("**********************************************************");
			System.out.println("Model: Dell Alienware m15 R7");
			System.out.println("Price : 164990");
			System.out.println("Display : 17.00 inch");
			System.out.println("Display Resolution 1200x1920 Pixels");
			System.out.println("Processor : Core i3");
			System.out.println("RAM :16GB");
			System.out.println("OS : Window 11");
			System.out.println("SSD :512GB");
			System.out.println("Graphics : Nvidia");
			System.out.println("Weinght :1.85Kg");
			
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 164990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Dell();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Dell();
			} else {
				System.err.println("Please choose correct option");
				Dell();
			}
			break;
		case 6:
			Dell();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Dell();
		}
	}
public void Lenovo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Lenovo  Yoga 9i(Gen 8)");
		System.out.println("Press 2 for Lenovo Yoga Book 9i");
		System.out.println("Press 3 for Lenovo Legion Slim 7(2022)");
		System.out.println("Press 4 for Lenovo IdeaPad Gaming 3(2022)");
		System.out.println("Press 5 for Lenovo V14 G2-ITL");
		System.out.println("Press 6 to go back");;
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Model : Lenovo  Yoga 9i(Gen 8)");
			System.out.println("Price : 174990");
			System.out.println("Display : 14.00 inch");
			System.out.println("Display Resolution :24000x3800 Pixels");
			System.out.println("Touch Screen : Yes");
			System.out.println("Processor : Core i7");
			System.out.println("RAM :16GB");
			System.out.println("OS : Window 11");
			System.out.println("SSD :1TBB");
			System.out.println("Graphics : Intel Iris Xe");
			System.out.println("Weinght :1.40Kg");
			System.out.println("Choose Y to order or N to go back");
			System.out.println("**********************************************************");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 174990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					Lenovo();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Lenovo();
			} else {
				System.err.println("Please choose correct option");
				Lenovo();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Model: Lenovo Yoga Book 9i");
			System.out.println("Price : 224990");
			System.out.println("Display : 13.30 inch");
			System.out.println("Touch Screen : Yes");
			System.out.println("Display Resolution 1200x1920 Pixels");
			System.out.println("Processor : Core i7");
			System.out.println("RAM :16gB");
			System.out.println("OS : Window 11");
			System.out.println("SSD : 1TB");
			System.out.println("Graphics : Nvidia");
			System.out.println("Weinght :1.85Kg");
			
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 224990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Lenovo();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Lenovo();
			} else {
				System.err.println("Please choose correct option");
				Lenovo();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Mode: Lenovo Legion Slim 7(2022)");
			System.out.println("Price: 144990");
			System.out.println("Display: 15.00 inch");
			System.out.println("Display Resolution : 1600x1920 Pixels");
			System.out.println("Processor : Ryzon 7");
			System.out.println("RAM:8GB");
			System.out.println("OS: Window 11");
			System.out.println("SSD:1TB");
			System.out.println("Graphics: Nvidia");
			System.out.println("Weinght:1.90Kg");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 144990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Lenovo();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Lenovo();
			} else {
				System.err.println("Please choose correct option");
				Lenovo();
			}
			break;
		case 4:
			System.out.println("**********************************************************");
			System.out.println("Model : Lenovo IdeaPad Gaming 3(2022)");
			System.out.println("Price : 54990");
			System.out.println("Display : 18.00 inch");
			System.out.println("Display Resolution 2560x14000 Pixels");
			System.out.println("Tuch Screen: No");
			System.out.println("Processor : Ryzen 7");
			System.out.println("RAM :32GB");
			System.out.println("OS : Chrome OS");
			System.out.println("SSD :1TB");
			System.out.println("Graphics: Nvidia GeForce RTX 3050 Ti");
			System.out.println("Weinght :2.50Kg");
			
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 54990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Lenovo();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Lenovo();
			} else {
				System.err.println("Please choose correct option");
				Lenovo();
			}
			break;
		case 5:
			System.out.println("**********************************************************");
			System.out.println("Model: Lenovo V14 G2-ITL");
			System.out.println("Price : 48990");
			System.out.println("Display : 14.00 inch");
			System.out.println("Display Resolution 1366x768 Pixels");
			System.out.println("Processor : Core i3");
			System.out.println("RAM :4GB");
			System.out.println("OS : Window 10 Professional");
			System.out.println("SSD :256GB");
			System.out.println("Graphics : Nvidia");
			System.out.println("Weinght :1.60 Kg");
			
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 48990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Lenovo();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Lenovo();
			} else {
				System.err.println("Please choose correct option");
				Lenovo();
			}
			break;
		case 6:
			Lenovo();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Lenovo();
		}
	}
public void Apple() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for MackBook Pro 14-inch(M3,2023)");
	System.out.println("Press 2 for MackBook Pro 16-inch(M3,2023)");
	System.out.println("Press 3 for Apple MackBook Pro 14 Inch 2023");
	System.out.println("Press 4 for Apple MackBook Pro 16 Inch 2023");
	System.out.println("Press 5 for Apple MackBook Pro 13 Inch 2022");
	System.out.println("Press 6 to go back");;
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Model : MackBook Pro 14-inch(M3,2023)");
		System.out.println("Price : 169990");
		System.out.println("Display : 14.20 inch");
		System.out.println("Display Resolution :1964x3020 Pixels");
		System.out.println("Touch Screen : Yes");
		System.out.println("Processor : Apple M3");
		System.out.println("RAM :8GB");
		System.out.println("OS : MacOS");
		System.out.println("SSD :512GB");
		System.out.println("Graphics : No");
		System.out.println("Weinght :1.55Kg");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 169990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				Apple();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Apple();
		} else {
			System.err.println("Please choose correct option");
			Apple();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Model:  MackBook Pro 16-inch(M3,2023)");
		System.out.println("Price : 249990");
		System.out.println("Display : 16.20 inch");
		System.out.println("Touch Screen : Yes");
		System.out.println("Display Resolution 2234x3456 Pixels");
		System.out.println("Processor : Apple M3 Pro");
		System.out.println("RAM :18GB");
		System.out.println("OS : MacOS");
		System.out.println("SSD : 512GB");
		System.out.println("Weinght :2.14Kg");
		
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 249990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Apple();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Apple();
		} else {
			System.err.println("Please choose correct option");
			Apple();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Mode: Apple MackBook Pro 14 Inch 2023");
		System.out.println("Price: 172990");
		System.out.println("Display: 14.20 inch");
		System.out.println("Display Resolution : 1964x3024 Pixels");
		System.out.println("Processor : Apple M2 Max");
		System.out.println("RAM:32GB");
		System.out.println("OS: MacOS");
		System.out.println("SSD:1TB");
		System.out.println("Weinght:1.63Kg");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 172990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Apple();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Apple();
		} else {
			System.err.println("Please choose correct option");
			Apple();
		}
		break;
	case 4:
		System.out.println("**********************************************************");
		System.out.println("Model : Apple MackBook Pro 16 Inch 2023");
		System.out.println("Price : 212490");
		System.out.println("Display : 16.20 inch");
		System.out.println("Display Resolution 2234x3456 Pixels");
		System.out.println("Tuch Screen: No");
		System.out.println("Processor : Apple M2 Max");
		System.out.println("RAM :32GB");
		System.out.println("OS :MacOS");
		System.out.println("SSD :1TB");
		System.out.println("Weinght :1.63Kg");
		
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 212490;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Apple();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Apple();
		} else {
			System.err.println("Please choose correct option");
			Apple();
		}
		break;
	case 5:
		System.out.println("**********************************************************");
		System.out.println("Model: Apple MackBook Pro 13 Inch 2022");
		System.out.println("Price : 137990");
		System.out.println("Display : 13.30 inch");
		System.out.println("Display Resolution 1366x768 Pixels");
		System.out.println("Processor : Apple M2");
		System.out.println("RAM :8GB");
		System.out.println("OS : MacOS");
		System.out.println("SSD :256GB");
		System.out.println("Weinght :1.60 Kg");
		
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 137990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Apple();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Apple();
		} else {
			System.err.println("Please choose correct option");
			Apple();
		}
		break;
	case 6:
		Apple();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		Apple();
	}
  }	

public void HP() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for HP Pavilion Plus 14(2023)");
	System.out.println("Press 2 for HP Pavilion Plus 16(2023)");
	System.out.println("Press 3 for HP Envyx360 15(AI-Powered)");
	System.out.println("Press 4 for HP Victus 16(2023)");
	System.out.println("Press 5 for HP Pavilian x360 14-EK1009TU");
	System.out.println("Press 6 to go back");;
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Model : HP Pavilion Plus 14(2023)");
		System.out.println("Price : 91990");
		System.out.println("Display : 14.00 inch");
		System.out.println("Display Resolution :2880x1800 Pixels");
		System.out.println("Touch Screen : No");
		System.out.println("Processor : Core i7");
		System.out.println("RAM :16GB");
		System.out.println("OS : Windows 11");
		System.out.println("SSD :1TB");
		System.out.println("Graphics : Intel Iris Xe");
		System.out.println("Weinght :1.44Kg");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 91990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				HP();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			HP();
		} else {
			System.err.println("Please choose correct option");
			HP();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Model:  HP Pavilion Plus 16(2023)");
		System.out.println("Price : 124999");
		System.out.println("Display : 16.00 inch");
		System.out.println("Touch Screen : Yes");
		System.out.println("Display Resolution 2560x1600Pixels");
		System.out.println("Processor : Core i7");
		System.out.println("RAM :16GB");
		System.out.println("OS : Windows 11");
		System.out.println("SSD : 512GB");
		System.out.println("Graphics :Nvidia GeForce RTX 3050");
		System.out.println("Weinght :1.90Kg");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 129990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				HP();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			HP();
		} else {
			System.err.println("Please choose correct option");
			HP();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Mode: HP Envyx360 15(AI-Powered)");
		System.out.println("Price: 78999");
		System.out.println("Display: 15.60 inch");
		System.out.println("Display Resolution : 1920x1080 Pixels");
		System.out.println("Touch Screen : Yes");
		System.out.println("Processor : Core i7");
		System.out.println("RAM:16GB");
		System.out.println("OS: Windows 11");
		System.out.println("Hard Disk: 1TB");
		System.out.println("SSD:1TB");
		System.out.println("Weinght:1.77Kg");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 78999;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				HP();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			HP();
		} else {
			System.err.println("Please choose correct option");
			HP();
		}
		break;
	case 4:
		System.out.println("**********************************************************");
		System.out.println("Model : HP Victus 16(2023)");
		System.out.println("Price : 59999");
		System.out.println("Display : 16.10 inch");
		System.out.println("Display Resolution 2234x3456 Pixels");
		System.out.println("Tuch Screen: No");
		System.out.println("Processor : Core i7");
		System.out.println("RAM :16GB");
		System.out.println("OS :Windows 11");
		System.out.println("SSD :1TB");
		System.out.println("Graphics : Nvidia GeForce RTX 4060");
		System.out.println("Weinght :2.29Kg");
		
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 59999;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				HP();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			HP();
		} else {
			System.err.println("Please choose correct option");
			HP();
		}
		break;
	case 5:
		System.out.println("**********************************************************");
		System.out.println("Model:HP Pavilian x360 14-EK1009TU");
		System.out.println("Price : 57999");
		System.out.println("Display : 14.30 inch");
		System.out.println("Display Resolution 1920x1080 Pixels");
		System.out.println("Touch Screen : No");
		System.out.println("Processor : Ryzen");
		System.out.println("RAM :16GB");
		System.out.println("OS : Windows 11");
		System.out.println("SSD 1TB");
		System.out.println("Graphics :Intel IRIS Graphics");
		System.out.println("Weinght :1.41Kg");
		
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 57999;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				HP();
				break;
			case 2:
				HP();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			HP();
		} else {
			System.err.println("Please choose correct option");
			HP();
		}
		break;
	case 6:
		HP();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		HP();
	}
  }	
}

class Headphones extends Menu {
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public void HeadphonesBrands() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Available Headphones Brands");
		System.out.println("Press 1 for Sony");
		System.out.println("Press 2 for Samsung");
		System.out.println("Press 3 for JBL");
		System.out.println("Press 4 for to go back");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Sony();
			break;
		case 2:
			Samsung();
			break;
		case 3:
			JBL();
			break;
		case 4:
			break;
		default:
			System.err.println("Please choose correct option");
			HeadphonesBrands();
			break;
		}
	}
// Sony
	public void Sony() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Sony WH-CH520");
		System.out.println("Press 1 for Sony WH-CH720N");
		System.out.println("Press 1 for Sony PlayStation 3D");
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Product Name : Sony WH-CH520 ");
			System.out.println("Price : ₹4990");
			System.out.println("Color : White");
			System.out.println("Warranty :1 Year");
			System.out.println("Type : wireless");
			System.out.println("Playback Time :40Hr");
			System.out.println("Choose Y to order or N to go back");
			System.out.println("**********************************************************");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 4990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					Sony();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Sony();
			} else {
				System.err.println("Please choose correct option");
				Sony();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Product Name : Sony WH-CH720N");
			System.out.println("Price : ₹9890");
			System.out.println("Color : Black");
			System.out.println("Playback Time: 30Hr");
			System.out.println("Warrenty :1 Year");
			System.out.println("Type :Wireless");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 9890;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Sony();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Sony();
			} else {
				System.err.println("Please choose correct option");
				Sony();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Product Name :Sony PlayStation 3D ");
			System.out.println("Price : ₹7490");
			System.out.println("Color : Black");
			System.out.println("Warranty :1 Year");
			System.out.println("Type :Wireless");
			System.out.println("Weight :522gm");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 7490;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Sony();
					break;
				case 2:
					menu();
					break;
				case 3:
					System.out.println("Please pay the amount");
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Sony();
			} else {
				System.err.println("Please choose correct option");
				Sony();
			}
			break;
		case 4:
			HeadphonesBrands();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Sony();
		}

	}
public void Samsung() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Samsung Galaxy Buds 2 Pro");
	System.out.println("Press 1 for Samsung Galaxy Buds FE");
	System.out.println("Press 1 for Samsung Galaxy Buds 2");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Product Name : Galaxy Buds 2 Pro ");
		System.out.println("Price : ₹27350");
		System.out.println("Color : White");
		System.out.println("Warranty :1 Year");
		System.out.println("Type : wireless");
		System.out.println("Water Resistance : Yes");
		System.out.println("Playback Time :40Hr");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 27350;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				Samsung();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Samsung();
		} else {
			System.err.println("Please choose correct option");
			Samsung();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Product Name : Samsung Galaxy Buds FE");
		System.out.println("Price : ₹10999");
		System.out.println("Color : Black");
		System.out.println("Playback Time: 30Hr");
		System.out.println("Warrenty :1 Year");
		System.out.println("Weight :45gm");
		System.out.println("Type :Wireless");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 10999;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Samsung();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Samsung();
		} else {
			System.err.println("Please choose correct option");
			Samsung();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Product Name :Samsung Galaxy Buds 2 ");
		System.out.println("Price : ₹6090");
		System.out.println("Color : Black");
		System.out.println("Warranty :1 Year");
		System.out.println("Type :Wireless");
		System.out.println("Weight :5.0gm");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 6090;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Samsung();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Samsung();
		} else {
			System.err.println("Please choose correct option");
			Samsung();
		}
		break;
	case 4:
		HeadphonesBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		Samsung();
	}
  }	
public void JBL() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for JBL Go Air Sport Headset(Teal, True, Wireless)");
	System.out.println("Press 2 for JBL Quantum TWS Headset");
	System.out.println("Press 3 for JBL Tune 760NC Active Noise Cancelling");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Product Name : JBL Go Air Sport Headset(Teal, True, Wireless) ");
		System.out.println("Price : ₹3839");
		System.out.println("Color : Black");
		System.out.println("Warranty :1 Year");
		System.out.println("Type : wireless");
		System.out.println("Wireless Range :10M");
		System.out.println("Water Resistance : Yes");
		System.out.println("Playback Time :32Hr");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 3839;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				JBL();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			JBL();
		} else {
			System.err.println("Please choose correct option");
			JBL();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Product Name : JBL Quantum TWS Headset");
		System.out.println("Price : ₹9999");
		System.out.println("Color : Black");
		System.out.println("Playback Time: 30Hr");
		System.out.println("Warrenty :1 Year");
		System.out.println("Wireless Range :10M");
		System.out.println("Weight :45gm");
		System.out.println("Type :Wireless");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 9999;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				JBL();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			JBL();
		} else {
			System.err.println("Please choose correct option");
			JBL();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Product Name :JBL Tune 760NC Active Noise Cancelling ");
		System.out.println("Price : ₹4999");
		System.out.println("Color : Black");
		System.out.println("Warranty :1 Year");
		System.out.println("Type :Wireless");
		System.out.println("Weight :50gm");
		System.out.println("Play Time :50Hr");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 4999;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				JBL();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			JBL();
		} else {
			System.err.println("Please choose correct option");
			JBL();
		}
		break;
	case 4:
		HeadphonesBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		JBL();
	 }	
	
    }
}
class Camera extends Menu{
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public void CameraBrands() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Canon");
		System.out.println("Press 2 for Sony");
		System.out.println("Press 3 for I Fujifilm");
		System.out.println("Press 4 to go back");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Canon();
			break;
		case 2:
			Sony();
			break;
		case 3:
			Fujifilm();
			break;
		case 4:
			break;
		default:
			System.err.println("Please choose correct option");
			CameraBrands();
			break;
		}
	}

public void Canon() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Canon PowerShot V10");
	System.out.println("Press 2 for Canon EOS R6 Mark II");
	System.out.println("Press 3 for Canon EOS R10");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Brand Name : Canon PowerShot V10 ");
		System.out.println("Price : ₹80995");
		System.out.println("Color : Black");
		System.out.println("Display Size : 3 inch");
		System.out.println("Effective Pixels : 24.2MP");
		System.out.println("Display Type :LCD");
		System.out.println("Battery Type : Lithium ion");
		System.out.println("Weight :429.00Kg");
		System.out.println("Wide Angle: Yes");
		System.out.println("Face Detection : Yes");
		System.out.println("Sensor Type :APS-C");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 80995;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				Canon();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Canon();
		} else {
			System.err.println("Please choose correct option");
			Canon();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Brand Name : Canon EOS R6 Mark II");
		System.out.println("Price : ₹343995");
		System.out.println("Camera Type : Digital Camera");
		System.out.println("Color : Black");
		System.out.println("Display Size : 3inch");
		System.out.println("Effective Pixels : 24.2MP");
		System.out.println("Display Type :LCD");
		System.out.println("Tuch Screen : Yes");
		System.out.println("Battery Type : Lithium ion");
		System.out.println("Sensor Type : CMOS");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 343995;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Canon();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Canon();
		} else {
			System.err.println("Please choose correct option");
			Canon();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Brand Name :Canon EOS R10");
		System.out.println("Price : ₹75990");
		System.out.println("Color : Black");
		System.out.println("Camera Type : DSLR Camera");
		System.out.println("Display Size : 3inch");
		System.out.println("Effective Pixels : 24.2MP");
		System.out.println("Display Type :TFT LCD");
		System.out.println("Weight :429.00Kg");
		System.out.println("Battery Type : Lithium ion");
		System.out.println("Sensor Type :APS-C");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 75990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Canon();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Canon();
		} else {
			System.err.println("Please choose correct option");
			Canon();
		}
		break;
	case 4:
		CameraBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		Canon();
	}
	
}
// Sony
	public void Sony() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Sony A7C");
		System.out.println("Press 2 for Sony A6600");
		System.out.println("Press 3 for Sony A6100");
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Brand Name : Sony A7C ");
			System.out.println("Price : ₹75990");
			System.out.println("Color : Black");
			System.out.println("Display Size : 3inch");
			System.out.println("Effective Pixels : 24.2MP");
			System.out.println("Display Type :TFT LCD");
			System.out.println("Battery Type : Lithium ion");
			System.out.println("Sensor Type :APS-C");
			System.out.println("Choose Y to order or N to go back");
			System.out.println("**********************************************************");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 75990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					Sony();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Sony();
			} else {
				System.err.println("Please choose correct option");
				Sony();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Brand Name : Sony A6600");
			System.out.println("Price : ₹177990");
			System.out.println("Color : Black");
			System.out.println("Display Size : 3inch");
			System.out.println("Effective Pixels : 24.2MP");
			System.out.println("Display Type :TFT LCD");
			System.out.println("Battery Type : Lithium ion");
			System.out.println("Sensor Type :APS-C");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 177990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Sony();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Sony();
			} else {
				System.err.println("Please choose correct option");
				Sony();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Brand Name :Sony A6100");
			System.out.println("Price : ₹75990");
			System.out.println("Color : Black");
			System.out.println("Display Size : 3inch");
			System.out.println("Effective Pixels : 24.2MP");
			System.out.println("Display Type :TFT LCD");
			System.out.println("Battery Type : Lithium ion");
			System.out.println("Sensor Type :APS-C");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 75990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Sony();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Sony();
			} else {
				System.err.println("Please choose correct option");
				Sony();
			}
			break;
		case 4:
			CameraBrands();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Sony();
		
	}
}
public void Fujifilm() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Fujifilm Instax Mini 11");
	System.out.println("Press 2 for Fujifilm XT3 24.3 DSLR Camera");
	System.out.println("Press 3 for Fujifilm XT20 20MP DSLR Camera");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Brand Name :Fujifilm Instax Mini 11 ");
		System.out.println("Price : ₹5783");
		System.out.println("Color : Black");
		System.out.println("Display Size : 3inch");
		System.out.println("Battery Type : AA Alkaline Battery");
		System.out.println("Sensor Type :Maximum ISO 800");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 5783;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				Fujifilm();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Fujifilm();
		} else {
			System.err.println("Please choose correct option");
			Fujifilm();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Brand Name : Sony A6600");
		System.out.println("Price : ₹96999");
		System.out.println("Color : Black");
		System.out.println("Display Size : 3inch");
		System.out.println("Effective Pixels : 24.3MP");
		System.out.println("Display Type :TFT LCD");
		System.out.println("Battery Type : Lithium ion");
		System.out.println("Sensor Type :CMOS");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 96999;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Fujifilm();
				break;
			case 2:
				menu();
				break;
			case 3:
				System.out.println("Please pay the amount");
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Fujifilm();
		} else {
			System.err.println("Please choose correct option");
			Fujifilm();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Brand Name :Fujifilm XT20 20MP DSLR Camera");
		System.out.println("Price : ₹65800");
		System.out.println("Color : Black");
		System.out.println("Display Size : 3 inch");
		System.out.println("Effective Pixels : 20MP");
		System.out.println("Display Type :TFT LCD");
		System.out.println("Battery Type : Lithium ion");
		System.out.println("Sensor Type :APS-C");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 65800;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Fujifilm();
				break;
			case 2:
				menu();
				break;
			case 3:
				System.out.println("Please pay the amount");
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Fujifilm();
		} else {
			System.err.println("Please choose correct option");
			Fujifilm();
		}
		break;
	case 4:
		CameraBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		Fujifilm();
   }
 }
}

class Tv_Appliances extends Menu {
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public void Tv_AppliancesBrands() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for I Television");
		System.out.println("Press 2 for I AC");
		System.out.println("Press 3 for I Refridgerators");
		System.out.println("Press 4 for I Fans");
		System.out.println("Press 5 to go back");;
		System.out.println("***********************************************************");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			TelivisionBrands();
			break;
		case 2: //
			AcBrands();
			break;
		case 3:
			POCO ref1= new POCO();
			ref1.POCOPhones();
			break;
		case 4:
			Vivo ref2=new Vivo();
			ref2.VivoPhones();
			break;
		case 5:
			Realme ref3=new Realme();
			ref3.RealmePhones();
			break;
		default:
			System.err.println("Please Try Again!!!");
			Tv_AppliancesBrands();
			break;

		}
	}


public void TelivisionBrands() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for LG");
		System.out.println("Press 2 for Sony");
		System.out.println("Press 3 for Xiaomi");
		System.out.println("Press 4 to go back");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			LgTv();
			break;
		case 2:
			Sony();
			break;
		case 3:
			Xiaomi();
			break;
		case 4:
			break;
		default:
			System.err.println("Please choose correct option");
			TelivisionBrands();
			break;
		}
	}
// LgTV
	public void LgTv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for LG UR75 43 inch Ultra HD 4K Smart LED TV (43UR7500PSC)");
		System.out.println("Press 2 for LG UR75 43 inch Ultra HD 4K Smart LED TV (43UR7500PSC)");
		System.out.println("Press 3 for LG UR80 55 inch Ultra HD 4K Smart LED TV (55UR8050PSB)");
		System.out.println("Press 4 For Go Back");
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Model Name : LG UR75 43 inch Ultra HD 4K Smart LED TV (43UR7500PSC)");
			System.out.println("Price : ₹14990");
			System.out.println("Color : Gray");
			System.out.println("Size :32 inch");
			System.out.println("Tv Type : Smart TV");
			System.out.println("Storage :8GB");
			System.out.println("Speaker : 2 Speaker,16W Output");
			System.out.println("Choose Y to order or N to go back");
			System.out.println("**********************************************************");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 14990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					LgTv();
					break;
				case 2:
					menu();
					break;
				case 3:
					System.out.println("Please pay the amount");
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				LgTv();
			} else {
				System.err.println("Please choose correct option");
				LgTv();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Model Name : LG UR75 43 inch Ultra HD 4K Smart LED TV (43UR7500PSC)");
			System.out.println("Price : ₹29990");
			System.out.println("Color : Gray");
			System.out.println("Size :43 inch");
			System.out.println("Tv Type :Smart TV");
			System.out.println("Storage :16GB");
			System.out.println("Speaker : 2 Speaker,20W Output");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 29990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					LgTv();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				LgTv();
			} else {
				System.err.println("Please choose correct option");
				LgTv();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Model Name : LG UR80 55 inch Ultra HD 4K Smart LED TV (55UR8050PSB)");
			System.out.println("Price : ₹51990");
			System.out.println("Color : Gray");
			System.out.println("Size :43 inch");
			System.out.println("Tv Type :Smart TV");
			System.out.println("Storage :32GB");
			System.out.println("Speaker : 2 Speaker,20W Output");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 51990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					LgTv();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				LgTv();
			} else {
				System.err.println("Please choose correct option");
				LgTv();
			}
			break;
		case 4:
			Tv_AppliancesBrands();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			LgTv();
		}
	}


public void Sony() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Sony Bravia X75L 55 inch Ultra HD 4K Smart LED TV (KD-55X75L))");
	System.out.println("Press 1 for Sony Bravia X75L 43 inch Ultra HD 4K Smart LED TV (KD-43X75L)");
	System.out.println("Press 1 for Sony Bravia X82L 55 inch Ultra HD 4K Smart LED TV (KD-55X82L)");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Model Name : Sony Bravia X75L 55 inch Ultra HD 4K Smart LED TV (KD-55X75L)");
		System.out.println("Price : ₹64590");
		System.out.println("Color : Black");
		System.out.println("4K Resolution, 3840 x 2160 pixels");
		System.out.println("Size : 55 inch");
		System.out.println("Tv Type : Smart TV");
		System.out.println("Storage :16GB");
		System.out.println("Speaker : 2 Speaker,10W Output");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 64590;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				Sony();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Sony();
		} else {
			System.err.println("Please choose correct option");
			Sony();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Model Name : Sony Bravia X75L 43 inch Ultra HD 4K Smart LED TV (KD-43X75L)");
		System.out.println("Price : ₹44300");
		System.out.println("Color : Gray");
		System.out.println("4K Resolution, 3840 x 2160 pixels");
		System.out.println("Size :43 inch");
		System.out.println("Tv Type :Smart TV");
		System.out.println("Storage :16GB");
		System.out.println("Speaker : 2 Speaker,20W Output");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 44300;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Sony();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Sony();
		} else {
			System.err.println("Please choose correct option");
			Sony();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Model Name : LG UR80 55 inch Ultra HD 4K Smart LED TV (55UR8050PSB)");
		System.out.println("Price : ₹51990");
		System.out.println("Color : Gray");
		System.out.println("4K Resolution, 3840 x 2160 pixels");
		System.out.println("Size :43 inch");
		System.out.println("Tv Type :Smart TV");
		System.out.println("Storage :16GB");
		System.out.println("Speaker : 2 Speaker,20W Output");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 51990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Sony();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Sony();
		} else {
			System.err.println("Please choose correct option");
			Sony();
		}
		break;
	case 4:
		Tv_AppliancesBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		Sony();
	}
}

public void Xiaomi() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Xiaomi A Series 32 inch HD Ready Smart LED TV (L32M8-5AIN)");
	System.out.println("Press 1 for Xiaomi Redmi X43 43 inch Ultra HD 4K Smart LED TV");
	System.out.println("Press 1 for Redmi L32R8-FVIN 32 inch HD Ready Smart LED Fire TV");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Model Name : Xiaomi A Series 32 inch HD Ready Smart LED TV (L32M8-5AIN)");
		System.out.println("Price : ₹12990");
		System.out.println("Color : Black");
		System.out.println("4K Resolution, 1366 x 768 pixels");
		System.out.println("Size : 32 inch");
		System.out.println("Tv Type : Smart TV");
		System.out.println("Storage :8GB");
		System.out.println("Speaker : 2 Speaker,20W Output");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 12990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				Xiaomi();
				break;
			case 2:
				menu();
				break;
			case 3:
				System.out.println("Please pay the amount");
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Xiaomi();
		} else {
			System.err.println("Please choose correct option");
			Xiaomi();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Model Name : Xiaomi Redmi X43 43 inch Ultra HD 4K Smart LED TV");
		System.out.println("Price : ₹23999");
		System.out.println("Color : Gray");
		System.out.println("4K Resolution, 3840 x 2160 pixels");
		System.out.println("Size :43 inch");
		System.out.println("Tv Type :Smart TV");
		System.out.println("Storage :16GB");
		System.out.println("Speaker : 2 Speaker,30W Output");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 23999;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Xiaomi();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Xiaomi();
		} else {
			System.err.println("Please choose correct option");
			Xiaomi();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Model Name :Redmi L32R8-FVIN 32 inch HD Ready Smart LED Fire TV");
		System.out.println("Price : ₹10499");
		System.out.println("Color : Gray");
		System.out.println("4K Resolution, 1366 x 768 pixels");
		System.out.println("Size :32 inch");
		System.out.println("Tv Type :Smart TV");
		System.out.println("Storage :16GB");
		System.out.println("Speaker : 2 Speaker,20W Output");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 51990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Xiaomi();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Xiaomi();
		} else {
			System.err.println("Please choose correct option");
			Xiaomi();
		}
		break;
	case 4:
		Tv_AppliancesBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		Xiaomi();
	}
}
public void AcBrands() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Samsung");
	System.out.println("Press 2 for Blue Star");
	System.out.println("Press 3 for LG");
	System.out.println("Press 4 to go back");
	System.out.println("**********************************************************");
	int n = sc.nextInt();
	switch (n) {
	case 1:
		SamsungAC();
		break;
	case 2:
		Blue_Star();
		break;
	case 3:
		LgAc();
		break;
	case 4:
		Tv_AppliancesBrands();
		break;
	default:
		System.err.println("Please choose correct option");
		AcBrands();
		break;
	}
}
public void SamsungAC() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Samsung AR18BY3YBWK 1.5 Ton 3 Star Inverter Split AC");
	System.out.println("Press 2 for Samsung AR18CY4AAGB 1.5 Ton 4 Star 2023 Inverter Split AC");
	System.out.println("Press 3 for Samsung AR18CY5ACWK 1.5 Ton 5 Star 2023 Inverter Split AC");
	System.out.println("Press 4 for Go Back");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Model Name :Samsung AR18BY3YBWK 1.5 Ton 3 Star Inverter Split AC");
		System.out.println("Price :₹26951");
		System.out.println("Split AC");
		System.out.println("1.5 Ton Capacity");
		System.out.println("828 CMH circulation");
		System.out.println("Dehumidification");
		System.out.println("Remote Control, Timer");
		System.out.println("Sleep Mode");
		System.out.println("Dust Filter");
		System.out.println("Auto Air Swing, Auto Restart");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 48999;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				SamsungAC();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			SamsungAC();
		} else {
			System.err.println("Please choose correct option");
			SamsungAC();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Model Name :Samsung AR18CY4AAGB 1.5 Ton 4 Star 2023 Inverter Split AC");
		System.out.println("Price :₹49095");
		System.out.println("Split AC");
		System.out.println("1.5 Ton Capacity");
		System.out.println("LED Panel Display");
		System.out.println("4-way Swing circulation");
		System.out.println("Dehumidification, Inverter");
		System.out.println("Remote Control, Timer");
		System.out.println("Sleep Mode");
		System.out.println("Dust Filter");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 49095;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				SamsungAC();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			SamsungAC();
		} else {
			System.err.println("Please choose correct option");
			SamsungAC();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Model Name :Samsung AR18CY5ACWK 1.5 Ton 5 Star 2023 Inverter Split AC ");
		System.out.println("Price : ₹85351");
		System.out.println("Color : white");
		System.out.println("Split AC");
		System.out.println("1.5 Ton Capacity");
		System.out.println("LED Panel Display");
		System.out.println("4-way Swing circulation");
		System.out.println("Dehumidification, Inverter");
		System.out.println("Remote Control, Timer");
		System.out.println("Sleep Mode");
		System.out.println("Dust Filter");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 85351;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				SamsungAC();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			SamsungAC();
		} else {
			System.err.println("Please choose correct option");
			SamsungAC();
		}
		break;
	case 4:
		Tv_AppliancesBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		SamsungAC();
	}

  }

public void Blue_Star() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Blue Star ID418YNU 1.5 Ton 4 Star 2023 Inverter Split AC");
	System.out.println("Press 2 for Blue Star IA512YNU 1 Ton 5 Star 2023 Inverter Split AC");
	System.out.println("Press 3 for Blue Star IA312TNU 1 Ton 3 Star Inverter Split AC");
	System.out.println("Press 4 for Go Back");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Model Name :Blue Star ID418YNU 1.5 Ton 4 Star 2023 Inverter Split AC");
		System.out.println("Price :₹38990");
		System.out.println("Split AC");
		System.out.println("1.5 Ton Capacity");
		System.out.println("LED Panel Display");
		System.out.println("Dehumidification");
		System.out.println("Remote Control, Timer");
		System.out.println("Sleep Mode");
		System.out.println("Dust Filter");
		System.out.println("Auto Air Swing, Auto Restart");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 38990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				Blue_Star();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Blue_Star();
		} else {
			System.err.println("Please choose correct option");
			Blue_Star();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Model Name :Blue Star IA512YNU 1 Ton 5 Star 2023 Inverter Split AC");
		System.out.println("Price :₹39990");
		System.out.println("Split AC");
		System.out.println("1 Ton Capacity");
		System.out.println("LED Panel Display");
		System.out.println("Dehumidification, Inverter");
		System.out.println("Remote Control, Timer");
		System.out.println("Sleep Mode");
		System.out.println("Dust Filter");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 39990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Blue_Star();
				break;
			case 2:
				menu();
				break;
			case 3:
				System.out.println("Please pay the amount");
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Blue_Star();
		} else {
			System.err.println("Please choose correct option");
			Blue_Star();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Model Name :Blue Star IA312TNU 1 Ton 3 Star Inverter Split AC ");
		System.out.println("Price : ₹36599");
		System.out.println("Color : white");
		System.out.println("Split AC");
		System.out.println("1 Ton Capacity");
		System.out.println("LED Panel Display");
		System.out.println("Dehumidification, Inverter");
		System.out.println("Remote Control, Timer");
		System.out.println("Sleep Mode");
		System.out.println("Dust Filter");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 36599;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Blue_Star();
				break;
			case 2:
				menu();
				break;
			case 3:
				System.out.println("Please pay the amount");
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Blue_Star();
		} else {
			System.err.println("Please choose correct option");
			Blue_Star();
		}
		break;
	case 4:
		Tv_AppliancesBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		Blue_Star();
	}

  }
public void LgAc() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for LG RS-Q20HWZE 1.5 Ton 5 Star 2023 Dual Inverter Split AC");
	System.out.println("Press 2 for LG RS-Q18CNXE 1.5 Ton 3 Star 2023 Dual Inverter Split AC");
	System.out.println("Press 3 for LG RS-Q19JNYE1 1.5 Ton 4 Star 2023 Inverter Split AC");
	System.out.println("Press 4 for Go Back");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Model Name :LG RS-Q20HWZE 1.5 Ton 5 Star 2023 Dual Inverter Split AC");
		System.out.println("Price :₹46990");
		System.out.println("Split AC");
		System.out.println("1.5 Ton Capacity");
		System.out.println("Magic Display Panel Display");
		System.out.println("4-way Swing circulation");
		System.out.println("Dehumidification, Inverter");
		System.out.println("Remote Control, Timer");
		System.out.println("Turbo Mode, Sleep Mode");
		System.out.println("Dust Filter");
		
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 46990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				LgAc();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			LgAc();
		} else {
			System.err.println("Please choose correct option");
			LgAc();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Model Name :LG RS-Q18CNXE 1.5 Ton 3 Star 2023 Dual Inverter Split AC");
		System.out.println("Price :₹35,990");
		System.out.println("Split AC");
		System.out.println("1.5 Ton Capacity");
		System.out.println("LED Panel Display");
		System.out.println("Dehumidification, Inverter");
		System.out.println("Remote Control, Timer");
		System.out.println("Sleep Mode");
		System.out.println("Dust Filter");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 35990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				LgAc();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			LgAc();
		} else {
			System.err.println("Please choose correct option");
			LgAc();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Model Name :LG RS-Q19JNYE1 1.5 Ton 4 Star 2023 Inverter Split AC ");
		System.out.println("Price : ₹45200");
		System.out.println("Color : white");
		System.out.println("Split AC");
		System.out.println("1 Ton Capacity");
		System.out.println("LED Panel Display");
		System.out.println("Dehumidification, Inverter");
		System.out.println("Remote Control, Timer");
		System.out.println("Sleep Mode");
		System.out.println("Dust Filter");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 45200;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				LgAc();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			LgAc();
		} else {
			System.err.println("Please choose correct option");
			LgAc();
		}
		break;
	case 4:
		Tv_AppliancesBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		LgAc();
	}

}
	
public void Refridgerators() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Samsung");
		System.out.println("Press 2 for LG");
		System.out.println("Press 3 to go back");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			SamsungRefridgerator();
			break;
		case 2:
			LgRefridgerator();
			break;
		case 3:
			Tv_AppliancesBrands();
			break;
		default:
			System.err.println("Please choose correct option");
			AcBrands();
			break;
		}
	}
	public void SamsungRefridgerator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Samsung RR21C2F25NJ 189 L 5 Star Single Door Refrigerator");
		System.out.println("Press 2 for Samsung RT45CG662BB1 415 L 2 Star Double Door Refrigerator");
		System.out.println("Press 3 for Samsung RT37C4523BX 322 L 3 Star Double Door Refrigerator");
		System.out.println("Press 4 for Go Back");
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Model Name :Samsung RR21C2F25NJ 189 L 5 Star Single Door Refrigerator");
			System.out.println("Price :₹17990");
			System.out.println("Multi Door");
			System.out.println("Freezer Top mounted");
			System.out.println("322 L Capacity");
			System.out.println("LED Display");
			System.out.println("3 Star");
			System.out.println("Toughened Glass, Moisture Control");
			System.out.println("Convertible, Frost Free");
			System.out.println("Deodorizer");
			System.out.println("Choose Y to order or N to go back");
			System.out.println("**********************************************************");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 17990;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					SamsungRefridgerator();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				SamsungRefridgerator();
			} else {
				System.err.println("Please choose correct option");
				SamsungRefridgerator();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Model Name :Samsung RT45CG662BB1 415 L 2 Star Double Door Refrigerator");
			System.out.println("Price :₹51000");
			System.out.println("Multi Door");
			System.out.println("Freezer Top mounted");
			System.out.println("415L Capacity");
			System.out.println("LED Display");
			System.out.println("2 Star");
			System.out.println("Toughened Glass, Moisture Control");
			System.out.println("Convertible, Frost Free");
			System.out.println("Deodorizer");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 51000;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					SamsungRefridgerator();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				SamsungRefridgerator();
			} else {
				System.err.println("Please choose correct option");
				SamsungRefridgerator();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Model Name :Samsung RT37C4523BX 322 L 3 Star Double Door Refrigerator");
			System.out.println("Price : ₹42500");
			System.out.println("Color : white");
			System.out.println("Multi Door");
			System.out.println("Freezer Top mounted");
			System.out.println("322L Capacity");
			System.out.println("LED Display");
			System.out.println("2 Star");
			System.out.println("Toughened Glass, Moisture Control");
			System.out.println("Convertible, Frost Free");
			System.out.println("Deodorizer");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 42500;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					SamsungRefridgerator();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				SamsungRefridgerator();
			} else {
				System.err.println("Please choose correct option");
				SamsungRefridgerator();
			}
			break;
		case 4:
			Tv_AppliancesBrands();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			SamsungRefridgerator();
		}

	  }
public void LgRefridgerator() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for LG GL-D201ASCU 185 L 5 Star Single Door Refrigerator");
	System.out.println("Press 2 for LG Gl-B199OBJB 190L 1 Star Single Door Refrigerator");
	System.out.println("Press 3 for LG GL-B257HDS3 650 L Side By Side Refrigerator");
	System.out.println("Press 4 for Go Back");
	System.out.println("**********************************************************");
	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Model Name :Samsung RR21C2F25NJ 189 L 5 Star Single Door Refrigerator");
		System.out.println("Price :₹17290");
		System.out.println("Side By Side");
		System.out.println("650 L Capacity");
		System.out.println("LED Display");
		System.out.println("Toughened Glass, Moisture Control");
		System.out.println("Convertible, Frost Free");
		System.out.println("Deodorizer");
		System.out.println("Door Alarm");
		System.out.println("Removable Gasket");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 17290;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				LgRefridgerator();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			LgRefridgerator();
		} else {
			System.err.println("Please choose correct option");
			LgRefridgerator();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Model Name :LG Gl-B199OBJB 190L 1 Star Single Door Refrigerator");
		System.out.println("Price :₹16599");
		System.out.println("Single Door");
		System.out.println("Freezer Top mounted");
		System.out.println("190 L Capacity");
		System.out.println("1 Star");
		System.out.println("Toughened Glass, Moisture Control");
		System.out.println("Door Lock");
		System.out.println("Removable GaskRemoet");
		System.out.println("Digital Inverter");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 16599;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				LgRefridgerator();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			LgRefridgerator();
		} else {
			System.err.println("Please choose correct option");
			LgRefridgerator();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Model Name :LG GL-B257HDS3 650 L Side By Side Refrigerator");
		System.out.println("Price : ₹79990");
		System.out.println("Color : white");
		System.out.println("Side By Side");
		System.out.println("650 L Capacity");
		System.out.println("LED Display");
		System.out.println("Toughened Glass, Moisture Control");
		System.out.println("Convertible, Frost Free");
		System.out.println("Deodorizer");
		System.out.println("Door Alarm");
		System.out.println("Removable Gasket");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 79990;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				LgRefridgerator();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			LgRefridgerator();
		} else {
			System.err.println("Please choose correct option");
			LgRefridgerator();
		}
		break;
	case 4:
		Tv_AppliancesBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		LgRefridgerator();
	}

 }
	
}
class Homes_Kitchen extends Menu{
	public void DeliveryDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select Quantity");
		this.Quantity=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Reciver Name");
		this.name=sc.nextLine();
		System.out.println("Enter Phone Number :");
		this.contact=sc.nextLong();
		System.out.println("Enter Address");
		this.ReciverAddress=sc.nextLine();
		deliveryinfo();
	}
	public void deliveryinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reciver Name:"+this.name);
		System.out.println("address"+this.ReciverAddress);
		System.out.println("Phone Number:"+this.contact);
		System.out.println("Are You sure for payment");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input=sc.nextInt();
		if(input==1) {
			menu();
		}
		else {
			System.err.println("Invalid Input");
			deliveryinfo();
		}
	}
	public void makePayment() {
		System.out.println("Select Payment Option");
		System.out.println("1.Debit");
		System.out.println("2.Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			paymentDebitCreditCard();
		}
		else if(input==2) {
			System.out.println("Order Placed Sucesss=fully");
		}
		else {
			System.out.println("input is incorrect");
			makePayment();
		}
	}
	public void paymentUPI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your UPI  Id...");
		String UpiId = sc.nextLine();
		System.out.println("Total Price: "+ totalBill+ "");
		System.out.println("Select Below Option...");
		System.out.println("    1. Proceed");
		System.out.println("    2. Cancel");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.println("Please Go to your UPI application or "+UpiId+ " & Complete your Payment!!");
			System.out.println("Congratulation, Your Payment is Successfully Completed!");
			System.out.println("Redirecting........");
			System.out.println("do not Refresh or Close a Page!!!");
			System.out.println("Congratulations, Your Payment is Successfull.................");
		}
	}
	public void paymentDebitCreditCard(){
		Scanner sc = new Scanner(System.in);
		DebitCardNo();
		CVV();
		System.out.println("Enter Expiry Date(eg. 01-Jan-23)...");
		//sc.nextLine();
		//ExpiryDate = sc.nextLine();
		generateOTP();
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		if (OTP == this.OTP) {
			System.out.println("Successfully Ticket Booked!");
		}
		else {
			System.err.println("OTP is Incorrect! Please retry!!!");
			makePayment();
		}
	}
	public void DebitCardNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16  digit Debit/ Credit Card no (eg. 0000 0000 0000 0000)....");
		DebitCardNo = sc.nextLong();
		if (DebitCardNo>999999999999999L && DebitCardNo<10000000000000001L) {
			
		}
		else {
			System.err.println("Opps!Invalid Debit Card no!!!");
			System.out.println("Please Enter Valid 16 digit Debit Card no....");
			DebitCardNo();
		}
	}
	public int CVV(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter CVV no.... (Eg. 000)"); 
			CVV = sc.nextInt();
		}
		if(CVV>99&& CVV<1000) {
			
		}
		else {
			System.err.println("Opps!Incorrect CVV!!!");
			System.out.println("Please Enter Valid 3 digit CVV no....");
			CVV();
		}
		return CVV;
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println("OTP for "+ totalBill + "rs. for Ticket Booking From Tourist.com. & OTP is "+OTP);
			System.out.println("If you not then dial 10022939394 and register complain against fraud.");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public void Homes_KitcheBrands() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Kitchen Essentials");
		System.out.println("Press 2 for Home Furnising");
		System.out.println("Press 3 for Home Decor");
		System.out.println("Press 4 for Gardening & Tools");
		System.out.println("Press 5 to go back");
		System.out.println("**********************************************************");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Kitchen_Essentials() ;
			break;
		case 2:
			FurnisingBrands();
			break;
		case 3:
			Home_Decor();
			break;
		case 4:
			Gardening_Tools();
			break;
		case 5:
			break;
		default:
			System.err.println("Please choose correct option");
			Homes_KitcheBrands();
			break;
		}
	}

	public void Kitchen_Essentials() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for SURYAVIVA Photon 2B BK Toughened 2 Cast Iron (Igniton,Black) Glass Manual Gas Stove  (2 Burners)");
		System.out.println("Press 2 for Glowberg Charcoal Grill");
		System.out.println("Press 3 for MILTON ERNESTO JR. SET Pack of 3 Thermoware Casserole Set  (420 ml, 850 ml, 1430 ml)");
		System.out.println("Press 4 for Go Back");
		System.out.println("**********************************************************");

		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**********************************************************");
			System.out.println("Product Name : SURYAVIVA Photon 2B BK Toughened 2 Cast Iron (Igniton,Black) Glass Manual Gas Stove  (2 Burners)");
			System.out.println("Price : ₹1249");
			System.out.println("Color : Black");
			System.out.println("Type: Manual Gas Stove");
			System.out.println("Burner Type: Cast iron burner");
			System.out.println("Number of Burners: 2");
			System.out.println("Body Material: Glass");
			System.out.println("Dimension: 27 cm x 53 cm");
			System.out.println("Choose Y to order or N to go back");
			System.out.println("**********************************************************");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 1249;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");

				n = sc.nextInt();
				switch (n) {
				case 1:
					Kitchen_Essentials();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Kitchen_Essentials();
			} else {
				System.err.println("Please choose correct option");
				Kitchen_Essentials();
			}
			break;
		case 2:
			System.out.println("**********************************************************");
			System.out.println("Product Name :  Glowberg Charcoal Grill");
			System.out.println("Price : ₹899");
			System.out.println("Color : Black");
			System.out.println("Type: Charcoal Grill");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 899;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Kitchen_Essentials();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Kitchen_Essentials();
			} else {
				System.err.println("Please choose correct option");
				Kitchen_Essentials();
			}
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("Product Name :MILTON ERNESTO JR. SET Pack of 3 Thermoware Casserole Set  (420 ml, 850 ml, 1430 ml) ");
			System.out.println("Price : ₹998");
			System.out.println("Color : Black");
			System.out.println("Type: Casserole Set");
			System.out.println("Made of: Steel, Plastic");
			System.out.println("Microwave Safe");
			System.out.println("Pack of: 3");
			System.out.println("Lid Included");
			System.out.println("Capacity: 420 ml, 850 ml, 1430 ml");
			System.out.println("Casserole Type: Thermoware Casserole");
			System.out.println("**********************************************************");
			System.out.println("Choose Y to order or N to go back");
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Order has been confirmed");
				totalBill = totalBill + 998;
				System.out.println("**********************************************************");
				System.out.println("Do you want to order more?");
				System.out.println("Press 1 to order from same");
				System.out.println("Press 2 to go for Main Menu");
				System.out.println("Press 3 to proceed for bill");
				System.out.println("**********************************************************");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Kitchen_Essentials();
					break;
				case 2:
					menu();
					break;
				case 3:
					makePayment();
					break;
				}
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("Choose another item");
				Kitchen_Essentials();
			} else {
				System.err.println("Please choose correct option");
				Kitchen_Essentials();
			}
			break;
		case 4:
			Homes_KitcheBrands();
			break;
		default:
			System.err.println("Sahi sahi choose kar");
			Kitchen_Essentials();
		}

		
	}
public void FurnisingBrands() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for GYT Floral Comforter for mild winter(Microfiber. Light Blue) ");
	System.out.println("Press 2 for Home-The best is for you 225 cm(7ft) Cotton Room Darking door Curtain (self Design,Gold)");
	System.out.println("Press 3 for CC Homes TC Cotten Double Printed Fitter(Elastic) Bedsheet (pack of 1,Brown)");
	System.out.println("Press 4 for Go Back");
	System.out.println("**********************************************************");

	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Product Name : GYT Floral Comforter for mild winter(Microfiber. Light Blue)");
		System.out.println("Price : ₹1269");
		System.out.println("Color : Light Blue");
		System.out.println("Type :Comforter");
		System.out.println("Size :229 x 254cm");
		System.out.println("Ideal Usage:Mild Winter");
		System.out.println("Pack of : 1");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 1269;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");

			n = sc.nextInt();
			switch (n) {
			case 1:
				FurnisingBrands();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			FurnisingBrands();
		} else {
			System.err.println("Please choose correct option");
			FurnisingBrands();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Product Name :  Home-The best is for you 225 cm(7ft) Cotton Room Darking door Curtain (self Design,Gold)");
		System.out.println("Price : ₹1397");
		System.out.println("Color : Black");
		System.out.println("Door(135 cm x 225cm)");
		System.out.println("Material : Cotton");
		System.out.println("Pack of :1");
		System.out.println("Transparancy :Room Darking");
		System.out.println("Clouser Type : Eyelet");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 1397;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				FurnisingBrands();
				break;
			case 2:
				menu();
				break;
			case 3:
				System.out.println("Please pay the amount");
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			FurnisingBrands();
		} else {
			System.err.println("Please choose correct option");
			FurnisingBrands();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Product Name :CC Homes 160 TC Cotten Double Printed Fitter(Elastic) Bedsheet (pack of 1,Brown) ");
		System.out.println("Price : ₹499");
		System.out.println("Color : Brown");
		System.out.println("Material :Cotton");
		System.out.println("Includes : Number of Bedsheet:1");
		System.out.println("Colour :Brown");
		System.out.println("Casserole Type: Thermoware Casserole");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 499;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				FurnisingBrands();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			FurnisingBrands();
		} else {
			System.err.println("Please choose correct option");
			FurnisingBrands();
		}
		break;
	case 4:
		Homes_KitcheBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		FurnisingBrands();
	}
}
public void Home_Decor() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Asian Paints wall ons colourful concentric circle vinly wall sicker medium removable sticker");
	System.out.println("Press 2 for Asian Paints EZYCR8 baby shark door muralDoor Sticker medium removable sticker(213cm x 84cm Multicolor");
	System.out.println("Press 3 for Asian paints wall ons chai Quotes-2 wallssicker medium(70cm x 45cm,multicolour");
	System.out.println("Press 4 for Go Back");
	System.out.println("**********************************************************");
	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Product Name : Asian Paints wall ons colourful concentric circle vinly wall sicker medium removable sticker");
		System.out.println("Price : ₹149");
		System.out.println("Door Mural");
		System.out.println("Colour: Multicolour");
		System.out.println("Best Suited for Window / Door Sticker");
		System.out.println("Pack of : 1");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 149;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Home_Decor();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Home_Decor();
		} else {
			System.err.println("Please choose correct option");
			Home_Decor();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Product Name :  Asian Paints EZYCR8 baby shark door muralDoor Sticker medium removable sticker(213cm x 84cm Multicolor");
		System.out.println("Price : ₹150");
		System.out.println("Color : Multicolour");
		System.out.println("Wall Sticker");
		System.out.println("Made by Vinly");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 150;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Home_Decor();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Home_Decor();
		} else {
			System.err.println("Please choose correct option");
			Home_Decor();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Product Name :Asian paints wall ons chai Quotes-2 wallssicker medium(70cm x 45cm,multicolour ");
		System.out.println("Price : ₹99");
		System.out.println("Wall Sticker");
		System.out.println("Made by vinly");
		System.out.println("Colour : Multicolour");
		System.out.println("Packe of 1");
		System.out.println("Casserole Type: Thermoware Casserole");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 99;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Home_Decor();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Home_Decor();
		} else {
			System.err.println("Please choose correct option");
			Home_Decor();
		}
		break;
	case 4:
		Homes_KitcheBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		Home_Decor();
	}
}
public void Gardening_Tools() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********************************************************");
	System.out.println("Press 1 for Trowel Garden Tools Kit(1 Tools)");
	System.out.println("Press 2 for Sameer HP 52cc 2Stroke Air Cooled Brush cutter fuel grass Trimmer (manual Feed)");
	System.out.println("Press 3 for GreenLove Plant Container Set(Pack of 12,Plastic)");
	System.out.println("Press 4 for Go Back");
	System.out.println("**********************************************************");
	int n = sc.nextInt();
	switch (n) {
	case 1:
		System.out.println("**********************************************************");
		System.out.println("Product Name : Trowel Garden Tools Kit(1 Tools)");
		System.out.println("Price : ₹213");
		System.out.println("Colour: Multicolour");
		System.out.println("Number of tools : 1");
		System.out.println("Choose Y to order or N to go back");
		System.out.println("**********************************************************");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 213;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Gardening_Tools();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Gardening_Tools();
		} else {
			System.err.println("Please choose correct option");
			Gardening_Tools();
		}
		break;
	case 2:
		System.out.println("**********************************************************");
		System.out.println("Product Name : Sameer HP 52cc 2Stroke Air Cooled Brush cutter fuel grass Trimmer (manual Feed) ");
		System.out.println("Price : ₹8199");
		System.out.println("Color : Red");
		System.out.println("Brand: Sameer");
		System.out.println("Power Source Fuel");
		System.out.println("Feed System: Mannual");
		System.out.println("Line Exit Type:Single");
		System.out.println("Shaft :Straight");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 8199;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Gardening_Tools();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Gardening_Tools();
		} else {
			System.err.println("Please choose correct option");
			Gardening_Tools();
		}
		break;
	case 3:
		System.out.println("**********************************************************");
		System.out.println("Product Name :GreenLove Plant Container Set(Pack of 12,Plastic) ");
		System.out.println("Price : ₹849");
		System.out.println("Color :Brown");
		System.out.println("Shape :Hexagon");
		System.out.println("Height :18cm");
		System.out.println("Material : Plastic");
		System.out.println("Casserole Type: Thermoware Casserole");
		System.out.println("**********************************************************");
		System.out.println("Choose Y to order or N to go back");
		ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Order has been confirmed");
			totalBill = totalBill + 849;
			System.out.println("**********************************************************");
			System.out.println("Do you want to order more?");
			System.out.println("Press 1 to order from same");
			System.out.println("Press 2 to go for Main Menu");
			System.out.println("Press 3 to proceed for bill");
			System.out.println("**********************************************************");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Gardening_Tools();
				break;
			case 2:
				menu();
				break;
			case 3:
				makePayment();
				break;
			}
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("Choose another item");
			Gardening_Tools();
		} else {
			System.err.println("Please choose correct option");
			Gardening_Tools();
		}
		break;
	case 4:
		Homes_KitcheBrands();
		break;
	default:
		System.err.println("Sahi sahi choose kar");
		Gardening_Tools();
	}
  }
}
public class Online_Shop{
	static {
		System.out.println("***********************************************************************");
		System.out.println("*                           Welcome TO Eshop                          *");
		System.out.println("**********************************************************************");
		System.out.println("*                           No Credit Only Cash                       *");
		System.out.println("*                                                                     *");
		System.out.println("***********************************************************************");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************************");
		System.out.println("Press 1 for Signup");
		System.out.println("Press 2 for Login");
		System.out.println("Press 3 for Exit");
		System.out.println("**********************************************************");
		int x = sc.nextInt();
		Menu m = new Menu();
		switch (x) {
		case 1:
			m.signup();
			break;
		case 2:
			m.login();
			break;
		case 3:
			System.out.println("**********************************************************");
			System.out.println("*******************Thank You for Visiting******************");
			System.out.println("**********************************************************");

			System.exit(0);
			break;
		default:
			System.err.println("Invalid Input!! Please Try Again");
			main(null);
		}
		m.menu();
		
		System.out.println(Menu.totalBill);
		}
}