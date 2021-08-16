import javax.swing.table.DefaultTableModel;

/**
 * @author George Kofidis
 *
 */
public class Model extends DefaultTableModel {
    public Model(){
        super(Constants.DATA, Constants.TABLE_HEADER);
    }
}
