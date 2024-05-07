import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author icaropereira1
 * @version 
 */
public class trianguloController
{
    trianguloView trianguloView;
    Stage stage;
    triangulo triangulo;
    public TextField textFieldAltura;
    public TextField textFieldBase;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe trianguloController
     */
    public trianguloController()
    {
        this.stage = new Stage();
        this.trianguloView = new trianguloView();
        this.trianguloView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.trianguloView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double altura = Double.parseDouble(textFieldAltura.getText());
            double base = Double.parseDouble(textFieldBase.getText());
            triangulo triangulo = new triangulo(altura, base);
            this.labelResultado.setText(triangulo.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldAltura.setText("");
        textFieldBase.setText("");
        labelResultado.setText("");
    }    
}
