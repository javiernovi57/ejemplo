package proyectos;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Precios {

	protected Shell shell;
	private Text texto1;
	private Text texto2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Precios window = new Precios();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblCantidad_1 = new Label(composite, SWT.NONE);
		lblCantidad_1.setText("CANTIDAD");
		
		
		texto1 = new Text(composite, SWT.BORDER);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblPrecio = new Label(composite_1, SWT.NONE);
		lblPrecio.setText("PRECIO");
		
		
		texto2 = new Text(composite_1, SWT.BORDER);
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite_3 = new Composite(shell, SWT.NONE);
		Label lblNewLabel = new Label(composite_3, SWT.NONE);
		
		Button boton = new Button(composite_2, SWT.NONE);
		boton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int cantidad=Integer.parseInt(texto1.getText());
				float precio=Float.parseFloat(texto2.getText());
				
				lblNewLabel.setText(String.valueOf(precio*cantidad));
				
				
			}
		});
		boton.setText("Calcular");
		
		composite_3.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		lblNewLabel.setText("SU PRECIO");

	}
}
