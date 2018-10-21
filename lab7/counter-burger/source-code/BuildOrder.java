  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        PremiumCheese prc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] prco = { "Danish Blue Cheese" } ;
        prc.setOptions( prco ) ;
        prc.wrapDecorator( c ) ;
        
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = {  "Mayonnaise", "Thai Peanut Sauce"  } ;
        s.setOptions( so ) ;
        s.wrapDecorator( prc ) ;
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        // premium topping options
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;

        // Bun options
        Bun bun = new Bun( "Bun Options" ) ;
        String[] o = { "Ciabatta (Vegan)" } ;
        bun.setOptions( o ) ;
        bun.wrapDecorator( p ) ;
        
        // Side Food options
        SideFood sideFood = new SideFood( "Side Options" ) ;
        String[] sideFoodStr = { "Shoestring Fries" } ;
        sideFood.setOptions( sideFoodStr ) ;
        sideFood.wrapDecorator( bun ) ;
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( sideFood ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( prc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( sideFood ) ;
        
        
        //order 2
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & AntiBiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // cheese options
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] cheeseStr = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( cheeseStr ) ;
        c2.wrapDecorator( b2 ) ;
        
        PremiumCheese preCheese2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] preCheeseStr = { "Fresh Mozzarella" } ;
        preCheese2.setOptions( preCheeseStr ) ;
        preCheese2.wrapDecorator( c2 ) ;
        
         // sauce options
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] sauceStr = { "Habanero Salsa" } ;
        s2.setOptions( sauceStr ) ;
        s2.wrapDecorator( preCheese2 ) ;
        
        
        // Toppings options
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] toppingStr = { "Crushed Peanuts"} ;
        t2.setOptions( toppingStr ) ;
        t2.wrapDecorator( s2 ) ;
        
        // premium topping options
        Premium p2 = new Premium( "Premium Toppings Options" ) ;
        String[] premiumToppingStr = { "Sunny Side Up Egg*", "Marinated Tomatoes"  } ;
        p2.setOptions( premiumToppingStr ) ;
        p2.wrapDecorator( t2 ) ;
        
        // premium topping options
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] bunStr = { "Gluten-Free Bun" } ;
        bun2.setOptions( bunStr ) ;
        bun2.wrapDecorator( p2 ) ;
       
        // premium topping options
        SideFood sideFood2 = new SideFood( "Side Options" ) ;
        String[] sideFoodStr2 = { "Shoestring Fries" } ;
        sideFood2.setOptions( sideFoodStr2 ) ;
        sideFood2.wrapDecorator( bun2 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( sideFood2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( preCheese2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( sideFood2 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild( customBurger2 );
        return order ;

    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/