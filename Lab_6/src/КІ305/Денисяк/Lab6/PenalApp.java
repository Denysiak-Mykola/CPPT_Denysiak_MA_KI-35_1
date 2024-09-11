/**
 * Lab 6
 */
package КІ305.Денисяк.Lab6;

/**
 * Class PenalApp designed to validate and test the Penal class
 */
public class PenalApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        Pen pen_1 = new Pen("Blue pen", 10);
        Pen pen_2 = new Pen("Red pen", 9);
        Pen pen_3 = new Pen("Black pen", 10);
        Pen pen_4 = new Pen("Green pen", 12);
        
        Pencil pencil_1 = new Pencil("Rad pencil", 7);
        Pencil pencil_2 = new Pencil("Gray pencil", 3);
        Pencil pencil_3 = new Pencil("Yellow pencil", 9);
        Pencil pencil_4 = new Pencil("Purpule Pencil", 5);
        Pencil pencil_5 = new Pencil("Brown pencil", 12);

        Penal<Pen> penal_1 = new Penal<>();
        Penal<Pencil> penal_2 = new Penal<>();

        penal_1.AddItem(pen_1);
        penal_1.AddItem(pen_2);
        penal_1.AddItem(pen_3);
        penal_1.AddItem(pen_4);
        
        penal_2.AddItem(pencil_1);
        penal_2.AddItem(pencil_2);
        penal_2.AddItem(pencil_3);
        penal_2.AddItem(pencil_4);
        penal_2.AddItem(pencil_5);

        System.out.println("Number of igetms in penal: " + penal_1.GetItemCount());
        System.out.println("Number of items in penal: " + penal_2.GetItemCount());

        Pen smallest_pen = penal_1.GetSmallestItem();
        System.out.println("Smallest item in penal: " + smallest_pen.GetName());
        Pencil smallest_pencil = penal_2.GetSmallestItem();
        System.out.println("Smallest item in penal: " + smallest_pencil.GetName());

        penal_1.RemoveItem(pen_1);
        System.out.println("Number of items after remove in penal : " + penal_1.GetItemCount());
        penal_2.RemoveItem(pencil_3);
        System.out.println("Number of items after remove in penal: " + penal_2.GetItemCount());
    }

}
