/*Name:Ng Ke Rong*/
/*No.Matrik:271063*/

import java.util.Scanner;

public class myCarLoan {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        float A,B,C,D;
        
        /*Display*/
        System.out.println("CAR LOAN CALCULATOR\n");
        
        /*Input Car Loan,Down Payment, Loan Period and Interest Rate*/
        System.out.print("Car Price(RM)\t\t\t:");
        A = input.nextFloat();
        System.out.print("Down Payment(RM)\t\t:");
        B = input.nextFloat();
        System.out.print("Loan Period(Years)\t:");
        C = input.nextFloat();
        System.out.print("Interest Rate(%)\t\t:");
        D = input.nextFloat();
        
        /*Looping*/
        if(A >= 30000.00 & B >= 0.00 & C >= 5.00 & C <= 9.00 & D >= 3.00 & D <= 7.00 ){
            
            /*Call Method*/
            CalculateLoan(A,B,C,D);

        }else{
            /*Display Error*/
            System.out.println("Error, please enter again.");
        }
        
        input.close();
    }
    
    public static void CalculateLoan(float A, float B, float C, float D ){
        
        float Interest,Principal,Repayment,TotalPrinc=0,TotalInte=0,Balance=0;
        String[] Years = {"1st","2nd","3rd","4th","5th","6th","7th","8th"};
        String format1 = "%40s\n%28s%.2f\n\n",
        format2 = "%10s-%15s-%15s-%15s\n",
        format3 = "%9s%17.2f%16.2f%17.2f\n";
        byte i = 0;
        
        
        /*Calculate*/
        Interest = D/100 * (A - B);
        Principal = (A - B + Interest *C)/C;
        Repayment = Principal /12;
        
        /*Display Repayment*/
        System.out.printf(format1, "Monthly Repayment","RM",Repayment);
        
        /*Display Result*/
        System.out.printf(format2, "YEARS", "PRINCIPAL", "INTEREST", "BALANCE");
        
        /*Looping*/
        while(C != 0){
            /*Calculation*/
            TotalPrinc = Principal + TotalPrinc;
            TotalInte = Interest + TotalInte;
            Balance = (Principal * C) - Principal;

            /*Output Years, Principal, Interest, Balance*/
            System.out.printf(format3, Years[i], TotalPrinc, TotalInte, Balance);

            /*Initialize*/
            C--;
            i++;   
        }
        
    }
}
