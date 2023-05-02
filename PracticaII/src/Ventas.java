import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class Ventas {

    private String ORDERNUMBER;
    private int QUANTITYORDERED;
    private float PRICEEACH;
    private int ORDERLINENUMBER;
    private float SALES;
    private String ORDERDATE;
    private String STATUS;
    private int QTR_ID;
    private int MONTH_ID;
    private int YEAR_ID;
    private String PRODUCTLINE;
    private int MSRP;
    private String PRODUCTCODE;
    private String CUSTOMERNAME;
    private String PHONE;
    private String ADDRESSLINE1;
    private String ADDRESSLINE2;
    private String CITY;
    private String STATE;
    private String POSTALCODE;
    private String COUNTRY;
    private String TERRITORY;
    private String CONTACTLASTNAME;
    private String CONTACTFIRSTNAME;
    private String DEALSIZE;


    public Ventas(String ORDERNUMBER, int QUANTITYORDERED, float PRICEEACH, int ORDERLINENUMBER, float SALES, String ORDERDATE, String STATUS, int QTR_ID, int MONTH_ID, int YEAR_ID, String PRODUCTLINE, int MSRP, String PRODUCTCODE, String CUSTOMERNAME, String PHONE, String ADDRESSLINE1, String ADDRESSLINE2, String CITY, String STATE, String POSTALCODE, String COUNTRY, String TERRITORY, String CONTACTLASTNAME, String CONTACTFIRSTNAME, String DEALSIZE) {
        this.ORDERNUMBER = ORDERNUMBER;
        this.QUANTITYORDERED = QUANTITYORDERED;
        this.PRICEEACH = PRICEEACH;
        this.ORDERLINENUMBER = ORDERLINENUMBER;
        this.SALES = SALES;
        this.ORDERDATE = ORDERDATE;
        this.STATUS = STATUS;
        this.QTR_ID = QTR_ID;
        this.MONTH_ID = MONTH_ID;
        this.YEAR_ID = YEAR_ID;
        this.PRODUCTLINE = PRODUCTLINE;
        this.MSRP = MSRP;
        this.PRODUCTCODE = PRODUCTCODE;
        this.CUSTOMERNAME = CUSTOMERNAME;
        this.PHONE = PHONE;
        this.ADDRESSLINE1 = ADDRESSLINE1;
        this.ADDRESSLINE2 = ADDRESSLINE2;
        this.CITY = CITY;
        this.STATE = STATE;
        this.POSTALCODE = POSTALCODE;
        this.COUNTRY = COUNTRY;
        this.TERRITORY = TERRITORY;
        this.CONTACTLASTNAME = CONTACTLASTNAME;
        this.CONTACTFIRSTNAME = CONTACTFIRSTNAME;
        this.DEALSIZE = DEALSIZE;
    }

    public void setORDERNUMBER(String ORDERNUMBER) {
        this.ORDERNUMBER = ORDERNUMBER;
    }

    public void setQUANTITYORDERED(int QUANTITYORDERED) {
        this.QUANTITYORDERED = QUANTITYORDERED;
    }

    public void setPRICEEACH(float PRICEEACH) {
        this.PRICEEACH = PRICEEACH;
    }

    public void setORDERLINENUMBER(int ORDERLINENUMBER) {
        this.ORDERLINENUMBER = ORDERLINENUMBER;
    }

    public void setSALES(float SALES) {
        this.SALES = SALES;
    }

    public void setORDERDATE(String ORDERDATE) {
        this.ORDERDATE = ORDERDATE;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public void setQTR_ID(int QTR_ID) {
        this.QTR_ID = QTR_ID;
    }

    public void setMONTH_ID(int MONTH_ID) {
        this.MONTH_ID = MONTH_ID;
    }

    public void setYEAR_ID(int YEAR_ID) {
        this.YEAR_ID = YEAR_ID;
    }

    public void setPRODUCTLINE(String PRODUCTLINE) {
        this.PRODUCTLINE = PRODUCTLINE;
    }

    public void setMSRP(int MSRP) {
        this.MSRP = MSRP;
    }

    public void setPRODUCTCODE(String PRODUCTCODE) {
        this.PRODUCTCODE = PRODUCTCODE;
    }

    public void setCUSTOMERNAME(String CUSTOMERNAME) {
        this.CUSTOMERNAME = CUSTOMERNAME;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public void setADDRESSLINE1(String ADDRESSLINE1) {
        this.ADDRESSLINE1 = ADDRESSLINE1;
    }

    public void setADDRESSLINE2(String ADDRESSLINE2) {
        this.ADDRESSLINE2 = ADDRESSLINE2;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public void setPOSTALCODE(String POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public void setTERRITORY(String TERRITORY) {
        this.TERRITORY = TERRITORY;
    }

    public void setCONTACTLASTNAME(String CONTACTLASTNAME) {
        this.CONTACTLASTNAME = CONTACTLASTNAME;
    }

    public void setCONTACTFIRSTNAME(String CONTACTFIRSTNAME) {
        this.CONTACTFIRSTNAME = CONTACTFIRSTNAME;
    }

    public void setDEALSIZE(String DEALSIZE) {
        this.DEALSIZE = DEALSIZE;
    }

    public String getORDERNUMBER() {
        return ORDERNUMBER;
    }

    public int getQUANTITYORDERED() {
        return QUANTITYORDERED;
    }

    public float getPRICEEACH() {
        return PRICEEACH;
    }

    public int getORDERLINENUMBER() {
        return ORDERLINENUMBER;
    }

    public float getSALES() {
        return SALES;
    }

    public String getORDERDATE() {
        return ORDERDATE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public int getQTR_ID() {
        return QTR_ID;
    }

    public int getMONTH_ID() {
        return MONTH_ID;
    }

    public int getYEAR_ID() {
        return YEAR_ID;
    }

    public String getPRODUCTLINE() {
        return PRODUCTLINE;
    }

    public int getMSRP() {
        return MSRP;
    }

    public String getPRODUCTCODE() {
        return PRODUCTCODE;
    }

    public String getCUSTOMERNAME() {
        return CUSTOMERNAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public String getADDRESSLINE1() {
        return ADDRESSLINE1;
    }

    public String getADDRESSLINE2() {
        return ADDRESSLINE2;
    }

    public String getCITY() {
        return CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public String getPOSTALCODE() {
        return POSTALCODE;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public String getTERRITORY() {
        return TERRITORY;
    }

    public String getCONTACTLASTNAME() {
        return CONTACTLASTNAME;
    }

    public String getCONTACTFIRSTNAME() {
        return CONTACTFIRSTNAME;
    }

    public String getDEALSIZE() {
        return DEALSIZE;
    }

    @Override
    public String toString() {
        return "  " + getORDERNUMBER() + "  " + getQUANTITYORDERED() + "  " + getPRICEEACH() + "  " + getORDERLINENUMBER() + "  " + getSALES() + "  " + getORDERDATE() + "  " +
                getSTATUS() + "  " + getQTR_ID() + "  " + getMONTH_ID() + "  " + getYEAR_ID() + "  " + getPRODUCTLINE() + "  " + getMSRP() + "  " + getPRODUCTCODE() + "  " + getCUSTOMERNAME() +
                "  " + getPHONE() + "  " + getADDRESSLINE1() + "  " + getADDRESSLINE2() + "  " + getCITY() + "  " + getSTATE() + "  " + getPOSTALCODE() + "  " + getCOUNTRY() + "  " +
                getTERRITORY() + "  " + getCONTACTLASTNAME() + "  " + getCONTACTFIRSTNAME() + "  " + getDEALSIZE();
    }

    public static List<Ventas> leerSalesData (){
        String csvFile = "sales_data.csv";
        String line = "";
        String cvsSplitBy = ",";

        List<Ventas> ventas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            ventas = br.lines().skip(1) // Saltar la primera línea si es un encabezado
                    .map(linea -> {
                        String[] datos = linea.split(cvsSplitBy);
                        Ventas venta = new Ventas(datos[0], Integer.parseInt(datos[1]), Float.parseFloat(datos[2]), Integer.parseInt(datos[3]), Float.parseFloat(datos[4]), datos[5], datos[6], Integer.parseInt(datos[7]), Integer.parseInt(datos[8]), Integer.parseInt(datos[9]), datos[10], Integer.parseInt(datos[11]), datos[12], datos[13], datos[14], datos[15], datos[16], datos[17], datos[18], datos[19], datos[20], datos[21], datos[22], datos[23], datos[24]);
                        return venta;
                    }).collect(Collectors.toList());
            //ventas.forEach(System.out :: println);
        } catch (IOException io) {
            System.err.println("Error de lectura: " + io.getMessage());
        }
        return ventas;
    }

    public static List<Ventas> coleccionVentasNY (List <Ventas> ventas, Predicate <Ventas> predicate){
        List <Ventas> ventasfiltradasNY = new ArrayList<>();
        for(Ventas ventasNY : ventas){
            if(predicate.test(ventasNY)){
                ventasfiltradasNY.add(ventasNY);
            }
        }
        return ventasfiltradasNY;
    }

    public static void sumaVentas(List<Ventas> ventas) {
        float sumaVentas = 0;
        for (Ventas ventasFiltadasNYC : ventas) {
            sumaVentas += ventasFiltadasNYC.getSALES();
        }
        System.out.println("La suma de todas las ventas de la ciudad de NY es: " + "$"+sumaVentas);
    }
    public static void sumaAutos(List<Ventas> ventas) {
        int sumaAutos = 0;
        for (Ventas ventasAutos : ventas) {
            sumaAutos += ventasAutos.getQUANTITYORDERED();
        }
        System.out.println("La suma de todos los autos clásicos de la ciudad de NY es: " + sumaAutos + " autos.");
    }

    public static void totalVentas (List<Ventas> ventas) {
        int cantidadVentas = ventas.size();
        System.out.println("El total de ventas fue: " + cantidadVentas);
    }

    public static void sumaMotos(List<Ventas> ventas) {
        int sumaMotos = 0;
        for (Ventas ventasMotos : ventas) {
            sumaMotos += ventasMotos.getQUANTITYORDERED();
        }
        System.out.println("La suma de todos los motocicletas de la ciudad de NY es: " + sumaMotos + " motocicletas.");
    }

    public static void sumaVentasMotos(List<Ventas> ventas) {
        float sumaVentas = 0;
        for (Ventas ventasFiltadasNYC : ventas) {
            sumaVentas += ventasFiltadasNYC.getSALES();
        }
        System.out.println("La suma de todas las motocicletas de la ciudad de NY es: " + "$"+sumaVentas);
    }

    public static void clientemasCompras(List<Ventas> ventas){
       

        Optional<Map.Entry<String, Long>> clienteMaximo = ventas.stream()
                .collect(Collectors.groupingBy(Ventas::getCUSTOMERNAME, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .findFirst();

        String clienteIdMaximo = clienteMaximo.isPresent() ? clienteMaximo.get().getKey() : null;

        System.out.println("El cliente que más compró en total es: " + clienteIdMaximo);
    }

    public static void clienteMenosCompras(List<Ventas> ventas){
        Optional<Map.Entry<String, Long>> clienteMinimo = ventas.stream()
                .collect(Collectors.groupingBy(Ventas::getCUSTOMERNAME, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue())
                .findFirst();

        String clienteIdMinimo = clienteMinimo.isPresent() ? clienteMinimo.get().getKey() : null;

        System.out.println("El cliente que menos compró en total es: " + clienteIdMinimo);
    }

    public static void clientemasComprasNY(List<Ventas> ventas){
        // Suponiendo que tienes una lista de objetos Producto llamada "productos"

        Optional<Map.Entry<String, Long>> clienteMaximo = ventas.stream()
                .collect(Collectors.groupingBy(Ventas::getCUSTOMERNAME, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .findFirst();

        String clienteIdMaximo = clienteMaximo.isPresent() ? clienteMaximo.get().getKey() : null;

        System.out.println("El cliente que más compró en NY total es: " + clienteIdMaximo);
    }



}



