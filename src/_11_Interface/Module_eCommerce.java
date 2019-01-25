package _11_Interface;

/**
 * @author love.vashista
 * - Interface is a "client agreement" with example.
 * - Real definition of interface
 * - All methods of an interface is public by default (why? ask the crowd).
 * - It is the duty of the class implementing interface to implement all the method of the interface.
 * - Can a class has its own methods in addition to the interface methods. Yes.
 * - Give example stating "Reference variables of the interface can only point to the object of the class implementing the interface only"
 * - Then after demoing, state that, all the methods that belong to the class cannot be accessed by the interface reference and dot operator.
 * - Thus, a class can access all the methods including its own class and that of the interface. But an interface reference can only access the methods 
 *   that belong to interface only.
 *   
 *   
 * - You can create an object of a class.
 * - You cannot create an object of an interface.
 * - You can create a class type reference.
 * - You can also create an interface type reference. However, such reference can only point to the object of the class implementing that interface.
 * - We can extend only one class but can implement multiple interfaces.
 */
public class Module_eCommerce implements DevUtils, DevOpsUtils{

	@Override
	public void SearchFunctionality() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddToCartFunctionality() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Checkout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OrderHistory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deployBuildOnDev() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deployeBuildOnQA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deployBuildOnStg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deployBuildOnProd() {
		// TODO Auto-generated method stub
		
	}
	
	public void localMethod() {
		// some logic
	}
	
	public static void main(String[] args) {
		Module_eCommerce me = new Module_eCommerce();
		DevUtils du = new Module_eCommerce();
		du.OrderHistory();
		//du.localMethod();
		//du.deployBuildOnStg();
		me.deployBuildOnDev();
		me.localMethod();
	}

}
