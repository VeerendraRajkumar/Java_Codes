package main.products.db;

import main.products.*;

public class ProductDB
{
    public static Product getProduct(String productCode)
    {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java") ||
           productCode.equalsIgnoreCase("jsps") ||
           productCode.equalsIgnoreCase("mcb2"))
        {
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java"))
            {
               /* b.setCode(productCode);
                b.setDescription("Murach's Beginning Java 2");
                b.setPrice(49.50);
                b.setAuthor("Andrea Steelman");*/
                
                b=new Book(productCode,"Murach's Beginning Java 2",49.50,"Andrea Steelman");
            }
            else if (productCode.equalsIgnoreCase("jsps"))
            {
               /* b.setCode(productCode);
                b.setDescription("Murach's Java Servlets and JSP");
                b.setPrice(49.50);
                b.setAuthor("Andrea Steelman");*/
                
                b=new Book(productCode,"Murach's Java Servlets and JSP",49.50,"Andrea Steelman");
            }
            else if (productCode.equalsIgnoreCase("mcb2"))
            {
               /* b.setCode(productCode);
                b.setDescription("Murach's Mainframe COBOL");
                b.setPrice(59.50);
                b.setAuthor("Mike Murach");*/

                b=new Book(productCode,"Murach's Mainframe COBOL",59.50,"Mike Murach");                
            }
            p = b; // set Product object equal to the Book object
        }
        else if (productCode.equalsIgnoreCase("txtpd"))
        {
            Software s = new Software("txtp","TextPad",27.00,"4.7.3");
            /*s.setCode("txtp");
            s.setDescription("TextPad");
            s.setPrice(27.00);
            s.setVersion("4.7.3");*/
            p = s; // set Product object equal to the Software object
        }
        else if (productCode.equalsIgnoreCase("wrdpd"))
		{
			Software s = new Software("wrdpd","Word Pad",37.00,"6.3.3");
			/*s.setCode("wrdpd");
			s.setDescription("Word Pad");
			s.setPrice(37.00);
			s.setVersion("6.3.3");*/
			p = s; // set Product object equal to the Software object
        }
        return p;
    }
}
