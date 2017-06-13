

 class CoffeShop(val coldCola: Double, val hotCoffee:Double, val coldCheeseSandwich:Double, val hotSteakSandwich:Double)  {
  
  var totalAmount : Double =0.00
  var selectedItemsBill : Double =0.00
  var serviceChargeAmt : Double =0.00
  
  val selectedItems=  List (coldCola,hotCoffee,coldCheeseSandwich,hotSteakSandwich)
  
   
  println("Total Selected Items Cost : "+(coldCola+hotCoffee+coldCheeseSandwich+hotSteakSandwich))
   
   def getBillAmountWhneOnlyDrinksItems(): Double = {
     if( selectedItems.contains(coldCola) || selectedItems.contains(hotCoffee))   {
      totalAmount = hotCoffee+hotCoffee
      println(" Total Bill Amount When Purchased items all are Drinks : "+ totalAmount)     
      } 
     totalAmount   
   }
  
    def getBillAmountWhenFoodItemsInclude(): Double = {
     if( selectedItems.contains(coldCheeseSandwich) || selectedItems.contains(hotSteakSandwich))   {
      selectedItemsBill = coldCola+hotCoffee+coldCheeseSandwich+hotSteakSandwich
      serviceChargeAmt = selectedItemsBill * 10/100
      totalAmount = serviceChargeAmt + selectedItemsBill 
      println("Total Bill Amount When Purchased items include Food items : "+ totalAmount)     
      } 
     totalAmount   
   }
    
    def getBillAmountWhenHotFoodItemsInclude(): Double = {
      
     if( selectedItems.contains(hotCoffee) || selectedItems.contains(hotSteakSandwich))   {
      selectedItemsBill = coldCola+hotCoffee+coldCheeseSandwich+hotSteakSandwich
      serviceChargeAmt = selectedItemsBill * 20/100
      if (serviceChargeAmt > 20)
      {
        serviceChargeAmt = 20
      }
      totalAmount = serviceChargeAmt + selectedItemsBill 
      println("Total Bill Amount When Purchased items include Hot Food items : "+ totalAmount)     
      } 
     totalAmount   
   }
   
}