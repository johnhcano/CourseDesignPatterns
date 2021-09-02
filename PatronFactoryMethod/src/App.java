public class App {
    public static void main(String[] args) throws Exception {
        
        Button buttonWindows = new WindowsButton();
        Button buttonHTML = new HTMLButton();

        Dialog dialogWindows = new WindowsDialog();
        Dialog dialogWeb = new WebDialog();

        buttonWindows = dialogWindows.createButton();
        buttonWindows.onClick();
        buttonWindows.render();

        buttonHTML = dialogWeb.createButton();
        buttonHTML.onClick();
        buttonHTML.render();

    }
}
