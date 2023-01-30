import java.util.Scanner;


public class lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		// taking input from user 
        System.out.println("Enter your name");
		String name = scan.nextLine();

		System.out.println("Enter age");
		int age = scan.nextInt();
		
		System.out.println("Enter sex: M/F");
	    String gender = scan.nextLine();
		
		System.out.println("Where you are from");
        String state = scan.nextLine();

        System.out.println("Enter the previous company you worked in :");
        String mnc = scan.nextLine();

        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("State: " +state);
        System.out.println("Company: "+mnc);
        if(gender == 'M'){
            System.out.println("Gender is MALE");
        }
        else{
            System.out.println("Gender is Female");
        }
        
        System.out.println("The State is :");
        switch(state){
            case "Chandigarh":
            case "Delhi":
            case "Haryana":
            case "Himachal Pradesh":
            case "Jammu & Kashmir":
            case "Punjab":
            case "Rajasthan":
                System.out.println("The Employee is from the 'northern' states of India; And location is in " + state)
                break;
            case "Arunachal Pradesh":
            case "Assam":
            case "Manipur":
            case "Meghalaya":
            case "Mizoram":
            case "Nagaland":
            case "Tripura":
            case "Andaman & Nicobar Islands":
            case "Bihar":
            case "Jharkhand":
            case "Orissa":
            case "Sikkim":
            case "West Bengal":
                System.out.println("The Employee is from the 'eastern' states of India; AND location is in " + state);
                break;
                case "Chhattisgarh":
                case "Madhya Pradesh":
                case "Uttar Pradesh":
                case "Uttaranchal":
                    System.out.println("The Employee is from the 'central' states of India; Preferable work location is in " + state);
                    break;
                default:
                     System.out.println("The Employee is from the 'western' states of India; Preferable work location is in " + state);
                    break;
                case "Andhra Pradesh":
                case "Karnataka":
                case "Kerala":
                case "Lakshadweep":
                case "Pondicherry":
                case "Tamil Nadu":
                    System.out.println("The Employee is from the 'southern' states of India; Preferable work location is in " + state);
                    break;
            }
            switch(mnc)
            {
                case "Facebook":
                case "Google":
                case "Microsoft":
                case "Samsung":
                case "IBM":
                case "Apple":
                    System.out.println("The employee is working in Top MNC Companies.");
                    break;
                default:
                    System.out.println();
                    break;


     
		
        
    }
    
}
