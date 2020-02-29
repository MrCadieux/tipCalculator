import java.text.DecimalFormat
fun main() {
        var itemCost: Double = 0.0
        var totalCost: Double = 0.0
        var totalItems = 0
        var tax = 0.0
        val rate = .025
        val dollarAmount = DecimalFormat("#,###.00")

        println("The tip calculator will add up all item costs and calculate the total cost including tax\n")

        println("Please enter the cost of items seperately.")
        println("Enter 0 for no more items")

        // Loop adds up total cost and number of items entered until $0 is entered
        do {
            print("---> $")
            itemCost = readLine()!!.toDouble()
            totalItems++
            totalCost+= itemCost

        } while (itemCost != 0.0)

        tax = rate*totalCost
        var taxes = dollarAmount.format(tax)

        println("Total number of items: ${totalItems-1}")
        println("Net cost of those items: $${dollarAmount.format(totalCost)}")
        println("Tax @ 2.5%: $$taxes")
        println("Recommended tip @ 17.5%: $${dollarAmount.format(totalCost*.175)}")
        println("Total cost: $${dollarAmount.format(tax+totalCost)}")

}