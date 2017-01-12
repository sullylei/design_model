package strategy;

/**
 * 
 * @author lei.s
 *
 */
public interface MemberStrategy {
	/**
	 * 计算图书的价格
	 * @param booksPrice 图书原价
	 * @return 计算出打折后的价格
	 */
	public double calcPrice(double booksPrice);
}
