package ejercicio;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Ejercicio {

	protected Shell shell;
	private Text txtUnidad;
	private Text txtPrecio;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Ejercicio window = new Ejercicio();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(600, 500);
		shell.setText("SWT Ejercicio");
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblPrecio = new Label(composite, SWT.NONE);
		lblPrecio.setText("Unidades");
		
		txtUnidad = new Text(composite, SWT.BORDER);
		txtUnidad.setText("0");
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblUnidad = new Label(composite_1, SWT.NONE);
		lblUnidad.setText("Precio");
		
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite_3 = new Composite(shell, SWT.NONE);
		composite_3.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblNewLabel = new Label(composite_3, SWT.NONE);
		
		
		txtPrecio = new Text(composite_1, SWT.BORDER);
		txtPrecio.setText("0");

		
		
		
		Button btnCalcular = new Button(composite_2, SWT.NONE);
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("mierda");
				
				// para crearlo de modo float
				
				float unidades = Float.parseFloat(txtUnidad.getText());
				float precio = Float.parseFloat(txtPrecio.getText());
				
				// para pasarlo a string
				
				lblNewLabel.setText(String.valueOf(precio * unidades));
				
			}
		});
		btnCalcular.setText("Calcular");
		

		lblNewLabel.setText("Resultado");

	}
}
