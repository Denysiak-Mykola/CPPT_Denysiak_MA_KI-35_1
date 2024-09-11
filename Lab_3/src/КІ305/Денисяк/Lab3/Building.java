/**
 * Lab3 package
 */
package КІ305.Денисяк.Lab3;

/**
 * Interface contains methods for working with the office  
 */

interface Maintainable{
	void Perform();
	void CheckCondition();
}

/**
 * Interface contains methods for check the office centre  
 */

interface Building extends Maintainable {
	void BuildingInfo();
}