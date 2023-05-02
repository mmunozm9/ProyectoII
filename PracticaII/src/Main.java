import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Ventas> ventasTotales = Ventas.leerSalesData();

        //1. Colección de ventas de la ciudad de New York.

        Predicate<Ventas> ventasNY = coleccionNY -> coleccionNY.getCITY().equals("NYC");
        List<Ventas> ventasNYC = Ventas.coleccionVentasNY(ventasTotales, ventasNY);
        System.out.println("COLECCIÓN DE VENTAS DE NEW YORK: " +" \n ");
        for (Ventas P : ventasNYC) {
            System.out.println("  "+ P.getORDERNUMBER() + "  " + P.getQUANTITYORDERED() + "  " + P.getPRICEEACH() + "  " + P.getORDERLINENUMBER() + "  " + P.getSALES() + "  " + P.getORDERDATE() + "  " +
                    P.getSTATUS() + "  " + P.getQTR_ID() + "  " + P.getMONTH_ID() + "  " + P.getYEAR_ID() + "  " + P.getPRODUCTLINE() + "  " + P.getMSRP() + "  " + P.getPRODUCTCODE() + "  " + P.getCUSTOMERNAME() +
                    "  " + P.getPHONE() + "  " + P.getADDRESSLINE1() + "  " + P.getADDRESSLINE2() + "  " + P.getCITY() + "  " + P.getSTATE() + "  " + P.getPOSTALCODE() + "  " + P.getCOUNTRY() + "  " +
                    P.getTERRITORY() + "  " + P.getCONTACTLASTNAME() + "  " + P.getCONTACTFIRSTNAME() + "  " + P.getDEALSIZE()  );

        }

        // 2. ¿Cuánto fue el total de ventas de New York?

        Ventas.sumaVentas(ventasNYC);

        Predicate<Ventas> ventasNYAutos = coleccionNY -> coleccionNY.getPRODUCTLINE().equals("Classic Cars");
        List<Ventas> ventasNYCAutos = Ventas.coleccionVentasNY(ventasNYC, ventasNYAutos);

        // 3. ¿Cuántos autos clásicos vendió New York
        Ventas.sumaAutos(ventasNYCAutos);

        // 4.¿Cuánto fue el total de ventas de Autos Clásicos en New York?
        Ventas.totalVentas(ventasNYCAutos);

        // 5. ¿Cuántas Motocicletas vendió New York?
        Predicate<Ventas> ventasNYMotos = coleccionNY -> coleccionNY.getPRODUCTLINE().equals("Motorcycles");
        List<Ventas> ventasNYCMotos = Ventas.coleccionVentasNY(ventasNYC, ventasNYMotos);
        Ventas.sumaMotos(ventasNYCMotos);

        // 6. ¿Cuánto fue el total de ventas de Motocicletas en New York?
        Ventas.sumaVentasMotos(ventasNYCMotos);

        // 7. ¿Cuál fue el cliente de New York qué más autos compró?
        Ventas.clientemasComprasNY(ventasNYCAutos);

        // 8. ¿Cuál fue el cliente de todo el archivo qué más compró?
        Ventas.clientemasCompras(ventasTotales);

        // 9. ¿Cuál fue el cliente de todo el archivo qué menos compró?
        Ventas.clienteMenosCompras(ventasTotales);


    }

}






