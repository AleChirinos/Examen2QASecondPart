package pagesTodoist;

import control.Button;
import control.Control;
import control.Label;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public Button configurationButton = new Button(By.xpath("//button[contains(@class,'top_bar_btn settings_btn')]"));
    public Control toolbar = new Control(By.id("top_bar_inner"));
    public Button projectButton = new Button(By.xpath("//button[@class='expansion_panel__toggle']/span[text()='Proyectos']"));
    public Button buttonAddProject = new Button(By.xpath("//button[@class='adder_icon']"));
    public Label tituloDeProyecto = new Label(By.xpath("//h1/span[@class=\"simple_content\"]"));
    //public Button buttonProyectoIndicado = new Button(By.id("//li[last()]/div"));
    public Button buttonMasOpciones = new Button(By.xpath("//button[contains(@aria-label, 'Menú de opciones del proyecto')]"));
    public Button buttonEditar = new Button(By.xpath("//div[text()='Editar proyecto']"));
    public Button buttonEliminar = new Button(By.xpath("//div[text()='Eliminar proyecto']"));


}
