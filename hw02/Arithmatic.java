//Wael Haidar
//HomeWork 2: Arithmatic 07/9/14 05:36 pm
//CSE2 Section 112 CRN 48811
//This program is to compute the cost of the items I bought in a Walmart 
//shopping trip, including the PA sales tax of 6%.

public class Arithmatic{
    
    public static void main(String[] args){
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        double taxPercent=0.06; //assign the tax percentage of 6%
        
        double totalSockCost$; //total cost of socks
        double totalDrinkingGlassesCost$; //total cost of drinking glasses
        double totalBoxesOfEnvelopesCost$; //total cost of the boxes of envelopes
        
        double taxOnSock; //tax collected for the socks purchase
        double taxOnDrinkingGlasses; //tax collected for the Drinking Glass purchase
        double taxOnBoxesOfEnvelopes;//tax collected for the Boxes of Envelopes purchase
        
        
        totalSockCost$=nSocks*sockCost$; //to calculate the total cost of the socks bought before tax
        totalDrinkingGlassesCost$=nGlasses*glassCost$;//to calculate the total cost of the drinking glasses bought before tax
        totalBoxesOfEnvelopesCost$=nEnvelopes*envelopeCost$;//to calculate the total cost of the boxes of envelope bought before tax
        
        taxOnSock=totalSockCost$*taxPercent;//to calculate the tax collected for the socks purchase
        taxOnDrinkingGlasses=totalDrinkingGlassesCost$*taxPercent; //to calculate the tax collected for the drinking glasses purchase
        taxOnBoxesOfEnvelopes=totalBoxesOfEnvelopesCost$*taxPercent;//to calculate the tax collected for the boxes of envelopes purchase
        
        
        double TotalBillBeforeTax;//assign the total bill before tax variable 
        double TotalSalesTaxColleceted;//assign the total sale tax collected variable 
        double TotalBillCollected;//assign the total bill collected variable 
        
        TotalBillBeforeTax=totalSockCost$+totalDrinkingGlassesCost$+totalBoxesOfEnvelopesCost$;//to calculate the total cost of the items purchased before sales tax
        TotalSalesTaxColleceted=taxOnSock+taxOnDrinkingGlasses+taxOnBoxesOfEnvelopes; //To calculate the total sales tax collected
        TotalBillCollected=TotalBillBeforeTax+TotalSalesTaxColleceted;//To calculate the total cost of the purchase that is collected at the cashier
        
        //to change the outputs' form to 2 decimal places only
        taxOnSock = taxOnSock*100; 
        taxOnSock = (double)((int)(taxOnSock));
        taxOnSock = taxOnSock /100;
        
        taxOnDrinkingGlasses = taxOnDrinkingGlasses*100;
        taxOnDrinkingGlasses = (double)((int)(taxOnDrinkingGlasses));
        taxOnDrinkingGlasses = taxOnDrinkingGlasses /100;
        
        taxOnBoxesOfEnvelopes = taxOnBoxesOfEnvelopes*100;
        taxOnBoxesOfEnvelopes = (double)((int)(taxOnBoxesOfEnvelopes));
        taxOnBoxesOfEnvelopes = taxOnBoxesOfEnvelopes /100;
        
        TotalSalesTaxColleceted = TotalSalesTaxColleceted*100;
        TotalSalesTaxColleceted = (double)((int)(TotalSalesTaxColleceted));
        TotalSalesTaxColleceted = TotalSalesTaxColleceted /100;
        
        TotalBillCollected = TotalBillCollected*100;
        TotalBillCollected = (double)((int)(TotalBillCollected));
        TotalBillCollected = TotalBillCollected /100;
        
        System.out.println ("Item1: Socks") ;//print the name of the first item purchased
        System.out.println ("Number of item1 bought:"+ (nSocks));//print the number of that item purchased
        System.out.println ("The cost per item1:"+"$"+(sockCost$));//print the price of the first item per item
        System.out.println ("Total item1 cost:"+"$"+(totalSockCost$));//print the total cost of the first items purchased before tax
        System.out.println ("Sale Tax on item1:"+"$"+(taxOnSock));//print the sales tax collected for the first item
        System.out.println ("---------------------------------");
        System.out.println ("Item2: Drinking Glasses");//print the name of the second item purchased
        System.out.println ("Number of item2 bought:"+(nGlasses));//print the number of that item purchased
        System.out.println ("The cost per item2:"+"$"+(glassCost$));//print the price of the second item per item
        System.out.println ("Total item2 cost:"+"$"+(totalDrinkingGlassesCost$));//print the total cost of the second items purchased before tax
        System.out.println ("Sale Tax on item2:"+"$"+(taxOnDrinkingGlasses));//print the sales tax collected for the second item
        System.out.println ("---------------------------------");
        System.out.println ("Item3: Boxes of Envelopes") ;//print the name of the third item purchased
        System.out.println ("Number of item3 bought:"+ (nEnvelopes));//print the number of that item purchased
        System.out.println ("The cost per item3:"+"$"+(envelopeCost$));//print the price of the third item per item
        System.out.println ("Total item3 cost:"+"$"+(totalBoxesOfEnvelopesCost$));//print the total cost of the third items purchased before tax
        System.out.println ("Sale Tax on item3:"+"$"+(taxOnBoxesOfEnvelopes));//print the sales tax collected for the third item
        System.out.println ("---------------------------------");
        System.out.println ("Total cost of purchase (before tax):"+"$" +(TotalBillBeforeTax));//print the total cost of purchase before taxes
        System.out.println ("Total sales tax collected:" +"$"+(TotalSalesTaxColleceted));//print the total sales taxes collected on the entire bill
        System.out.println ("Total cost of the purchase:"+"$"+(TotalBillCollected));//print the total bill payed (so the cost of the items with their taxes)
        System.out.println ("---------------------------------");
        System.out.println ("Thank you for your purchase. Visit again :)");
        
    }
}
        
        