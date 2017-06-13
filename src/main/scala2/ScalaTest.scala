
object ScalaTest extends App{
  
    println(" Shopping Cart Selection Started")
    
    val coffeShop = new CoffeShop(args(0).toDouble, args(1).toDouble, args(2).toDouble, args(3).toDouble)
    
    println(" Total Bill Amount When Purchased items all are Drinks "+coffeShop.getBillAmountWhneOnlyDrinksItems())
    
    println(" Total Bill AMount When Purchased items include Food items "+coffeShop.getBillAmountWhenFoodItemsInclude())
    
    println("Total Bill Amount When Purchased items include Hot Food items : "+ coffeShop.getBillAmountWhenHotFoodItemsInclude()) 
    
    
}