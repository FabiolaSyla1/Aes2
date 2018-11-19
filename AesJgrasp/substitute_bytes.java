 /*
 *   *       Please Visit us at www.codemiles.com     *
 *  This Program was Developed by www.codemiles.com forums Team
 *  *           Please Don't Remove This Comment       *
 */
//package substitution;

//import SBox.SBox;
//import SBox.invSBOX;

/**
 *
 * @author mohamed
 */
public class substitute_bytes {
private SBox sbox=new SBox();
    private invSBOX invsbox=new invSBOX();
    private int row;
    private int col;
    
    /** Creates a new instance of substitute_bytes */
    public substitute_bytes() 
    {
    }
    public String  getsubstitue_bytes(String cell)
    { 
          return sbox.getSbox(cell);
    }
     public String  invgetsubstitue_bytes(String cell)
    { 
          return invsbox.getinvSbox(cell);
    }

    /*private SBox sbox=new SBox();
    private invSBOX invsbox=new invSBOX();
    private int row;
    private int col;*/    
}
 /*
 *   *       Please Visit us at www.codemiles.com     *
 *  This Program was Developed by www.codemiles.com forums Team
 *  *           Please Don't Remove This Comment       *
 */