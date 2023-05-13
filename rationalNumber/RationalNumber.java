/**
 * A rational number given by a numerator and denominator.
 *
*/
public class RationalNumber {

	/**
	 * The numerator is given as an integer number.
	 * It is always 0 if this RationalNumber is 0.
	 */
	private int numerator;

	/**
	 * The denominator is given as an integer number greater than zero.
	 * It is always 1 if this RationalNumber is 0.
	 */
	private int denominator;

	private int gcd;
	
	/**
	  * Default constructor which initializes the rational number to zero.
	*/
	
	public RationalNumber()
	{
		this.numerator=0;
		this.denominator=1;
	}
	
	/**
	  * Constructor which takes only numerator.
	  *
	*/
	
	public RationalNumber(int num)
	{
		this.numerator= num ;
		this.denominator = 1;
	}
	
	/**
	 * Creates a new RationalNumber with given numerator and denominator.
	 * @param numerator an arbitry integer number
	 * @param denominator an integer not equal to zero
	 */
	public RationalNumber(int num, int den) {
		this.numerator = num;
		if (num == 0) {
			denominator = 1;
		}
		if (den == 0) {
			throw new RuntimeException("Denominator is Zero");
		}else{
			this.denominator = den;
		}
		reduceFraction();
	}

	/**
	 * Returns the greates common divisor of two positive integer numbers.
	 */

	private int getGcd(int p, int q) {
			p = Math.abs(p);
			q = Math.abs(q);
			int r = p%q;
			while (r > 0) {
				p = q;
				q = r;
				r = p%q;
			}
			//System.out.println("GCD::"+q);
			return q;
	}

	/**
	 * Reduces the fraction of numerator and denominator by their
	 * greatest common divisor.
	 */
	private void reduceFraction() {
		this.gcd = getGcd(Math.abs(numerator), denominator);
		//int num, den;

		if (gcd > 0) {
			numerator = numerator / gcd;
			denominator = denominator / gcd;

		}

	}

	public int getGcd(){
		return this.gcd;
	}

	
	/**
	 * Returns the denominator of this RationalNumber.
	 * It is zero, if this RationalNumber is zero.
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Returns the numerator of this RationalNumber.
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Returns the value of this RationalNumber as a double value.
	 */
	public double getDoubleValue() {
		return (double) numerator / (double) denominator;
	}
	
	/**
	 * Add method
	 * This method adds two rational numbers.
	 */
	 public RationalNumber add(RationalNumber n)
	 {
	 	RationalNumber r = new RationalNumber( (this.getNumerator() * n.getDenominator()) + (n.getNumerator() * this.getDenominator()) , this.getDenominator() * n.getDenominator() );
	 	r.reduceFraction();
	 	return r;
	 }
	 
	 /**
	 * Subtract method
	 * This method subtracts a rational number from another.
	 */
	 public RationalNumber subtract(RationalNumber n)
	 {
	 	RationalNumber r = new RationalNumber( (this.getNumerator() * n.getDenominator()) - (n.getNumerator() * this.getDenominator()) , this.getDenominator() * n.getDenominator() );
	 	r.reduceFraction();
	 	return r;
	 }
	
	/**
	 * Multiply method
	 * This method multiplies two rational numbers.
	 */
	 public RationalNumber multiply(RationalNumber n)
	 {
	 	RationalNumber r =new RationalNumber(this.getNumerator() * n.getNumerator() , this.getDenominator() * n.getDenominator());
	 	return r;
	 }
	
	/**
	 * Reciprocal method
	 * Finds reciprocal of a rational number.
	*/
	public RationalNumber reciprocal()
	{
		RationalNumber r = new RationalNumber(this.getDenominator(),this.getNumerator());
		return r;
	}
	
	/**
	 * Divide method
	 * This method divides two rational numbers.
	*/
	public RationalNumber divide(RationalNumber n)
	{
		RationalNumber recip_n = new RationalNumber();
		recip_n = n.reciprocal();
		
		RationalNumber r = new RationalNumber();
		r = this.multiply(n);
		return r;
	}
	
	/**
	 * toString method 
	 * This method overides the toString method of the parent.
	 */
	 public String toString()
	 {
	 	return "( num / den )     :     (" + numerator + " / "  + denominator + ").\n";
	 }
}
