package reflex;

public class Test {

	public static void main(String[] args) {
		/**
		 * instanceof 和 Class<T> .asSubclass类似
		 *  如果此类对象不表示指定类的子类（包括类本身），则会抛出类转换异常。
		 */
		Class<?> str = new Object().getClass().asSubclass(new Object().getClass());
		System.out.println(str);
		Object type = new Object();
		/**
		 * instanceof
			instanceof是Java中的二元运算符，左边是对象，右边是类；当对象是右边类或子类所创建对象时，返回true；否则，返回false。
			
			这里说明下：
			
			类的实例包含本身的实例，以及所有直接或间接子类的实例
			
			instanceof左边显式声明的类型与右边操作元必须是同种类或存在继承关系，也就是说需要位于同一个继承树，否则会编译错误
			
			左边的对象实例不能是基础数据类型   int boolean doube
			
			左边的对象实例和右边的类不在同一个继承树上 
			会编译错误
			
			null用instanceof跟任何类型比较时都是false
			
			不会抛出异常只会编译不通过
		 */
		String num = null;
		if (num instanceof Object) {
			System.out.println("str是Object的子类或其本身");
			
		}
	}

}
