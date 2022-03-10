package pagesTodoly;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class LeftSection {
    public Button buttonRecycle = new Button(By.xpath("//td[text()='Recycle Bin']"));
    public Button optionsRecycleBin = new Button(By.xpath("//div[@style=\"display: block;\"]/img"));
    public Button buttonEliminarRecycle = new Button(By.xpath("//*[@id=\"recycleContextMenu\"]/li/a"));
    public Label thereAreNoElementsLabel = new Label(By.xpath("//span[text()='Recycle Bin has been Emptied.']"));
    //div[text()='There are no items to display']
}
