import java.io.File;
import net.sourceforge.tess4j.*;

public class TesseractExample {

    public static void main(String[] args) {
        File imageFile = new File("C:/Users/Elcot/workspace/SpellChecker/res/input2.tiff");
        Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
        // Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}