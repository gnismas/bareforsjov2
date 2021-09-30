public class MenuTest {
  public static void main(String[] args) {
    MenuTest test = new MenuTest();
    test.run();
  }

  public void run() {
    String[] menuItems = new String[4];
    menuItems[0] = "1. Choose one";
    menuItems[1] = "2. Choose Two";
    menuItems[2] = "3. Choose Three";
    menuItems[3] = "9. Quit";

    Menu menu = new Menu("Menu", "Please Choose:", menuItems);

    int choice;
    boolean valid;
    do {
      menu.printMenu();
      choice = menu.readChoice();
      valid = true;
      switch (choice) {
        case 1:
          System.out.println("You chose " + choice);
          break;
        case 2:
          System.out.println("You chose " + choice);
          break;
        case 3:
          System.out.println("You chose " + choice);
          break;
        case 9:
          System.out.println("You chose " + choice);
          break;
        
          System.out.println();
          

      }
    } while (!valid);
  }
}