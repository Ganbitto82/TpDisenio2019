package ar.TpDisenio2019.Utilitario;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class Render_CheckBox extends JCheckBox implements TableCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 0000004;
	private JComponent component = new JCheckBox();

	/** Constructor de clase */
	public Render_CheckBox() {
		setOpaque(true);
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		// Color de fondo de la celda
		((JCheckBox) component).setBackground(Color.GRAY);
		// obtiene valor boolean y coloca valor en el JCheckBox
		boolean b = ((Boolean) value).booleanValue();
		((JCheckBox) component).setSelected(b);
		((JCheckBox) component).setHorizontalAlignment(SwingConstants.CENTER);
		return ((JCheckBox) component);
	}
}
