import javax.persistence.*;

@Entity

public class Trunk {
    @Id
   // private int ID;
    private String MSC;
    private String TRUNK;
    private String MSCID;
    private int PORT_TYPE;
    private String TYPE;


    public Trunk()
    {
        super();
    }

    public Trunk( String MSC, String TRUNK, String MSCID,int PORT_TYPE,String TYPE )
    {
        super();
       // this.ID = ID;
        this.MSC = MSC;
        this.TRUNK = TRUNK;
        this.MSCID = MSCID;
        this.PORT_TYPE = PORT_TYPE;
        this.TYPE = TYPE;
    }







   //public void setId(int Id) {
     //  ID = Id;
   //}

   //public int getId() {
      // return ID;
 // }

    public void setMSC(String msc) {
        MSC = msc;
    }

    public String getMSC() {
        return MSC;
    }


    public void setTRUNK(String trunk) {
        TRUNK = trunk;
    }

    public String getTRUNK() {
        return TRUNK;
    }

    public void setMSCID(String mscid) {
        MSCID = mscid;
    }

    public String getMSCID() {
        return MSCID;
    }


    public void setPORT_TYPE(int port_type) {
        PORT_TYPE = port_type;
    }

    public int getPORT_TYPE() {
        return PORT_TYPE;
    }


    public void setTYPE(String type) {
        TYPE = type;
    }

    public String getTYPE() {
        return TYPE;
    }








}
